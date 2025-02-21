

# CreateAddressRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**chainId** | **String** | The chain ID, which is the unique identifier of a blockchain. You can retrieve the IDs of all the chains you can use by calling [List enabled chains](https://www.cobo.com/developers/v2/api-references/wallets/list-enabled-chains). |  |
|**count** | **Integer** | The number of addresses to create. This property will be ignored if you are tweaking Taproot address(es). |  |
|**taprootScriptTreeHashes** | **List&lt;String&gt;** | The information about the new address. This parameter is required only if you want to generate a tweaked address. |  [optional] |
|**taprootInternalAddress** | **String** | The address you want to tweak. This parameter is required only if you want to generate a tweaked address. |  [optional] |
|**encoding** | **AddressEncoding** |  |  [optional] |



