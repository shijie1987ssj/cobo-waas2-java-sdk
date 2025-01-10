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

import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.GetTransactionLimitation200Response;
import com.cobo.waas2.model.ListSupportedCountries200ResponseInner;
import com.cobo.waas2.model.SubmitDepositTravelRuleInfo201Response;
import com.cobo.waas2.model.TravelRuleDepositRequest;
import com.cobo.waas2.model.TravelRuleWithdrawRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TravelRuleApi
 */
@Disabled
public class TravelRuleApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final TravelRuleApi api = new TravelRuleApi();

    /**
     * Retrieve transaction limitations
     *
     * This operation retrieves Travel Rule requirements and available options for a transaction based on its transaction type and ID.  Use this endpoint before submitting Travel Rule information to understand the requirements and available options for your transaction. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTransactionLimitationTest() throws ApiException {
        String transactionType = null;
        UUID transactionId = null;
        GetTransactionLimitation200Response response = api.getTransactionLimitation(transactionType, transactionId);
        // TODO: test validations
    }

    /**
     * List supported countries
     *
     * This operation retrieves a list of supported countries that can be used when submitting Travel Rule information.  Use this endpoint to obtain valid country values for:   - Place of incorporation of a legal entity   - Place of birth of a natural person 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSupportedCountriesTest() throws ApiException {
        List<ListSupportedCountries200ResponseInner> response = api.listSupportedCountries();
        // TODO: test validations
    }

    /**
     * Submit Travel Rule information for deposits
     *
     * This operation submits Travel Rule information for a deposit transaction. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitDepositTravelRuleInfoTest() throws ApiException {
        TravelRuleDepositRequest travelRuleDepositRequest = null;
        SubmitDepositTravelRuleInfo201Response response = api.submitDepositTravelRuleInfo(travelRuleDepositRequest);
        // TODO: test validations
    }

    /**
     * Submit Travel Rule information for withdrawals
     *
     * This operation submits Travel Rule information for a withdrawal transaction. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void submitWithdrawTravelRuleInfoTest() throws ApiException {
        TravelRuleWithdrawRequest travelRuleWithdrawRequest = null;
        SubmitDepositTravelRuleInfo201Response response = api.submitWithdrawTravelRuleInfo(travelRuleWithdrawRequest);
        // TODO: test validations
    }

}
