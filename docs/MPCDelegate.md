

# MPCDelegate

The information about the MPC Wallet as the Delegate. You can call the [List Delegates](https://www.cobo.com/developers/v2/api-references/wallets--smart-contract-wallets/list-delegates) operation to retrieve the applicable Delegates.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**delegateType** | **CoboSafeDelegateType** |  |  |
|**walletId** | **UUID** | The wallet ID of the Delegate. This is required when initiating a transfer or contract call from Smart Contract Wallets (Safe{Wallet}). |  |
|**address** | **String** | The wallet address of the Delegate. This is required when initiating a transfer or contract call from Smart Contract Wallets (Safe{Wallet}). |  |



