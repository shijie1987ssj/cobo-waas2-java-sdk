package com.cobo.waas2.auth;

public interface Signer {
    /***
     *
     * @param message hashed message
     * @return signature in hex format
     */
    String sign(byte[] message);

    /***
     *
     * @return compressed public key in hex format
     */
    String getPublicKey();
}
