# OAuthApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getToken**](OAuthApi.md#getToken) | **GET** /oauth/token | Get Access Token |
| [**refreshToken**](OAuthApi.md#refreshToken) | **POST** /oauth/token | Refresh Access Token |


<a id="getToken"></a>
# **getToken**
> GetToken200Response getToken(clientId, orgId, grantType)

Get Access Token

&lt;Note&gt;This operation is only applicable to Cobo Portal App developers. To call this operation, you need to use the OAuth authentication method that requires an App Key.&lt;/Note&gt; This operation allows Cobo Portal Apps to get an access token and a refresh token with a specified App ID, Org ID, and grant type.   Access tokens allow the app to signal to the WaaS service that it has received permission from the organization admin to access specific resources. Once the app has been granted permission by an organization admin, it can use this operation to obtain both an access token and a refresh token.  For security purposes, access tokens expire after a certain period. Once they expire, the app need to [Refresh token](/v2/api-references/oauth/refresh-access-token) to get a new access token and a new fresh token. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    OAuthApi apiInstance = new OAuthApi();
    String clientId = "pvSwS8iFrfK0oZrB0ugG54XPDOLEv0Ij";
    String orgId = "e3986401-4aec-480a-973d-e775a4518413";
    String grantType = "org_implicit";
    try {
      GetToken200Response result = apiInstance.getToken(clientId, orgId, grantType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#getToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **clientId** | **String**| The App ID, a unique identifier to distinguish Cobo Portal Apps. You can get the App ID by retrieving the Manifest file after receiving the notification of app launch approval. | |
| **orgId** | **String**| Org ID, a unique identifier to distinguish different organizations. You can get the Org ID by retrieving the Manifest file after receiving the notification of app launch approval. | |
| **grantType** | **String**| The type of the permission granting. To get an access token, you need to set the value as &#x60;org_implicit&#x60;. | |

### Return type

[**GetToken200Response**](GetToken200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Unauthorized. Please provide valid credentials. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="refreshToken"></a>
# **refreshToken**
> GetToken200Response refreshToken(refreshTokenRequest)

Refresh Access Token

&lt;Note&gt;This operation is only applicable to Cobo Portal Apps developers. To call this operation, you need to use the OAuth authentication method that requires an App Key.&lt;/Note&gt; This operation allows Cobo Portal Apps to obtain a new access token with a specified App ID, grant type and a refresh token. For security purposes, access tokens expire after a certain period. Once they expire, the app need to use this operation to get a new access token and a new fresh token. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.OAuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // set custom base url
    // defaultClient.setBasePath("https://api[.xxx].cobo.com/v2");
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    OAuthApi apiInstance = new OAuthApi();
    RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest();
    try {
      GetToken200Response result = apiInstance.refreshToken(refreshTokenRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OAuthApi#refreshToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **refreshTokenRequest** | [**RefreshTokenRequest**](RefreshTokenRequest.md)| The request body for refreshing an access token. | |

### Return type

[**GetToken200Response**](GetToken200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Unauthorized. Please provide valid credentials. |  -  |
| **5XX** | Internal server error. |  -  |

