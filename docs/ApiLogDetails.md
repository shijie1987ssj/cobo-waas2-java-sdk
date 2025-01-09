

# ApiLogDetails

The information about an API log.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**logId** | **String** | A unique identifier for the API log, used for tracking. |  |
|**apiMethod** | **String** | The HTTP method used for the API request. |  |
|**apiEndpoint** | **String** | The endpoint of the API request. |  |
|**statusCode** | **Integer** | The HTTP status code returned by the API request. |  |
|**ipAddress** | **String** | The client&#39;s IP address that made the API request. |  |
|**requestTimestamp** | **Long** | The time when the API request was created, in Unix timestamp format, measured in milliseconds. |  |
|**apiKey** | **String** | The API key used to call the API. For more details, refer to [API key](https://www.cobo.com/developers/v2/guides/overview/cobo-auth#api-key). |  |
|**responseBody** | **String** | The response body of the API request. |  |
|**queryParams** | **String** | The query parameters of the API request. |  |
|**requestBody** | **String** | The request body of the API request. |  |



