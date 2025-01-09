

# MPCVaultEventData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**dataType** | [**DataTypeEnum**](#DataTypeEnum) |  The data type of the event. - &#x60;Transaction&#x60;: The transaction event data. - &#x60;TSSRequest&#x60;: The TSS request event data. - &#x60;Addresses&#x60;: The addresses event data. - &#x60;WalletInfo&#x60;: The wallet information event data. - &#x60;MPCVault&#x60;: The MPC vault event data. |  |
|**vaultId** | **String** | The vault ID. |  [optional] |
|**projectId** | **String** | The project ID. |  [optional] |
|**name** | **String** | The vault name. |  [optional] |
|**type** | **MPCVaultType** |  |  [optional] |
|**rootPubkeys** | [**List&lt;RootPubkey&gt;**](RootPubkey.md) |  |  [optional] |
|**createdTimestamp** | **Long** | The vault&#39;s creation time in Unix timestamp format, measured in milliseconds. |  [optional] |



## Enum: DataTypeEnum

| Name | Value |
|---- | -----|
| TRANSACTION | &quot;Transaction&quot; |
| TSSREQUEST | &quot;TSSRequest&quot; |
| ADDRESSES | &quot;Addresses&quot; |
| WALLETINFO | &quot;WalletInfo&quot; |
| MPCVAULT | &quot;MPCVault&quot; |



