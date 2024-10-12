package com.cobo.waas2;

/***
 *
 */
public interface ApiSigner {
    String sign(byte[] message);

    String getPublicKey();
}
