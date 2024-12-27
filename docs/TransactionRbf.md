

# TransactionRbf

The information about the request to drop or to speed up transactions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | The request ID that is used to track a transaction request. The request ID is provided by you and must be unique within your organization. |  |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  |
|**source** | [**TransactionRbfSource**](TransactionRbfSource.md) |  |  [optional] |
|**categoryNames** | **List&lt;String&gt;** | The custom category for you to identify your transactions. |  [optional] |
|**description** | **String** | The description of the RBF transaction. |  [optional] |
|**autoFuel** | **AutoFuelType** |  |  [optional] |



