

# SelfCustodyWallet

Required information when depositing from or withdrawing to a self-custody wallet.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationWalletType** | **DestinationWalletType** |  |  |
|**selfCustodyWalletChallenge** | **String** | The message obtained from the &#x60;Retrieve transaction limitations&#x60; operation. This message is used to verify wallet ownership through signing. |  |
|**selfCustodyWalletAddress** | **String** | The address of the self-custody wallet. |  |
|**selfCustodyWalletSign** | **String** | The signature created by signing the challenge message with the wallet&#39;s private key. |  |



