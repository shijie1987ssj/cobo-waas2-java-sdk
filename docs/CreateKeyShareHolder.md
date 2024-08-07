

# CreateKeyShareHolder

When creating MainKeyGroup and SigningKeyGroup, the Cobo key share holder will be added automatically.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | Key share holder&#39;s name. |  [optional] |
|**type** | **KeyShareHolderType** |  |  [optional] |
|**tssNodeId** | **String** | Key share holder&#39;s TSS Node ID. |  [optional] |
|**signer** | **Boolean** | Whether the key share holder&#39;s TSS Node is a designated transaction signer. - &#x60;true&#x60;: The TSS Node is a designated transaction signer.  - &#x60;false&#x60;: The TSS Node is not a designated transaction signer.  |  [optional] |



