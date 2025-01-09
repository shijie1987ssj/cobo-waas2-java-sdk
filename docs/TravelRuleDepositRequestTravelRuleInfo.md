

# TravelRuleDepositRequestTravelRuleInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationWalletType** | **DestinationWalletType** |  |  |
|**vendorCode** | **String** | The vendor code for exchanges or VASPs. |  |
|**vendorVaspId** | **String** | The unique identifier of the VASP. |  |
|**vendorVaspName** | **String** | The vendor name to be provided when selecting \&quot;Others\&quot; as the VASP case. This field allows customers to specify the name of a vendor not listed. |  [optional] |
|**entityInfo** | [**TravelRuleDepositExchangesOrVASPEntityInfo**](TravelRuleDepositExchangesOrVASPEntityInfo.md) |  |  |
|**selfCustodyWalletChallenge** | **String** | The challenge obtained from a previous operation. |  |
|**selfCustodyWalletAddress** | **String** | The address of the self-custodial wallet. |  |
|**selfCustodyWalletSign** | **String** | The signed message from the self-custodial wallet. |  |



