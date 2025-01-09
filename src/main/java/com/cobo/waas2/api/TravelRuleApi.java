/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: help@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.api;

import com.cobo.waas2.ApiCallback;
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.ApiResponse;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.Pair;
import com.cobo.waas2.ProgressRequestBody;
import com.cobo.waas2.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.GetTransactionLimitation200Response;
import com.cobo.waas2.model.ListSupportedCountries200ResponseInner;
import com.cobo.waas2.model.SubmitDepositTravelRuleInfo201Response;
import com.cobo.waas2.model.TravelRuleDepositRequest;
import com.cobo.waas2.model.TravelRuleWithdrawRequest;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelRuleApi {
    private ApiClient localVarApiClient;

    public TravelRuleApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TravelRuleApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getTransactionLimitation
     * @param transactionType The transaction type. Possible values include:    - &#x60;DEPOSIT&#x60;: A deposit transaction.   - &#x60;WITHDRAW&#x60;: A withdrawal transaction.  (required)
     * @param transactionId The transaction ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionLimitationCall(String transactionType, UUID transactionId, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/travel_rule/transaction/limitation";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        Map<String, String> localVarHeaderParams = new HashMap<>();
        Map<String, String> localVarCookieParams = new HashMap<>();
        Map<String, Object> localVarFormParams = new HashMap<>();

        if (transactionType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transaction_type", transactionType));
        }

        if (transactionId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transaction_id", transactionId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(null, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTransactionLimitationValidateBeforeCall(String transactionType, UUID transactionId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'transactionType' is set
        if (transactionType == null) {
            throw new ApiException("Missing the required parameter 'transactionType' when calling getTransactionLimitation(Async)");
        }

        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new ApiException("Missing the required parameter 'transactionId' when calling getTransactionLimitation(Async)");
        }

        return getTransactionLimitationCall(transactionType, transactionId, _callback);

    }

    /**
     * Retrieve transaction limitations
     * This endpoint retrieves transaction-related limitations based on the provided &#x60;transaction_type&#x60; and &#x60;transaction_id&#x60;.  The response includes the following information: - **&#x60;vasp_list&#x60;**: A list of Virtual Asset Service Providers (VASPs) associated with the transaction token. - **&#x60;is_threshold_reached&#x60;**: Indicates whether the transaction amount has exceeded the predefined threshold.    - If &#x60;true&#x60;: Additional Travel Rule information may be required for processing. - **&#x60;self_custody_wallet_challenge&#x60;**: A challenge string for verifying ownership of self-custody wallets. - **&#x60;connect_wallet_list&#x60;**: A list of supported wallet integrations for the transaction, such as MetaMask or WalletConnect.  Use this endpoint to ensure compliance with Travel Rule requirements and to retrieve supported options for completing the transaction. 
     * @param transactionType The transaction type. Possible values include:    - &#x60;DEPOSIT&#x60;: A deposit transaction.   - &#x60;WITHDRAW&#x60;: A withdrawal transaction.  (required)
     * @param transactionId The transaction ID (required)
     * @return GetTransactionLimitation200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public GetTransactionLimitation200Response getTransactionLimitation(String transactionType, UUID transactionId) throws ApiException {
        ApiResponse<GetTransactionLimitation200Response> localVarResp = getTransactionLimitationWithHttpInfo(transactionType, transactionId);
        return localVarResp.getData();
    }

    /**
     * Retrieve transaction limitations
     * This endpoint retrieves transaction-related limitations based on the provided &#x60;transaction_type&#x60; and &#x60;transaction_id&#x60;.  The response includes the following information: - **&#x60;vasp_list&#x60;**: A list of Virtual Asset Service Providers (VASPs) associated with the transaction token. - **&#x60;is_threshold_reached&#x60;**: Indicates whether the transaction amount has exceeded the predefined threshold.    - If &#x60;true&#x60;: Additional Travel Rule information may be required for processing. - **&#x60;self_custody_wallet_challenge&#x60;**: A challenge string for verifying ownership of self-custody wallets. - **&#x60;connect_wallet_list&#x60;**: A list of supported wallet integrations for the transaction, such as MetaMask or WalletConnect.  Use this endpoint to ensure compliance with Travel Rule requirements and to retrieve supported options for completing the transaction. 
     * @param transactionType The transaction type. Possible values include:    - &#x60;DEPOSIT&#x60;: A deposit transaction.   - &#x60;WITHDRAW&#x60;: A withdrawal transaction.  (required)
     * @param transactionId The transaction ID (required)
     * @return ApiResponse&lt;GetTransactionLimitation200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetTransactionLimitation200Response> getTransactionLimitationWithHttpInfo(String transactionType, UUID transactionId) throws ApiException {
        okhttp3.Call localVarCall = getTransactionLimitationValidateBeforeCall(transactionType, transactionId, null);
        Type localVarReturnType = new TypeToken<GetTransactionLimitation200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Retrieve transaction limitations (asynchronously)
     * This endpoint retrieves transaction-related limitations based on the provided &#x60;transaction_type&#x60; and &#x60;transaction_id&#x60;.  The response includes the following information: - **&#x60;vasp_list&#x60;**: A list of Virtual Asset Service Providers (VASPs) associated with the transaction token. - **&#x60;is_threshold_reached&#x60;**: Indicates whether the transaction amount has exceeded the predefined threshold.    - If &#x60;true&#x60;: Additional Travel Rule information may be required for processing. - **&#x60;self_custody_wallet_challenge&#x60;**: A challenge string for verifying ownership of self-custody wallets. - **&#x60;connect_wallet_list&#x60;**: A list of supported wallet integrations for the transaction, such as MetaMask or WalletConnect.  Use this endpoint to ensure compliance with Travel Rule requirements and to retrieve supported options for completing the transaction. 
     * @param transactionType The transaction type. Possible values include:    - &#x60;DEPOSIT&#x60;: A deposit transaction.   - &#x60;WITHDRAW&#x60;: A withdrawal transaction.  (required)
     * @param transactionId The transaction ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The request was successful. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTransactionLimitationAsync(String transactionType, UUID transactionId, final ApiCallback<GetTransactionLimitation200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTransactionLimitationValidateBeforeCall(transactionType, transactionId, _callback);
        Type localVarReturnType = new TypeToken<GetTransactionLimitation200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for listSupportedCountries
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of countries supported. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listSupportedCountriesCall(final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/travel_rule/transaction/countries";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        Map<String, String> localVarHeaderParams = new HashMap<>();
        Map<String, String> localVarCookieParams = new HashMap<>();
        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(null, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listSupportedCountriesValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return listSupportedCountriesCall(_callback);

    }

    /**
     * List supported countries
     * This operation retrieves all countries supported.
     * @return List&lt;ListSupportedCountries200ResponseInner&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of countries supported. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public List<ListSupportedCountries200ResponseInner> listSupportedCountries() throws ApiException {
        ApiResponse<List<ListSupportedCountries200ResponseInner>> localVarResp = listSupportedCountriesWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * List supported countries
     * This operation retrieves all countries supported.
     * @return ApiResponse&lt;List&lt;ListSupportedCountries200ResponseInner&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of countries supported. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ListSupportedCountries200ResponseInner>> listSupportedCountriesWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = listSupportedCountriesValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<ListSupportedCountries200ResponseInner>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * List supported countries (asynchronously)
     * This operation retrieves all countries supported.
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> A list of countries supported. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call listSupportedCountriesAsync(final ApiCallback<List<ListSupportedCountries200ResponseInner>> _callback) throws ApiException {

        okhttp3.Call localVarCall = listSupportedCountriesValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<ListSupportedCountries200ResponseInner>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for submitDepositTravelRuleInfo
     * @param travelRuleDepositRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully submitted Travel Rule information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitDepositTravelRuleInfoCall(TravelRuleDepositRequest travelRuleDepositRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = travelRuleDepositRequest;

        // create path and map variables
        String localVarPath = "/travel_rule/transaction/deposit/travel_rule_info";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        Map<String, String> localVarHeaderParams = new HashMap<>();
        Map<String, String> localVarCookieParams = new HashMap<>();
        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(null, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call submitDepositTravelRuleInfoValidateBeforeCall(TravelRuleDepositRequest travelRuleDepositRequest, final ApiCallback _callback) throws ApiException {
        return submitDepositTravelRuleInfoCall(travelRuleDepositRequest, _callback);

    }

    /**
     * Submit Deposit Transaction Travel Rule information
     * This operation allows you to submit the required Travel Rule information based on the transaction details. It supports both self-custody wallets and exchanges/VASPs, ensuring compliance with Travel Rule requirements.   - **Destination Wallet Type (&#x60;destination_wallet_type&#x60;)**:   - &#x60;SELF_CUSTODY_WALLET&#x60;: A self-custodial wallet (e.g., plugin wallet). Requires &#x60;self_custody_wallet_sign&#x60;, &#x60;self_custody_wallet_address&#x60;, and &#x60;self_custody_wallet_challenge&#x60;.   - &#x60;EXCHANGES_OR_VASP&#x60;: A wallet associated with an exchange or VASP. Requires &#x60;vendor_vasp_id&#x60; and information depending on &#x60;selected_entity_type&#x60;.  - **Entity Types (&#x60;selected_entity_type&#x60;)**:   - &#x60;LEGAL&#x60;: For legal entities, provide &#x60;legal_name&#x60;, &#x60;date_of_incorporation&#x60;, and &#x60;place_of_incorporation&#x60;.   - &#x60;NATURAL&#x60;: For natural persons, provide &#x60;date_of_birth&#x60;, &#x60;place_of_birth&#x60;, &#x60;first_name&#x60;, and &#x60;last_name&#x60;. 
     * @param travelRuleDepositRequest  (optional)
     * @return SubmitDepositTravelRuleInfo201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully submitted Travel Rule information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public SubmitDepositTravelRuleInfo201Response submitDepositTravelRuleInfo(TravelRuleDepositRequest travelRuleDepositRequest) throws ApiException {
        ApiResponse<SubmitDepositTravelRuleInfo201Response> localVarResp = submitDepositTravelRuleInfoWithHttpInfo(travelRuleDepositRequest);
        return localVarResp.getData();
    }

    /**
     * Submit Deposit Transaction Travel Rule information
     * This operation allows you to submit the required Travel Rule information based on the transaction details. It supports both self-custody wallets and exchanges/VASPs, ensuring compliance with Travel Rule requirements.   - **Destination Wallet Type (&#x60;destination_wallet_type&#x60;)**:   - &#x60;SELF_CUSTODY_WALLET&#x60;: A self-custodial wallet (e.g., plugin wallet). Requires &#x60;self_custody_wallet_sign&#x60;, &#x60;self_custody_wallet_address&#x60;, and &#x60;self_custody_wallet_challenge&#x60;.   - &#x60;EXCHANGES_OR_VASP&#x60;: A wallet associated with an exchange or VASP. Requires &#x60;vendor_vasp_id&#x60; and information depending on &#x60;selected_entity_type&#x60;.  - **Entity Types (&#x60;selected_entity_type&#x60;)**:   - &#x60;LEGAL&#x60;: For legal entities, provide &#x60;legal_name&#x60;, &#x60;date_of_incorporation&#x60;, and &#x60;place_of_incorporation&#x60;.   - &#x60;NATURAL&#x60;: For natural persons, provide &#x60;date_of_birth&#x60;, &#x60;place_of_birth&#x60;, &#x60;first_name&#x60;, and &#x60;last_name&#x60;. 
     * @param travelRuleDepositRequest  (optional)
     * @return ApiResponse&lt;SubmitDepositTravelRuleInfo201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully submitted Travel Rule information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SubmitDepositTravelRuleInfo201Response> submitDepositTravelRuleInfoWithHttpInfo(TravelRuleDepositRequest travelRuleDepositRequest) throws ApiException {
        okhttp3.Call localVarCall = submitDepositTravelRuleInfoValidateBeforeCall(travelRuleDepositRequest, null);
        Type localVarReturnType = new TypeToken<SubmitDepositTravelRuleInfo201Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Submit Deposit Transaction Travel Rule information (asynchronously)
     * This operation allows you to submit the required Travel Rule information based on the transaction details. It supports both self-custody wallets and exchanges/VASPs, ensuring compliance with Travel Rule requirements.   - **Destination Wallet Type (&#x60;destination_wallet_type&#x60;)**:   - &#x60;SELF_CUSTODY_WALLET&#x60;: A self-custodial wallet (e.g., plugin wallet). Requires &#x60;self_custody_wallet_sign&#x60;, &#x60;self_custody_wallet_address&#x60;, and &#x60;self_custody_wallet_challenge&#x60;.   - &#x60;EXCHANGES_OR_VASP&#x60;: A wallet associated with an exchange or VASP. Requires &#x60;vendor_vasp_id&#x60; and information depending on &#x60;selected_entity_type&#x60;.  - **Entity Types (&#x60;selected_entity_type&#x60;)**:   - &#x60;LEGAL&#x60;: For legal entities, provide &#x60;legal_name&#x60;, &#x60;date_of_incorporation&#x60;, and &#x60;place_of_incorporation&#x60;.   - &#x60;NATURAL&#x60;: For natural persons, provide &#x60;date_of_birth&#x60;, &#x60;place_of_birth&#x60;, &#x60;first_name&#x60;, and &#x60;last_name&#x60;. 
     * @param travelRuleDepositRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully submitted Travel Rule information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitDepositTravelRuleInfoAsync(TravelRuleDepositRequest travelRuleDepositRequest, final ApiCallback<SubmitDepositTravelRuleInfo201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = submitDepositTravelRuleInfoValidateBeforeCall(travelRuleDepositRequest, _callback);
        Type localVarReturnType = new TypeToken<SubmitDepositTravelRuleInfo201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for submitWithdrawTravelRuleInfo
     * @param travelRuleWithdrawRequest  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully submitted Travel Rule information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitWithdrawTravelRuleInfoCall(TravelRuleWithdrawRequest travelRuleWithdrawRequest, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = travelRuleWithdrawRequest;

        // create path and map variables
        String localVarPath = "/travel_rule/transaction/withdraw/travel_rule_info";

        List<Pair> localVarQueryParams = new ArrayList<>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<>();
        Map<String, String> localVarHeaderParams = new HashMap<>();
        Map<String, String> localVarCookieParams = new HashMap<>();
        Map<String, Object> localVarFormParams = new HashMap<>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {};
        return localVarApiClient.buildCall(null, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call submitWithdrawTravelRuleInfoValidateBeforeCall(TravelRuleWithdrawRequest travelRuleWithdrawRequest, final ApiCallback _callback) throws ApiException {
        return submitWithdrawTravelRuleInfoCall(travelRuleWithdrawRequest, _callback);

    }

    /**
     * Submit Withdraw Transaction Travel Rule information
     * This operation allows you to submit the required Travel Rule information based on the transaction details. It supports both self-custody wallets and exchanges/VASPs, ensuring compliance with Travel Rule requirements.   - **Destination Wallet Type (&#x60;destination_wallet_type&#x60;)**:   - &#x60;SELF_CUSTODY_WALLET&#x60;: A self-custodial wallet (e.g., plugin wallet). Requires &#x60;self_custody_wallet_sign&#x60;, &#x60;self_custody_wallet_address&#x60;, and &#x60;self_custody_wallet_challenge&#x60;.   - &#x60;EXCHANGES_OR_VASP&#x60;: A wallet associated with an exchange or VASP. Requires &#x60;vendor_vasp_id&#x60; and information depending on &#x60;selected_entity_type&#x60;.  - **Entity Types (&#x60;selected_entity_type&#x60;)**:   - &#x60;LEGAL&#x60;: For legal entities, provide &#x60;legal_name&#x60;.   - &#x60;NATURAL&#x60;: For natural persons, provide &#x60;date_of_birth&#x60;, &#x60;place_of_birth&#x60;, &#x60;first_name&#x60;, and &#x60;last_name&#x60;. 
     * @param travelRuleWithdrawRequest  (optional)
     * @return SubmitDepositTravelRuleInfo201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully submitted Travel Rule information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public SubmitDepositTravelRuleInfo201Response submitWithdrawTravelRuleInfo(TravelRuleWithdrawRequest travelRuleWithdrawRequest) throws ApiException {
        ApiResponse<SubmitDepositTravelRuleInfo201Response> localVarResp = submitWithdrawTravelRuleInfoWithHttpInfo(travelRuleWithdrawRequest);
        return localVarResp.getData();
    }

    /**
     * Submit Withdraw Transaction Travel Rule information
     * This operation allows you to submit the required Travel Rule information based on the transaction details. It supports both self-custody wallets and exchanges/VASPs, ensuring compliance with Travel Rule requirements.   - **Destination Wallet Type (&#x60;destination_wallet_type&#x60;)**:   - &#x60;SELF_CUSTODY_WALLET&#x60;: A self-custodial wallet (e.g., plugin wallet). Requires &#x60;self_custody_wallet_sign&#x60;, &#x60;self_custody_wallet_address&#x60;, and &#x60;self_custody_wallet_challenge&#x60;.   - &#x60;EXCHANGES_OR_VASP&#x60;: A wallet associated with an exchange or VASP. Requires &#x60;vendor_vasp_id&#x60; and information depending on &#x60;selected_entity_type&#x60;.  - **Entity Types (&#x60;selected_entity_type&#x60;)**:   - &#x60;LEGAL&#x60;: For legal entities, provide &#x60;legal_name&#x60;.   - &#x60;NATURAL&#x60;: For natural persons, provide &#x60;date_of_birth&#x60;, &#x60;place_of_birth&#x60;, &#x60;first_name&#x60;, and &#x60;last_name&#x60;. 
     * @param travelRuleWithdrawRequest  (optional)
     * @return ApiResponse&lt;SubmitDepositTravelRuleInfo201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully submitted Travel Rule information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SubmitDepositTravelRuleInfo201Response> submitWithdrawTravelRuleInfoWithHttpInfo(TravelRuleWithdrawRequest travelRuleWithdrawRequest) throws ApiException {
        okhttp3.Call localVarCall = submitWithdrawTravelRuleInfoValidateBeforeCall(travelRuleWithdrawRequest, null);
        Type localVarReturnType = new TypeToken<SubmitDepositTravelRuleInfo201Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Submit Withdraw Transaction Travel Rule information (asynchronously)
     * This operation allows you to submit the required Travel Rule information based on the transaction details. It supports both self-custody wallets and exchanges/VASPs, ensuring compliance with Travel Rule requirements.   - **Destination Wallet Type (&#x60;destination_wallet_type&#x60;)**:   - &#x60;SELF_CUSTODY_WALLET&#x60;: A self-custodial wallet (e.g., plugin wallet). Requires &#x60;self_custody_wallet_sign&#x60;, &#x60;self_custody_wallet_address&#x60;, and &#x60;self_custody_wallet_challenge&#x60;.   - &#x60;EXCHANGES_OR_VASP&#x60;: A wallet associated with an exchange or VASP. Requires &#x60;vendor_vasp_id&#x60; and information depending on &#x60;selected_entity_type&#x60;.  - **Entity Types (&#x60;selected_entity_type&#x60;)**:   - &#x60;LEGAL&#x60;: For legal entities, provide &#x60;legal_name&#x60;.   - &#x60;NATURAL&#x60;: For natural persons, provide &#x60;date_of_birth&#x60;, &#x60;place_of_birth&#x60;, &#x60;first_name&#x60;, and &#x60;last_name&#x60;. 
     * @param travelRuleWithdrawRequest  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Successfully submitted Travel Rule information. </td><td>  -  </td></tr>
        <tr><td> 4XX </td><td> Bad request. Your request contains malformed syntax or invalid parameters. </td><td>  -  </td></tr>
        <tr><td> 5XX </td><td> Internal server error. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call submitWithdrawTravelRuleInfoAsync(TravelRuleWithdrawRequest travelRuleWithdrawRequest, final ApiCallback<SubmitDepositTravelRuleInfo201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = submitWithdrawTravelRuleInfoValidateBeforeCall(travelRuleWithdrawRequest, _callback);
        Type localVarReturnType = new TypeToken<SubmitDepositTravelRuleInfo201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
