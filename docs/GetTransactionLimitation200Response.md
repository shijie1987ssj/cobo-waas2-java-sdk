

# GetTransactionLimitation200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaspList** | [**List&lt;Vasp&gt;**](Vasp.md) | A list of virtual asset service providers (VASP) you can select as the transaction source or destination. |  [optional] |
|**isThresholdReached** | **Boolean** | Indicates whether the transaction amount exceeds a predefined threshold. If exceeded, additional information is required when filling Travel Rule details. - &#x60;true&#x60;: Threshold exceeded. - &#x60;false&#x60;: Threshold not exceeded.  |  [optional] |
|**selfCustodyWalletChallenge** | **String** | A human-readable, time-sensitive message to be signed by the wallet owner. The message contains key information including the wallet address, a unique nonce, and a timestamp. Signing this message confirms ownership of the wallet and allows the operation to proceed.  |  [optional] |
|**connectWalletList** | **List&lt;String&gt;** | A list of self-custody wallet providers you can select as the transaction source or destination. |  [optional] |



