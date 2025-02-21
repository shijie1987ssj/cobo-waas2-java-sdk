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
import com.cobo.waas2.model.ChangeGuardPubkey200Response;
import com.cobo.waas2.model.CreatePrimeBrokerAddress201Response;
import com.cobo.waas2.model.CreatePrimeBrokerAddressRequest;
import com.cobo.waas2.model.DeleteGuardPubkey201Response;
import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.QueryApprovalStatement200Response;
import com.cobo.waas2.model.QueryGuardPubkey200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PrimeBrokerApi
 */
@Disabled
public class PrimeBrokerApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final PrimeBrokerApi api = new PrimeBrokerApi();

    /**
     * change a user guard pubkey
     *
     * This operation change a user guard pubkey. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void changeGuardPubkeyTest() throws ApiException {
        String userId = null;
        ChangeGuardPubkey200Response response = api.changeGuardPubkey(userId);
        // TODO: test validations
    }

    /**
     * create a guard pubkey binding
     *
     * This operation create a guard pubkey binding. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createGuardPubkeyTest() throws ApiException {
        String userId = null;
        ChangeGuardPubkey200Response response = api.createGuardPubkey(userId);
        // TODO: test validations
    }

    /**
     * bind addresses to a broker user
     *
     * This operation bind addresses to a broker user. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createPrimeBrokerAddressTest() throws ApiException {
        String userId = null;
        CreatePrimeBrokerAddressRequest createPrimeBrokerAddressRequest = null;
        CreatePrimeBrokerAddress201Response response = api.createPrimeBrokerAddress(userId, createPrimeBrokerAddressRequest);
        // TODO: test validations
    }

    /**
     * delete a user guard pubkey
     *
     * This operation delete a user guard pubkey. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteGuardPubkeyTest() throws ApiException {
        String userId = null;
        DeleteGuardPubkey201Response response = api.deleteGuardPubkey(userId);
        // TODO: test validations
    }

    /**
     * query a approval statement
     *
     * This operation query a approval statement. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryApprovalStatementTest() throws ApiException {
        String statementId = null;
        QueryApprovalStatement200Response response = api.queryApprovalStatement(statementId);
        // TODO: test validations
    }

    /**
     * query a user guard pubkey
     *
     * This operation query a user guard pubkey 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void queryGuardPubkeyTest() throws ApiException {
        String userId = null;
        QueryGuardPubkey200Response response = api.queryGuardPubkey(userId);
        // TODO: test validations
    }

}
