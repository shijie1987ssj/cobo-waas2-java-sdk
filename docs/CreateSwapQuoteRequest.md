

# CreateSwapQuoteRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**walletId** | **UUID** | The unique identifier of the wallet. |  |
|**payTokenId** | **String** | Unique id of the token to pay. |  |
|**receiveTokenId** | **String** | Unique id of the token to receive. |  |
|**payAmount** | **String** | Amount of tokens to pay. For example \&quot;0.5 BTC\&quot;. Note: Either pay_amount or receive_amount must be provided, but not both.  |  [optional] |
|**receiveAmount** | **String** | Amount of tokens to receive. For example \&quot;0.5 ETH_WBTC\&quot;. Note: Either pay_amount or receive_amount must be provided, but not both.  |  [optional] |



