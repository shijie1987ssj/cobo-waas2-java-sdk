

# StakingsExtra


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**poolType** | **StakingPoolType** |  |  |
|**posChain** | **String** | The Proof-of-Stake (PoS) chain. |  |
|**unlockTimestamp** | **Long** | The estimated time when the bitcoins will be unlocked, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**unlockBlockHeight** | **Long** | The block height at which the bitcoins will be unlocked. |  [optional] |
|**stakeAddress** | **String** | The address receiving the staked bitcoins. |  [optional] |
|**unbondAddress** | **String** | The address receiving the unlocked bitcoins. |  [optional] |
|**beaconValidators** | [**List&lt;EthStakingExtraAllOfBeaconValidators&gt;**](EthStakingExtraAllOfBeaconValidators.md) | The list of validator information. |  [optional] |
|**stakerAddress** | **String** | The staker&#39;s Bitcoin address. |  |
|**validatorAddress** | **String** | The validator&#39;s EVM address. |  |
|**rewardAddress** | **String** | The EVM address to receive staking rewards. |  |
|**timelock** | **Integer** | The Unix timestamp (in seconds) when the staking position will be unlocked and available for withdrawal. |  |



