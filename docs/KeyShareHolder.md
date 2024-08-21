

# KeyShareHolder

The data for MPC Wallets' key share holder information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The key share holder name. |  [optional] |
|**type** | **KeyShareHolderType** |  |  [optional] |
|**tssNodeId** | **String** | The key share holder&#39;s TSS Node ID. |  [optional] |
|**online** | **Boolean** | Whether the key share holder&#39;s TSS Node is online. - &#x60;true&#x60;: The TSS Node is online.  - &#x60;false&#x60;: The TSS Node is offline.  |  [optional] |
|**signer** | **Boolean** | Whether the key share holder&#39;s TSS Node is a designated transaction signer. - &#x60;true&#x60;: The TSS Node is a designated transaction signer.  - &#x60;false&#x60;: The TSS Node is not a designated transaction signer.  |  [optional] |
|**status** | **KeyShareHolderStatus** |  |  [optional] |
|**accountId** | **String** | The key share holder&#39;s Cobo Portal account ID. |  [optional] |



