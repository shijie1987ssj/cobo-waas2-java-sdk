

# TravelRuleDepositRequestTravelRuleInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationWalletType** | **DestinationWalletType** |  |  |
|**vendorCode** | **String** | The vendor code of the VASP. |  |
|**vendorVaspId** | **String** | The unique identifier of the VASP. |  |
|**vendorVaspName** | **String** | The vendor name. Use this field to specify the name of a vendor not listed. |  [optional] |
|**entityInfo** | [**TravelRuleDepositExchangesOrVASPEntityInfo**](TravelRuleDepositExchangesOrVASPEntityInfo.md) |  |  |
|**selfCustodyWalletChallenge** | **String** | The message obtained from the &#x60;Retrieve transaction limitations&#x60; operation. This message is used to verify wallet ownership through signing. |  |
|**selfCustodyWalletAddress** | **String** | The address of the self-custody wallet. |  |
|**selfCustodyWalletSign** | **String** | The signature created by signing the challenge message with the wallet&#39;s private key. |  |



