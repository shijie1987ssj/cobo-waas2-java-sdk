package com.cobo.waas2.demo;

import com.cobo.waas2.ApiSigner;
import com.cobo.waas2.CryptoUtils;
import org.apache.commons.lang3.StringUtils;


public class LocalSigner implements ApiSigner {
    private final String secret;

    public LocalSigner(String privKey) {
        System.out.println("构建 LocalSigner >>>>>>>>" + StringUtils.left(privKey, 4) + "..." + StringUtils.right(privKey, 4));
        secret = privKey;
    }

    @Override
    public String sign(byte[] message) {
        return CryptoUtils.sign(secret, new String(message));
    }

    @Override
    public String getPublicKey() {
        return CryptoUtils.getPublicKey(secret);
    }
}