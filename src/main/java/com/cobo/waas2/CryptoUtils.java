package com.cobo.waas2;

import net.i2p.crypto.eddsa.*;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import net.i2p.crypto.eddsa.spec.EdDSANamedCurveTable;
import net.i2p.crypto.eddsa.spec.EdDSAParameterSpec;
import net.i2p.crypto.eddsa.spec.EdDSAPrivateKeySpec;
import net.i2p.crypto.eddsa.spec.EdDSAPublicKeySpec;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.InvalidKeySpecException;

/**
 * This class provides cryptographic utilities for signing content,
 * generating key pairs, and converting keys to/from hex format.
 */
public class CryptoUtils {

    /**
     * Signs the given content using the specified private key.
     *
     * @param privateKey the private key in hex format
     * @param content the content to sign
     * @return the signature in hex format
     */
    public static String sign(String privateKey, String content) {
        try {
            EdDSAParameterSpec spec = EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519);
            Signature signature = new EdDSAEngine(MessageDigest.getInstance(spec.getHashAlgorithm()));
            EdDSAPrivateKeySpec privKey = new EdDSAPrivateKeySpec(Utils.hexToBytes(privateKey), spec);
            PrivateKey sKey = new EdDSAPrivateKey(privKey);
            signature.initSign(sKey);
            signature.update(hashTwice(content));
            return Utils.bytesToHex(signature.sign());
        } catch (InvalidKeyException | SignatureException | NoSuchAlgorithmException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean verifySignature(String message, String publicKeyHex, String signatureHex) {
        try {
            // Convert hex strings to byte arrays
            byte[] publicKeyBytes = Utils.hexToBytes(publicKeyHex);
            byte[] signatureBytes = Utils.hexToBytes(signatureHex);

            // Create EdDSA public key
            EdDSAParameterSpec spec = EdDSANamedCurveTable.getByName("Ed25519");
            EdDSAPublicKeySpec pubKeySpec = new EdDSAPublicKeySpec(publicKeyBytes, spec);
            EdDSAPublicKey publicKey = new EdDSAPublicKey(pubKeySpec);

            // Initialize the signature verifier
            EdDSAEngine edDSAEngine = new EdDSAEngine();
            edDSAEngine.initVerify(publicKey);

            // Update the engine with the message bytes
            edDSAEngine.update(hashTwice(message));

            // Verify the signature
            return edDSAEngine.verify(signatureBytes);
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            e.printStackTrace();
            return false;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Hashes the given string twice using SHA-256.
     *
     * @param str the string to hash
     * @return the double-hashed bytes
     * @throws NoSuchAlgorithmException if SHA-256 algorithm is not available
     * @throws UnsupportedEncodingException if UTF-8 encoding is not supported
     */
    public static byte[] hashTwice(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
        return messageDigest.digest(messageDigest.digest());
    }

    /**
     * Derives the public key from the given private key.
     *
     * @param privateKey the private key in hex format
     * @return the derived public key in hex format
     */
    public static String getPublicKey(String privateKey) {
        EdDSAParameterSpec spec = EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519);
        EdDSAPrivateKeySpec privKey = new EdDSAPrivateKeySpec(Utils.hexToBytes(privateKey), spec);
        return Utils.bytesToHex(privKey.getA().toByteArray());
    }

    /**
     * A class representing a key pair with private and public keys in hex format.
     */
    public static class KeyPairHex {
        private final String privateKey;
        private final String publicKey;

        public KeyPairHex(String privateKey, String publicKey) {
            this.privateKey = privateKey;
            this.publicKey = publicKey;
        }

        public String getPrivateKey() {
            return privateKey;
        }

        public String getPublicKey() {
            return publicKey;
        }
    }

    /**
     * Generates a new key pair and returns it as a KeyPairHex object.
     *
     * @return the generated key pair with keys in hex format
     * @throws InvalidAlgorithmParameterException if the algorithm parameters are invalid
     */
    public static KeyPairHex generateKeyPair() throws InvalidAlgorithmParameterException {
        EdDSAParameterSpec spec = EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519);
        KeyPairGenerator keyPairGenerator = new KeyPairGenerator();
        keyPairGenerator.initialize(spec, new SecureRandom());
        KeyPair key = keyPairGenerator.generateKeyPair();
        return new KeyPairHex(
                Utils.bytesToHex(((EdDSAPrivateKey) key.getPrivate()).getSeed()),
                Utils.bytesToHex(((EdDSAPublicKey) key.getPublic()).getAbyte())
        );
    }
}
