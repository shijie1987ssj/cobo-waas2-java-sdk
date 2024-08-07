

# Stakings

The staking info.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The unique id of the stake. |  |
|**walletId** | **String** | The unique wallet id. |  |
|**address** | **String** | The staker wallet address. |  |
|**amounts** | [**List&lt;AmountDetailsInner&gt;**](AmountDetailsInner.md) | The staking amount details. |  |
|**initiator** | **String** | The initiator of the stake. |  [optional] |
|**unlockTimestamp** | **Long** | The unlock time. |  [optional] |
|**unlockBlockHeight** | **Long** | The unlock block height. |  [optional] |
|**poolId** | **String** | The unique pool id. |  |
|**tokenId** | **String** | The token id. |  |
|**posChain** | **String** | The pos chain of the stake. |  [optional] |
|**rewardsInfo** | **Object** | The rewards info of the stake. |  [optional] |
|**createdTimestamp** | **Long** | The time when the stake was created. |  |
|**updatedTimestamp** | **Long** | The time when the stake was last updated. |  |
|**validatorInfo** | [**StakingsValidatorInfo**](StakingsValidatorInfo.md) |  |  |



