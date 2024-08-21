

# RefreshToken200Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accessToken** | **String** | The new access token. |  [optional] |
|**tokenType** | **String** | The type of the tokens, which is Bearer. |  [optional] |
|**scope** | **String** | The scope of the access token to limit the app&#39;s access to the organization&#39;s resources. **Note**: Currently this property value is empty. The scope of the access token is based on the permissions granted when the app user installs the app.  |  [optional] |
|**expiresIn** | **Integer** | The time in seconds in which the new access token expires. |  [optional] |
|**refreshToken** | **String** | The refresh token, used to obtain another access token when the new access token expires. |  [optional] |



