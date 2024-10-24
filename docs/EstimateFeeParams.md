

# EstimateFeeParams


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. It is recommended to use the same request ID as the transaction for which you want to estimate the transaction fee. |  |
|**requestType** | **EstimateFeeRequestType** |  |  |
|**source** | [**ContractCallSource**](ContractCallSource.md) |  |  |
|**tokenId** | **String** | The token ID of the transferred token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](/v2/api-references/wallets/list-enabled-tokens). |  |
|**destination** | [**ContractCallDestination**](ContractCallDestination.md) |  |  |
|**feeType** | **FeeType** |  |  [optional] |
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](/v2/api-references/wallets/list-enabled-chains). |  |



