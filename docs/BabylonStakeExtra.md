

# BabylonStakeExtra


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**poolType** | **StakingPoolType** |  |  |
|**finalityProviderPublicKey** | **String** | The public key of finality provider. |  |
|**stakeBlockTime** | **Long** | The stake block time. |  |
|**onlySign** | **Boolean** | Whether to only sign transactions. Default is &#x60;false&#x60;, if set to &#x60;true&#x60;,  the transaction will not be submitted to the blockchain automatically. You can call &#x60;Broadcast transactions&#x60; to submit the transaction to the blockchain,  Or you can find the signed raw_tx by &#x60;Get transaction information&#x60; and broadcast it yourself.  |  [optional] |



