

# GetStakingEstimationFeeRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**activityType** | **ActivityType** |  |  |
|**requestId** | **String** | The request ID that is used to track a request. The request ID is provided by you and must be unique within your organization. |  [optional] |
|**source** | [**StakingSource**](StakingSource.md) |  |  [optional] |
|**poolId** | **StakingPoolId** |  |  |
|**amount** | **String** | The amount to withdraw. |  |
|**fee** | [**TransactionRequestFee**](TransactionRequestFee.md) |  |  |
|**extra** | [**CreateUnstakeActivityExtra**](CreateUnstakeActivityExtra.md) |  |  [optional] |
|**stakingId** | **String** | The ID of the staking position. You can retrieve a list of staking positions by calling [List staking positions](/v2/api-references/stakings/list-staking-positions). |  |



