

# Activity

The staking activity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique id of the activity. |  [optional] |
|**initiator** | **String** | The initiator of the activity. |  [optional] |
|**type** | **ActivityType** |  |  [optional] |
|**walletId** | **String** | The id of the wallet to stake. |  [optional] |
|**address** | **String** | The staker wallet address. |  [optional] |
|**poolId** | **String** | The id of the staking pool. |  |
|**tokenId** | **String** | The id of the token. |  |
|**stakingId** | **String** | The id of the related staking. |  [optional] |
|**amount** | **String** | The amount of the activity. |  |
|**transactionIds** | **List&lt;String&gt;** | The related txs of the activity. |  [optional] |
|**timeline** | [**List&lt;ActivityTimeline&gt;**](ActivityTimeline.md) | The timeline of the activity. |  [optional] |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  [optional] |
|**status** | **ActivityStatus** |  |  |
|**createdTimestamp** | **Long** | The time when the activity was created. |  [optional] |
|**updatedTimestamp** | **Long** | The time when the activity was last updated. |  [optional] |



