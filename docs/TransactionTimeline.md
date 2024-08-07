

# TransactionTimeline

The information about transaction timeline, which lists all statuses that the transaction passes through with timestamps indicating when each status is completed.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | **TransactionStatus** |  |  [optional] |
|**finished** | **Boolean** | Whether the transaction status is completed:   - &#x60;true&#x60;: The transaction status is completed.   - &#x60;false&#x60;: The transaction is currently in the status.  |  [optional] |
|**finishedTimestamp** | **Long** | The time when the transaction status is completed in Unix timestamp format, measured in milliseconds. |  [optional] |



