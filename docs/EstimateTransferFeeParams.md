

# EstimateTransferFeeParams

The information about a token transfer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. It is recommended to use the same request ID as the transaction for which you want to estimate the transaction fee. |  [optional] |
|**requestType** | **EstimateFeeRequestType** |  |  |
|**source** | [**TransferSource**](TransferSource.md) |  |  |
|**tokenId** | **String** | The token ID of the transferred token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-tokens). |  |
|**destination** | [**TransferDestination**](TransferDestination.md) |  |  [optional] |
|**feeType** | **FeeType** |  |  [optional] |



