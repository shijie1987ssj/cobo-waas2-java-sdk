

# CallbackMessage

The information about a callback message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The callback message ID. |  |
|**createdTimestamp** | **Long** | The time when the callback message was created, in Unix timestamp format, measured in milliseconds. |  |
|**updatedTimestamp** | **Long** | The time when the callback message was updated, in Unix timestamp format, measured in milliseconds. |  |
|**requestId** | **String** | The request ID of the transaction. |  |
|**transactionId** | **String** | The transaction ID. |  |
|**walletId** | **String** | The wallet ID. |  [optional] |
|**url** | **String** | The callback endpoint URL. |  |
|**data** | [**Transaction**](Transaction.md) |  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The callback message status. |  |
|**result** | [**ResultEnum**](#ResultEnum) | The callback message result. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DENIED | &quot;Denied&quot; |
| APPROVED | &quot;Approved&quot; |
| FAILED | &quot;Failed&quot; |



## Enum: ResultEnum

| Name | Value |
|---- | -----|
| OK | &quot;ok&quot; |
| DENY | &quot;deny&quot; |



