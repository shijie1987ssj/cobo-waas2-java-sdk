

# GetToken2XXResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | The Org Access Token. |  [optional] |
|**tokenType** | **String** | The type of the tokens, which is Bearer. |  [optional] |
|**scope** | **String** | The scope of the Org Access Token to limit the app&#39;s access to the organization&#39;s resources.  **Note**: Currently this property value is empty. The scope of the Org Access Token is based on the permissions granted when the app user installs the app.  |  [optional] |
|**expiresIn** | **Integer** | The time in seconds in which the Org Access Token expires. |  [optional] |
|**refreshToken** | **String** | The Refresh Token, used to obtain a new Org Access Token when the current Org Access Token expires. The expiration time for Refresh Tokens is currently set to 30 days and is subject to change. |  [optional] |



