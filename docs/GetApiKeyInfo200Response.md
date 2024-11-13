

# GetApiKeyInfo200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The API key name. |  |
|**curveType** | [**CurveTypeEnum**](#CurveTypeEnum) | The curve type used for the API key, which determines the cryptographic algorithm for key generation and signing. Possible values include: - &#x60;ED25519&#x60;: Ed25519 - &#x60;SECP256K1&#x60;: Secp256k1  |  |
|**key** | **String** | The API key value. |  |
|**callbackUrl** | **String** | The URL of the callback endpoint that receives callback messages triggered by this API key. |  [optional] |
|**validIps** | **List&lt;String&gt;** | (Applicable to permanent API keys only) The list of IP addresses that are allowed to use this API key. |  [optional] |
|**createdTimestamp** | **Long** | The time when the API key was registered, in Unix timestamp format, measured in milliseconds. |  |
|**updatedTimestamp** | **Long** | The time when the API key information was last updated, in Unix timestamp format, measured in milliseconds. |  |
|**expiredTimestamp** | **Long** | The time when the API key expires, in Unix timestamp format, measured in milliseconds. For permanent API keys, this property value is &#x60;null&#x60;. |  [optional] |
|**roleScopes** | [**List&lt;RoleScopes&gt;**](RoleScopes.md) | The list of user roles and wallet scopes associated with the API key. |  [optional] |



## Enum: CurveTypeEnum

| Name | Value |
|---- | -----|
| ED25519 | &quot;ED25519&quot; |
| SECP256K1 | &quot;SECP256K1&quot; |



