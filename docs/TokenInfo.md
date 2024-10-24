

# TokenInfo

The token information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tokenId** | **String** | The token ID, which is the unique identifier of a token. You can retrieve the IDs of all the tokens you can use by calling [List enabled tokens](/v2/api-references/wallets/list-enabled-tokens). |  |
|**chainId** | **String** | The ID of the chain on which the token operates. |  |
|**assetId** | **String** | (This concept applies to Exchange Wallets only) The asset ID. An asset ID is the unique identifier of the asset held within your linked exchange account. |  [optional] |
|**symbol** | **String** | The token symbol, which is the abbreviated name of a token. |  [optional] |
|**name** | **String** | The token name, which is the full name of a token. |  [optional] |
|**decimal** | **Integer** | The token decimal. |  [optional] |
|**iconUrl** | **String** | The URL of the token icon. |  [optional] |
|**tokenAddress** | **String** | The token address, if applicable. |  [optional] |
|**feeTokenId** | **String** | The fee token ID. A fee token is the token with which you pay transaction fees. |  [optional] |
|**canDeposit** | **Boolean** | Whether deposits are enabled for this token. |  [optional] |
|**canWithdraw** | **Boolean** | Whether withdrawals are enabled for this token. |  [optional] |
|**dustThreshold** | **String** | The minimum withdrawal amount for Custodial Wallets. If your withdrawal amount is smaller than this threshold, the withdrawal request will receive an error.  Note: [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop) transfers do not have this limitation.  |  [optional] |
|**custodialMinimumDepositThreshold** | **String** | The minimum deposit amount for Custodial Wallets. If the amount you deposit to a Custodial Wallet is smaller than this threshold, the deposit will not show up on Cobo Portal or trigger any webhook events.  Note: [Cobo Loop](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop)transfers do not have this limitation.  |  [optional] |
|**assetModelType** | **TokenAssetModelType** |  |  [optional] |



