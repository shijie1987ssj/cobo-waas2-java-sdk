

# ExchangeTransferDestination

The information about the transaction destination type `ExchangeWallet`.   An Exchange Wallet (Sub Account) as the transaction destination can only receives token transfers from another Exchange Wallet. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**destinationType** | **TransferDestinationType** |  |  |
|**walletId** | **UUID** | The wallet ID. |  |
|**subWalletId** | **String** | The exchange trading account or the sub-wallet ID. |  |
|**amount** | **String** | The quantity of the token in the transaction. For example, if you trade 1.5 ETH, then the value is &#x60;1.5&#x60;.  |  |



