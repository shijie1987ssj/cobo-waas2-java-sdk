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
import com.cobo.waas2.model.Activity;
import com.cobo.waas2.model.ActivityStatus;
import com.cobo.waas2.model.ActivityType;
import com.cobo.waas2.model.BabylonAirdropRegistration;
import com.cobo.waas2.model.BabylonStakingRegistration;
import com.cobo.waas2.model.CreateBabylonAirdropRegistration201Response;
import com.cobo.waas2.model.CreateBabylonAirdropRegistrationRequest;
import com.cobo.waas2.model.CreateBabylonStakingRegistration201Response;
import com.cobo.waas2.model.CreateBabylonStakingRegistrationRequest;
import com.cobo.waas2.model.CreateClaimActivityRequest;
import com.cobo.waas2.model.CreateStakeActivity201Response;
import com.cobo.waas2.model.CreateStakeActivityRequest;
import com.cobo.waas2.model.CreateUnstakeActivityRequest;
import com.cobo.waas2.model.CreateWithdrawActivityRequest;
import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.EthStakeEstimatedFee;
import com.cobo.waas2.model.GetStakingEstimationFee201Response;
import com.cobo.waas2.model.GetStakingEstimationFeeRequest;
import com.cobo.waas2.model.ListBabylonAirdropRegistrations200Response;
import com.cobo.waas2.model.ListBabylonEligibleAirdrops200Response;
import com.cobo.waas2.model.ListBabylonEligibleStakings200Response;
import com.cobo.waas2.model.ListBabylonStakingRegistrations200Response;
import com.cobo.waas2.model.ListStakingActivities200Response;
import com.cobo.waas2.model.ListStakingPools200Response;
import com.cobo.waas2.model.ListStakings200Response;
import com.cobo.waas2.model.PoolDetails;
import com.cobo.waas2.model.Stakings;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StakingsApi
 */
@Disabled
public class StakingsApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final StakingsApi api = new StakingsApi();

    /**
     * Create Babylon airdrop registration
     *
     * Creates a new airdrop registration request.  The registration process involves: 1. Validating the address eligibility 2. Creating a registration record with unique ID 3. Initiating the async registration process 4. Returning the registration ID for status tracking  Important notes: - This is an asynchronous operation - Use the status endpoint to track the registration progress - Each address can only register once 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBabylonAirdropRegistrationTest() throws ApiException {
        CreateBabylonAirdropRegistrationRequest createBabylonAirdropRegistrationRequest = null;
        CreateBabylonAirdropRegistration201Response response = api.createBabylonAirdropRegistration(createBabylonAirdropRegistrationRequest);
        // TODO: test validations
    }

    /**
     * Create Babylon staking registration request
     *
     * Creates a new request to register BTC staking for babylon phase 2.  The registration process involves: 1. Validating the staking eligibility 2. Creating a registration record 3. Initiating the async registration process 4. Returning the registration ID for status tracking  Important notes: - This is an asynchronous operation - Use the status endpoint to track the registration progress 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createBabylonStakingRegistrationTest() throws ApiException {
        CreateBabylonStakingRegistrationRequest createBabylonStakingRegistrationRequest = null;
        CreateBabylonStakingRegistration201Response response = api.createBabylonStakingRegistration(createBabylonStakingRegistrationRequest);
        // TODO: test validations
    }

    /**
     * Create claim activity
     *
     * This operation creates a claim request.  &lt;Note&gt;Currently, only the Ethereum Beacon protocol supports this operation.&lt;/Note&gt;  For some protocols, you can use the &#x60;fee&#x60; property in the request body to specify the maximum fee you are willing to pay. The transaction will fail if the actual fee exceeds the specified maximum fee.  
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createClaimActivityTest() throws ApiException {
        CreateClaimActivityRequest createClaimActivityRequest = null;
        CreateStakeActivity201Response response = api.createClaimActivity(createClaimActivityRequest);
        // TODO: test validations
    }

    /**
     * Create stake activity
     *
     * This operation creates a staking request.  For some protocols, you can use the &#x60;fee&#x60; property in the request body to specify the maximum fee you are willing to pay. The transaction will fail if the actual fee exceeds the specified maximum fee.   &lt;Note&gt;For the Babylon protocol, you can only select UTXO as the fee model.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createStakeActivityTest() throws ApiException {
        CreateStakeActivityRequest createStakeActivityRequest = null;
        CreateStakeActivity201Response response = api.createStakeActivity(createStakeActivityRequest);
        // TODO: test validations
    }

    /**
     * Create unstake activity
     *
     * This operation creates an unstaking request. Your staked tokens will be automatically unlocked once the specified locking period ends. If you want to withdraw your tokens beforehand, you can unstake them with this operation.  For some protocols, you can use the &#x60;fee&#x60; property in the request body to specify the maximum fee you are willing to pay. The transaction will fail if the actual fee exceeds the specified maximum fee.   &lt;Note&gt;For the Babylon protocol, you can only select UTXO as the fee model.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createUnstakeActivityTest() throws ApiException {
        CreateUnstakeActivityRequest createUnstakeActivityRequest = null;
        CreateStakeActivity201Response response = api.createUnstakeActivity(createUnstakeActivityRequest);
        // TODO: test validations
    }

    /**
     * Create withdraw activity
     *
     * This operation creates a withdrawal request.   For some protocols, you can use the &#x60;fee&#x60; property in the request body to specify the maximum fee you are willing to pay. The transaction will fail if the actual fee exceeds the specified maximum fee.   &lt;Note&gt;For the Babylon protocol, you can only select UTXO as the fee model.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createWithdrawActivityTest() throws ApiException {
        CreateWithdrawActivityRequest createWithdrawActivityRequest = null;
        CreateStakeActivity201Response response = api.createWithdrawActivity(createWithdrawActivityRequest);
        // TODO: test validations
    }

    /**
     * Get Babylon airdrop registration details
     *
     * Returns the current status and details of a specific airdrop registration.  The response includes: - Registration status (processing/completed/failed) - Source and destination addresses - Error message if failed 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBabylonAirdropRegistrationByIdTest() throws ApiException {
        String registrationId = null;
        BabylonAirdropRegistration response = api.getBabylonAirdropRegistrationById(registrationId);
        // TODO: test validations
    }

    /**
     * Get post staking registration operation status
     *
     * Gets the current status of a post staking registration operation.  The status can be: - Processing: Registration transaction is being processed on-chain - Completed: Registration successfully completed - Failed: Registration failed (check error message for details)  Important notes: - Registration may take several minutes to complete - Status should be polled periodically - Once completed, the staking will be registered for post staking 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getBabylonStakingRegistrationByIdTest() throws ApiException {
        String registrationId = null;
        BabylonStakingRegistration response = api.getBabylonStakingRegistrationById(registrationId);
        // TODO: test validations
    }

    /**
     * Get staking activity details
     *
     * This operation retrieves the details of a specified staking activity. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStakingActivityByIdTest() throws ApiException {
        String activityId = null;
        Activity response = api.getStakingActivityById(activityId);
        // TODO: test validations
    }

    /**
     * Get staking position details
     *
     * This operation retrieves the detailed information about a specified staking position. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStakingByIdTest() throws ApiException {
        String stakingId = null;
        Stakings response = api.getStakingById(stakingId);
        // TODO: test validations
    }

    /**
     * Estimate staking fees
     *
     * &lt;Note&gt;This operation is deprecated. Please use the [updated version](https://www.cobo.com/developers/v2/api-references/stakings/estimate-staking-fees-v2) instead.&lt;/Note&gt;  This operation calculates the fee required for a staking activity based on factors such as network congestion and transaction complexity.  For some protocols, you can use the &#x60;fee.fee_rate&#x60; property in the request body to specify the fee rate you are willing to pay.  The &#x60;fee.max_fee_amount&#x60; property in the request body will be ignored.  &lt;Note&gt;For the Babylon protocol, you can only select UTXO as the fee model.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStakingEstimationFeeTest() throws ApiException {
        GetStakingEstimationFeeRequest getStakingEstimationFeeRequest = null;
        GetStakingEstimationFee201Response response = api.getStakingEstimationFee(getStakingEstimationFeeRequest);
        // TODO: test validations
    }

    /**
     * Estimate staking fees v2
     *
     * This operation calculates the fee required for a staking activity based on factors such as network congestion and transaction complexity.  &lt;Note&gt;For the Babylon protocol, you can only select UTXO as the fee model.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStakingEstimationFeeV2Test() throws ApiException {
        GetStakingEstimationFeeRequest getStakingEstimationFeeRequest = null;
        EthStakeEstimatedFee response = api.getStakingEstimationFeeV2(getStakingEstimationFeeRequest);
        // TODO: test validations
    }

    /**
     * Get staking pool details
     *
     * This operation retrieves the detailed information about a specified staking pool. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStakingPoolByIdTest() throws ApiException {
        String poolId = null;
        PoolDetails response = api.getStakingPoolById(poolId);
        // TODO: test validations
    }

    /**
     * List Babylon airdrop registrations
     *
     * Returns a list of airdrop registration records.  The response includes: - Registration details and current status - Transaction information - Pagination support 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBabylonAirdropRegistrationsTest() throws ApiException {
        String status = null;
        String btcAddress = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListBabylonAirdropRegistrations200Response response = api.listBabylonAirdropRegistrations(status, btcAddress, limit, before, after);
        // TODO: test validations
    }

    /**
     * List wallets eligible for Babylon airdrop
     *
     * Returns a list of wallets that are eligible for the Babylon airdrop.  Use this API to: 1. Check which wallets can post airdrop registration 2. Get estimated airdrop amounts before claiming 3. Monitor available airdrops  The response includes: - Eligibility status and criteria - Estimated airdrop amounts - Claim status and history 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBabylonEligibleAirdropsTest() throws ApiException {
        String status = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListBabylonEligibleAirdrops200Response response = api.listBabylonEligibleAirdrops(status, limit, before, after);
        // TODO: test validations
    }

    /**
     * List stakings eligible for post staking registration
     *
     * Returns a list of staking positions that are eligible for Babylon staking registration.  The response includes: - Staking details and current status - Babylon staking registration eligibility information  Use this API to: 1. Check which staking positions can be registered 2. Get staking details before initiating registration 3. Monitor available positions for post staking registration 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBabylonEligibleStakingsTest() throws ApiException {
        String status = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListBabylonEligibleStakings200Response response = api.listBabylonEligibleStakings(status, limit, before, after);
        // TODO: test validations
    }

    /**
     * List Babylon phase 2 staking registration requests
     *
     * Returns a list of babylon phase 2 staking registration request records.  The response includes: - Registration details and current status - Transaction information - Pagination support 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listBabylonStakingRegistrationsTest() throws ApiException {
        String status = null;
        String stakingId = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListBabylonStakingRegistrations200Response response = api.listBabylonStakingRegistrations(status, stakingId, limit, before, after);
        // TODO: test validations
    }

    /**
     * List staking activities
     *
     * This operation retrieves a list of staking activities. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listStakingActivitiesTest() throws ApiException {
        String poolId = null;
        String stakingId = null;
        ActivityType activityType = null;
        ActivityStatus activityStatus = null;
        Long minModifiedTimestamp = null;
        Long maxModifiedTimestamp = null;
        String initiator = null;
        String requestId = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListStakingActivities200Response response = api.listStakingActivities(poolId, stakingId, activityType, activityStatus, minModifiedTimestamp, maxModifiedTimestamp, initiator, requestId, limit, before, after);
        // TODO: test validations
    }

    /**
     * List staking pools
     *
     * This operation retrieves a list of staking pools currently supported. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listStakingPoolsTest() throws ApiException {
        String chainId = null;
        String tokenId = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListStakingPools200Response response = api.listStakingPools(chainId, tokenId, limit, before, after);
        // TODO: test validations
    }

    /**
     * List staking positions
     *
     * This operation retrieves a list of staking positions.  
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listStakingsTest() throws ApiException {
        String poolId = null;
        String statuses = null;
        UUID walletId = null;
        String tokenId = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListStakings200Response response = api.listStakings(poolId, statuses, walletId, tokenId, limit, before, after);
        // TODO: test validations
    }

}
