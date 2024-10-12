package com.cobo.waas2.demo;

import com.cobo.waas2.ApiSigner;
import com.cobo.waas2.CryptoUtils;

import java.nio.charset.StandardCharsets;


public class LocalSigner implements ApiSigner {
    private final String secret;

    public LocalSigner(String privKey) {
        secret = privKey;
    }

    @Override
    public String sign(byte[] message) {
        return sign(new String(message, StandardCharsets.UTF_8));
    }

    @Override
    public String sign(String message) {
        return CryptoUtils.sign(secret, message);
    }

    @Override
    public String getPublicKey() {
        return CryptoUtils.getPublicKey(secret);
    }
}