

# GetTransactionLimitation200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**vaspList** | [**List&lt;Vasp&gt;**](Vasp.md) | A list of VASPs (Virtual Asset Service Providers) associated with the token. |  [optional] |
|**isThresholdReached** | **Boolean** | Indicates whether the transaction amount exceeds a predefined threshold. - **If &#x60;true&#x60;**: Additional information is required when filling Travel Rule details:   - For deposits: &#x60;date_of_incorporation&#x60; and &#x60;place_of_incorporation&#x60;. - **If &#x60;false&#x60;**: No extra fields are required.  |  [optional] |
|**selfCustodyWalletChallenge** | **String** | A human-readable, time-sensitive message to be signed by the wallet owner.  The message contains key details including the wallet address, a unique nonce, and a timestamp. Signing this message confirms ownership of the wallet and allows the operation to proceed.  |  [optional] |
|**connectWalletList** | **List&lt;String&gt;** | A list of wallets connected to the system for transactions. |  [optional] |



