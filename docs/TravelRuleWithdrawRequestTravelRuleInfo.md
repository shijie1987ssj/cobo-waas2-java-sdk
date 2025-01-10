

# TravelRuleWithdrawRequestTravelRuleInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationWalletType** | **DestinationWalletType** |  |  |
|**selfCustodyWalletChallenge** | **String** | The message obtained from the &#x60;Retrieve transaction limitations&#x60; operation. This message is used to verify wallet ownership through signing. |  |
|**selfCustodyWalletAddress** | **String** | The address of the self-custody wallet. |  |
|**selfCustodyWalletSign** | **String** | The signature created by signing the challenge message with the wallet&#39;s private key. |  |
|**vendorCode** | **String** | The vendor code of the exchange or virtual asset service provider (VASP). |  |
|**vendorVaspId** | **String** | The unique identifier of the VASP. |  |
|**entityInfo** | [**TravelRuleWithdrawExchangesOrVASPEntityInfo**](TravelRuleWithdrawExchangesOrVASPEntityInfo.md) |  |  |



