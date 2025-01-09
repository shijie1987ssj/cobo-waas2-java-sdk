

# GetStakingEstimationFee201Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**poolType** | **StakingPoolType** |  |  [optional] |
|**fee** | [**EstimatedFee**](EstimatedFee.md) |  |  [optional] |
|**validatorPubkeys** | **List&lt;String&gt;** | A list of public keys associated with the Ethereum validators for this staking operation. |  [optional] |
|**coreBtcStakingAddress** | **String** | P2WSH address generated for this staking operation(If the estimated fee is for core BTC staking). |  [optional] |
|**feeType** | **FeeType** |  |  [optional] |
|**feeAmount** | **String** | The amount of the estimated fee. |  [optional] |
|**tokenId** | **String** | The token ID of the staking fee. |  [optional] |



