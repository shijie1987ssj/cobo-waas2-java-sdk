package com.cobo.waas2.auth;

import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.sec.SECNamedCurves;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigInteger;
import java.security.Security;

public class LocalSecp256k1Signer implements Signer {
    private final BigInteger privateKey;
    private final ECPoint publicKeyPoint;
    private final ECDomainParameters ecParams;

    public LocalSecp256k1Signer(String privKey) {
        Security.addProvider(new BouncyCastleProvider());
        
        X9ECParameters params = SECNamedCurves.getByName("secp256k1");
        ecParams = new ECDomainParameters(params.getCurve(), params.getG(), params.getN(), params.getH());
        
        privateKey = new BigInteger(1, Hex.decode(privKey));
        publicKeyPoint = ecParams.getG().multiply(privateKey);
    }

    @Override
    public String sign(byte[] message) {
        ECDSASigner signer = new ECDSASigner();
        ECPrivateKeyParameters privKeyParams = new ECPrivateKeyParameters(privateKey, ecParams);
        signer.init(true, privKeyParams);
        
        BigInteger[] signature = signer.generateSignature(message);
        
        try {
            ASN1Integer r = new ASN1Integer(signature[0]);
            ASN1Integer s = new ASN1Integer(signature[1]);
            DERSequence derSignature = new DERSequence(new ASN1Integer[]{r, s});
            
            byte[] derEncodedSignature = derSignature.getEncoded();
            return Hex.toHexString(derEncodedSignature);
        } catch (Exception e) {
            throw new RuntimeException("DER encode error", e);
        }
    }

    @Override
    public String getPublicKey() {
        byte[] publicKeyBytes = publicKeyPoint.getEncoded(true);
        return Hex.toHexString(publicKeyBytes);
    }
}
