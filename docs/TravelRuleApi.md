# TravelRuleApi

All URIs are relative to *https://api.dev.cobo.com/v2*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTransactionLimitation**](TravelRuleApi.md#getTransactionLimitation) | **GET** /travel_rule/transaction/limitation | Retrieve transaction limitations |
| [**listSupportedCountries**](TravelRuleApi.md#listSupportedCountries) | **GET** /travel_rule/transaction/countries | List supported countries |
| [**submitDepositTravelRuleInfo**](TravelRuleApi.md#submitDepositTravelRuleInfo) | **POST** /travel_rule/transaction/deposit/travel_rule_info | Submit Deposit Transaction Travel Rule information |
| [**submitWithdrawTravelRuleInfo**](TravelRuleApi.md#submitWithdrawTravelRuleInfo) | **POST** /travel_rule/transaction/withdraw/travel_rule_info | Submit Withdraw Transaction Travel Rule information |


<a id="getTransactionLimitation"></a>
# **getTransactionLimitation**
> GetTransactionLimitation200Response getTransactionLimitation(transactionType, transactionId)

Retrieve transaction limitations

This endpoint retrieves transaction-related limitations based on the provided &#x60;transaction_type&#x60; and &#x60;transaction_id&#x60;.  The response includes the following information: - **&#x60;vasp_list&#x60;**: A list of Virtual Asset Service Providers (VASPs) associated with the transaction token. - **&#x60;is_threshold_reached&#x60;**: Indicates whether the transaction amount has exceeded the predefined threshold.    - If &#x60;true&#x60;: Additional Travel Rule information may be required for processing. - **&#x60;self_custody_wallet_challenge&#x60;**: A challenge string for verifying ownership of self-custody wallets. - **&#x60;connect_wallet_list&#x60;**: A list of supported wallet integrations for the transaction, such as MetaMask or WalletConnect.  Use this endpoint to ensure compliance with Travel Rule requirements and to retrieve supported options for completing the transaction. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    String transactionType = "DEPOSIT";
    UUID transactionId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000");
    try {
      GetTransactionLimitation200Response result = apiInstance.getTransactionLimitation(transactionType, transactionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#getTransactionLimitation");
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
| **transactionType** | **String**| The transaction type. Possible values include:    - &#x60;DEPOSIT&#x60;: A deposit transaction.   - &#x60;WITHDRAW&#x60;: A withdrawal transaction.  | [enum: DEPOSIT, WITHDRAW] |
| **transactionId** | **UUID**| The transaction ID | |

### Return type

[**GetTransactionLimitation200Response**](GetTransactionLimitation200Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="listSupportedCountries"></a>
# **listSupportedCountries**
> List&lt;ListSupportedCountries200ResponseInner&gt; listSupportedCountries()

List supported countries

This operation retrieves all countries supported.

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    try {
      List<ListSupportedCountries200ResponseInner> result = apiInstance.listSupportedCountries();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#listSupportedCountries");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;ListSupportedCountries200ResponseInner&gt;**](ListSupportedCountries200ResponseInner.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of countries supported. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="submitDepositTravelRuleInfo"></a>
# **submitDepositTravelRuleInfo**
> SubmitDepositTravelRuleInfo201Response submitDepositTravelRuleInfo(travelRuleDepositRequest)

Submit Deposit Transaction Travel Rule information

This operation allows you to submit the required Travel Rule information based on the transaction details. It supports both self-custody wallets and exchanges/VASPs, ensuring compliance with Travel Rule requirements.   - **Destination Wallet Type (&#x60;destination_wallet_type&#x60;)**:   - &#x60;SELF_CUSTODY_WALLET&#x60;: A self-custodial wallet (e.g., plugin wallet). Requires &#x60;self_custody_wallet_sign&#x60;, &#x60;self_custody_wallet_address&#x60;, and &#x60;self_custody_wallet_challenge&#x60;.   - &#x60;EXCHANGES_OR_VASP&#x60;: A wallet associated with an exchange or VASP. Requires &#x60;vendor_vasp_id&#x60; and information depending on &#x60;selected_entity_type&#x60;.  - **Entity Types (&#x60;selected_entity_type&#x60;)**:   - &#x60;LEGAL&#x60;: For legal entities, provide &#x60;legal_name&#x60;, &#x60;date_of_incorporation&#x60;, and &#x60;place_of_incorporation&#x60;.   - &#x60;NATURAL&#x60;: For natural persons, provide &#x60;date_of_birth&#x60;, &#x60;place_of_birth&#x60;, &#x60;first_name&#x60;, and &#x60;last_name&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    TravelRuleDepositRequest travelRuleDepositRequest = new TravelRuleDepositRequest();
    try {
      SubmitDepositTravelRuleInfo201Response result = apiInstance.submitDepositTravelRuleInfo(travelRuleDepositRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#submitDepositTravelRuleInfo");
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
| **travelRuleDepositRequest** | [**TravelRuleDepositRequest**](TravelRuleDepositRequest.md)|  | [optional] |

### Return type

[**SubmitDepositTravelRuleInfo201Response**](SubmitDepositTravelRuleInfo201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted Travel Rule information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

<a id="submitWithdrawTravelRuleInfo"></a>
# **submitWithdrawTravelRuleInfo**
> SubmitDepositTravelRuleInfo201Response submitWithdrawTravelRuleInfo(travelRuleWithdrawRequest)

Submit Withdraw Transaction Travel Rule information

This operation allows you to submit the required Travel Rule information based on the transaction details. It supports both self-custody wallets and exchanges/VASPs, ensuring compliance with Travel Rule requirements.   - **Destination Wallet Type (&#x60;destination_wallet_type&#x60;)**:   - &#x60;SELF_CUSTODY_WALLET&#x60;: A self-custodial wallet (e.g., plugin wallet). Requires &#x60;self_custody_wallet_sign&#x60;, &#x60;self_custody_wallet_address&#x60;, and &#x60;self_custody_wallet_challenge&#x60;.   - &#x60;EXCHANGES_OR_VASP&#x60;: A wallet associated with an exchange or VASP. Requires &#x60;vendor_vasp_id&#x60; and information depending on &#x60;selected_entity_type&#x60;.  - **Entity Types (&#x60;selected_entity_type&#x60;)**:   - &#x60;LEGAL&#x60;: For legal entities, provide &#x60;legal_name&#x60;.   - &#x60;NATURAL&#x60;: For natural persons, provide &#x60;date_of_birth&#x60;, &#x60;place_of_birth&#x60;, &#x60;first_name&#x60;, and &#x60;last_name&#x60;. 

### Example
```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.Env;
import com.cobo.waas2.api.TravelRuleApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // Select the development environment. To use the production environment, replace `Env.DEV` with `Env.PROD
    defaultClient.setEnv(Env.DEV);

    // Replace `<YOUR_PRIVATE_KEY>` with your private key
    defaultClient.setPrivKey("<YOUR_PRIVATE_KEY>");
    TravelRuleApi apiInstance = new TravelRuleApi();
    TravelRuleWithdrawRequest travelRuleWithdrawRequest = new TravelRuleWithdrawRequest();
    try {
      SubmitDepositTravelRuleInfo201Response result = apiInstance.submitWithdrawTravelRuleInfo(travelRuleWithdrawRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TravelRuleApi#submitWithdrawTravelRuleInfo");
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
| **travelRuleWithdrawRequest** | [**TravelRuleWithdrawRequest**](TravelRuleWithdrawRequest.md)|  | [optional] |

### Return type

[**SubmitDepositTravelRuleInfo201Response**](SubmitDepositTravelRuleInfo201Response.md)

### Authorization

[OAuth2](../README.md#OAuth2), [CoboAuth](../README.md#CoboAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully submitted Travel Rule information. |  -  |
| **4XX** | Bad request. Your request contains malformed syntax or invalid parameters. |  -  |
| **5XX** | Internal server error. |  -  |

