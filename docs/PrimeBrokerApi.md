# PrimeBrokerApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeGuardPubkey**](PrimeBrokerApi.md#changeGuardPubkey) | **PUT** /prime_broker/user/{user_id}/guard_pubkey | change a user guard pubkey |
| [**createGuardPubkey**](PrimeBrokerApi.md#createGuardPubkey) | **POST** /prime_broker/user/{user_id}/guard_pubkey | create a guard pubkey binding |
| [**createPrimeBrokerAddress**](PrimeBrokerApi.md#createPrimeBrokerAddress) | **POST** /prime_broker/user/{user_id}/addresses | bind addresses to a broker user |
| [**deleteGuardPubkey**](PrimeBrokerApi.md#deleteGuardPubkey) | **POST** /prime_broker/user/{user_id}/guard_pubkey/delete | delete a user guard pubkey |
| [**queryApprovalStatement**](PrimeBrokerApi.md#queryApprovalStatement) | **GET** /prime_broker/approval_statement/{statement_id} | query a approval statement |
| [**queryGuardPubkey**](PrimeBrokerApi.md#queryGuardPubkey) | **GET** /prime_broker/user/{user_id}/guard_pubkey | query a user guard pubkey |


<a id="changeGuardPubkey"></a>
# **changeGuardPubkey**
> ChangeGuardPubkey200Response changeGuardPubkey(userId)

change a user guard pubkey

This operation change a user guard pubkey. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String userId = "168108513539918";
    try {
      ChangeGuardPubkey200Response result = apiInstance.changeGuardPubkey(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#changeGuardPubkey");
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
| **userId** | **String**| user id. | |

### Return type

[**ChangeGuardPubkey200Response**](ChangeGuardPubkey200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully created a guard binding. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="createGuardPubkey"></a>
# **createGuardPubkey**
> ChangeGuardPubkey200Response createGuardPubkey(userId)

create a guard pubkey binding

This operation create a guard pubkey binding. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String userId = "168108513539918";
    try {
      ChangeGuardPubkey200Response result = apiInstance.createGuardPubkey(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#createGuardPubkey");
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
| **userId** | **String**| user id. | |

### Return type

[**ChangeGuardPubkey200Response**](ChangeGuardPubkey200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a guard binding. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="createPrimeBrokerAddress"></a>
# **createPrimeBrokerAddress**
> CreatePrimeBrokerAddress201Response createPrimeBrokerAddress(userId, createPrimeBrokerAddressRequest)

bind addresses to a broker user

This operation bind addresses to a broker user. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String userId = "168108513539918";
    CreatePrimeBrokerAddressRequest createPrimeBrokerAddressRequest = new CreatePrimeBrokerAddressRequest();
    try {
      CreatePrimeBrokerAddress201Response result = apiInstance.createPrimeBrokerAddress(userId, createPrimeBrokerAddressRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#createPrimeBrokerAddress");
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
| **userId** | **String**| user id. | |
| **createPrimeBrokerAddressRequest** | [**CreatePrimeBrokerAddressRequest**](CreatePrimeBrokerAddressRequest.md)| The request body to binding addresses to a broker user. | [optional] |

### Return type

[**CreatePrimeBrokerAddress201Response**](CreatePrimeBrokerAddress201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a address binding. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="deleteGuardPubkey"></a>
# **deleteGuardPubkey**
> DeleteGuardPubkey201Response deleteGuardPubkey(userId)

delete a user guard pubkey

This operation delete a user guard pubkey. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String userId = "168108513539918";
    try {
      DeleteGuardPubkey201Response result = apiInstance.deleteGuardPubkey(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#deleteGuardPubkey");
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
| **userId** | **String**| user id. | |

### Return type

[**DeleteGuardPubkey201Response**](DeleteGuardPubkey201Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully created a guard binding. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="queryApprovalStatement"></a>
# **queryApprovalStatement**
> QueryApprovalStatement200Response queryApprovalStatement(statementId)

query a approval statement

This operation query a approval statement. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String statementId = "168108513539918";
    try {
      QueryApprovalStatement200Response result = apiInstance.queryApprovalStatement(statementId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#queryApprovalStatement");
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
| **statementId** | **String**| approval statement id. | |

### Return type

[**QueryApprovalStatement200Response**](QueryApprovalStatement200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about a approval statement. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

<a id="queryGuardPubkey"></a>
# **queryGuardPubkey**
> QueryGuardPubkey200Response queryGuardPubkey(userId)

query a user guard pubkey

This operation query a user guard pubkey 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.PrimeBrokerApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    PrimeBrokerApi apiInstance = new PrimeBrokerApi();
    String userId = "168108513539918";
    try {
      QueryGuardPubkey200Response result = apiInstance.queryGuardPubkey(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PrimeBrokerApi#queryGuardPubkey");
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
| **userId** | **String**| user id. | |

### Return type

[**QueryGuardPubkey200Response**](QueryGuardPubkey200Response.md)

### Authorization

[CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The information about an user guard pubkey. |  -  |
| **400** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **401** | Unauthorized. Please provide valid credentials. |  -  |
| **403** | Forbidden. You do not have the permission to access the requested resource. |  -  |

