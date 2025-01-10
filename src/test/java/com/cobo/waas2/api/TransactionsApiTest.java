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
import com.cobo.waas2.model.BroadcastSignedTransactions201ResponseInner;
import com.cobo.waas2.model.BroadcastSignedTransactionsRequest;
import com.cobo.waas2.model.CheckLoopTransfers200ResponseInner;
import com.cobo.waas2.model.ContractCallParams;
import com.cobo.waas2.model.CreateTransferTransaction201Response;
import com.cobo.waas2.model.ErrorResponse;
import com.cobo.waas2.model.EstimateFeeParams;
import com.cobo.waas2.model.EstimatedFee;
import com.cobo.waas2.model.ListTransactions200Response;
import com.cobo.waas2.model.MessageSignParams;
import com.cobo.waas2.model.TransactionDetail;
import com.cobo.waas2.model.TransactionRbf;
import com.cobo.waas2.model.TransactionResend;
import com.cobo.waas2.model.TransferParams;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionsApi
 */
@Disabled
public class TransactionsApiTest {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // set custom base url
    {
        defaultClient.setBasePath("https://api.sandbox.cobo.com/v2");
        defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    }
    private final TransactionsApi api = new TransactionsApi();

    /**
     * Broadcast signed transactions
     *
     * &lt;Note&gt;This operation is only applicable to the staking scenarios.&lt;/Note&gt; This operation broadcasts a list of signed transactions.   If you set &#x60;auto_broadcast&#x60; to &#x60;false&#x60; when [creating a staking activity](https://www.cobo.com/developers/v2/api-references/staking/create-stake-activity), the transaction will not be submitted to the blockchain automatically after being signed. In such cases, you can call this operation to broadcast the transaction to the blockchain.  A transaction can only be broadcast if its status is &#x60;Broadcasting&#x60;. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void broadcastSignedTransactionsTest() throws ApiException {
        BroadcastSignedTransactionsRequest broadcastSignedTransactionsRequest = null;
        List<BroadcastSignedTransactions201ResponseInner> response = api.broadcastSignedTransactions(broadcastSignedTransactionsRequest);
        // TODO: test validations
    }

    /**
     * Cancel transaction
     *
     * This operation cancels a specified transaction. Canceling a transaction stops it while it is still pending. For more information, see [Cancel a transaction](https://www.cobo.com/developers/v2/guides/transactions/manage-transactions#cancel-a-transaction).  &lt;Note&gt;This operation only applies to transactions from MPC Wallets and Smart Contract Wallets.&lt;/Note&gt;  A transaction can be cancelled if its status is either of the following: - &#x60;Submitted&#x60; - &#x60;PendingScreening&#x60; - &#x60;PendingAuthorization&#x60; - &#x60;PendingSignature&#x60;  
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelTransactionByIdTest() throws ApiException {
        UUID transactionId = null;
        CreateTransferTransaction201Response response = api.cancelTransactionById(transactionId);
        // TODO: test validations
    }

    /**
     * Check Cobo Loop transfers
     *
     * This operation verifies if the transactions from a given source wallet to a list of given destinations can be executed as Cobo Loop transfers.   For more information about Cobo Loop, see [Cobo Loop&#39;s product manuals](https://manuals.cobo.com/en/portal/custodial-wallets/cobo-loop). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkLoopTransfersTest() throws ApiException {
        String tokenId = null;
        UUID sourceWalletId = null;
        String destinationAddresses = null;
        List<CheckLoopTransfers200ResponseInner> response = api.checkLoopTransfers(tokenId, sourceWalletId, destinationAddresses);
        // TODO: test validations
    }

    /**
     * Call smart contract
     *
     * This operation creates a transaction to interact with a smart contract on the blockchain.  You need to provide details such as the source address, destination address, and the calldata. You can specify the fee-related properties to limit the transaction fee. A transaction request for tracking is returned upon successful operation.  &lt;Note&gt;Currently, this operation only applies to the transactions from MPC Wallets or Smart Contract Wallets on the blockchains that have a similar architecture to Ethereum.&lt;/Note&gt;  &lt;Info&gt;If you initiate a transaction from a Smart Contract Wallet, a relevant transaction will be triggered from the Delegate to the Cobo Safe&#39;s address of the Smart Contract Wallet, with a transfer amount of &lt;code&gt;0&lt;/code&gt;.&lt;/Info&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createContractCallTransactionTest() throws ApiException {
        ContractCallParams contractCallParams = null;
        CreateTransferTransaction201Response response = api.createContractCallTransaction(contractCallParams);
        // TODO: test validations
    }

    /**
     * Sign message
     *
     * This operation creates a transaction to sign the provided message using cryptographic techniques.  In some scenarios, you want to sign a message for identity authentication or transaction approval. You need to provide details such as the source address, destination address, and the message to be signed. A transaction request for tracking is returned upon successful operation.  You can get the signature result by calling [Get transaction information](https://www.cobo.com/developers/v2/api-references/transactions/get-transaction-information).   &lt;Note&gt;This operation only applies to transactions from MPC Wallets.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMessageSignTransactionTest() throws ApiException {
        MessageSignParams messageSignParams = null;
        CreateTransferTransaction201Response response = api.createMessageSignTransaction(messageSignParams);
        // TODO: test validations
    }

    /**
     * Transfer token
     *
     * The operation transfers your assets from a wallet created on Cobo Portal to another address.  You need to specify details such as the sender address and recipient address, token ID, and the amount to transfer. You can specify the fee-related properties to limit the transaction fee. A transaction request for tracking is returned upon successful operation.  &lt;Note&gt;If you make transfers from Custodial Wallets, do not set the fee-related properties. Otherwise, the transaction will fail.&lt;/Note&gt;  &lt;Note&gt;You can transfer tokens to multiple addresses only if you use MPC Wallets as the transaction source. You should use the &lt;code&gt;utxo_outputs&lt;/code&gt; property to specify the destination addresses.&lt;/Note&gt;  &lt;Info&gt;If you initiate a transaction from a Smart Contract Wallet, a relevant transaction will be triggered from the Delegate to the Cobo Safe&#39;s address of the Smart Contract Wallet, with a transfer amount of &lt;code&gt;0&lt;/code&gt;.&lt;/Info&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTransferTransactionTest() throws ApiException {
        TransferParams transferParams = null;
        CreateTransferTransaction201Response response = api.createTransferTransaction(transferParams);
        // TODO: test validations
    }

    /**
     * Drop transaction
     *
     * This operation drops a specified transaction. Dropping a transaction leverages RBF to replace the original transaction with a version that effectively cancels it. For more details about dropping a transaction, refer to [Drop a transaction](https://www.cobo.com/developers/v2/guides/transactions/manage-transactions#drop-a-transaction).  A transaction can be sped up only if its status is &#x60;Broadcasting&#x60;.  &lt;Note&gt;This operation only applies to transactions from MPC Wallets and Smart Contract Wallets. It does not apply to transactions on the following chains: VET, TRON, TVET, SOL, and TON.&lt;/Note&gt;  You can use the &#x60;address&#x60; or &#x60;included_utxos&#x60; properties in the request body to specify the address or UTXOs that will cover the transaction fee. Generally, the transaction fee is paid by the original transaction&#39;s source. If that source&#39;s balance is insufficient, the specified address or UTXOs can be used to cover the fee. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void dropTransactionByIdTest() throws ApiException {
        UUID transactionId = null;
        TransactionRbf transactionRbf = null;
        CreateTransferTransaction201Response response = api.dropTransactionById(transactionId, transactionRbf);
        // TODO: test validations
    }

    /**
     * Estimate transaction fee
     *
     * This operation estimates the transaction fee of a token transfer or a contract call based on the fee model that the chain uses, considering factors such as network congestion and transaction complexity.  You need to specify the transaction information, including the request ID, request type, source address, destination address, token ID (only applicable to token transfers), and chain ID (only applicable to contract calls).  The response can contain different properties based on the transaction fee model used by the chain. For the legacy, EIP-1559, and UTXO fee models, Cobo also supports three different transaction speed levels: slow, recommended, and fast. For more information about estimating transaction fees, refer to [Estimate transaction fee](https://www.cobo.com/developers/v2/guides/transactions/estimate-fees). 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void estimateFeeTest() throws ApiException {
        EstimateFeeParams estimateFeeParams = null;
        EstimatedFee response = api.estimateFee(estimateFeeParams);
        // TODO: test validations
    }

    /**
     * Get transaction information
     *
     * This operation retrieves detailed information about a specified transaction, such as the transaction status, source address, destination address, and timestamp. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTransactionByIdTest() throws ApiException {
        UUID transactionId = null;
        TransactionDetail response = api.getTransactionById(transactionId);
        // TODO: test validations
    }

    /**
     * List all transactions
     *
     * This operation retrieves all the transactions under your organization.  You can filter the results by request ID, Cobo ID, transaction ID, transaction hash, type, status, and timestamps. You can also paginate and sort your query results. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTransactionsTest() throws ApiException {
        String requestId = null;
        String coboIds = null;
        String transactionIds = null;
        String transactionHashes = null;
        String types = null;
        String statuses = null;
        String walletIds = null;
        String chainIds = null;
        String tokenIds = null;
        String assetIds = null;
        UUID vaultId = null;
        UUID projectId = null;
        Long minCreatedTimestamp = null;
        Long maxCreatedTimestamp = null;
        Integer limit = null;
        String before = null;
        String after = null;
        ListTransactions200Response response = api.listTransactions(requestId, coboIds, transactionIds, transactionHashes, types, statuses, walletIds, chainIds, tokenIds, assetIds, vaultId, projectId, minCreatedTimestamp, maxCreatedTimestamp, limit, before, after);
        // TODO: test validations
    }

    /**
     * Resend transaction
     *
     * This operation resends a specified transaction. Resending a transaction means retrying a previously failed transaction. For more details about resending a transaction, see [Resend a transaction](/v2/guides/transactions/manage-transactions#resend-a-transaction).  A transaction can be resent if its status is &#x60;failed&#x60;.  &lt;Note&gt;This operation only applies to transactions from MPC Wallets in the SOL token.&lt;/Note&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void resendTransactionByIdTest() throws ApiException {
        UUID transactionId = null;
        TransactionResend transactionResend = null;
        CreateTransferTransaction201Response response = api.resendTransactionById(transactionId, transactionResend);
        // TODO: test validations
    }

    /**
     * Speed up transaction
     *
     * This operation accelerates a specified transaction. Speeding up a transaction will trigger a Replace-By-Fee (RBF) transaction which is a new version of the original transaction. For more details about speeding up a transaction, refer to [Speed up a transaction](/v2/guides/transactions/manage-transactions#speed-up-a-transaction).  You can use the &#x60;address&#x60; or &#x60;included_utxos&#x60; properties in the request body to specify the address or UTXOs that will cover the transaction fee. Generally, the transaction fee is paid by the original transaction&#39;s source. If that source&#39;s balance is insufficient, the specified address or UTXOs can be used to cover the fee.  A transaction can be sped up only if its status is &#x60;Broadcasting&#x60;.  &lt;Note&gt;This operation only applies to transactions from MPC Wallets and Smart Contract Wallets. It does not apply to transactions on the following chains: VET, TRON, TVET, SOL, and TON.&lt;/Note&gt;  &lt;Info&gt;If you speed up a transaction from a Smart Contract Wallet, two RBF transactions will be triggered, one for the transaction from the Smart Contract Wallet, and the other for the transaction from the Delegate.&lt;/Info&gt; 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void speedupTransactionByIdTest() throws ApiException {
        UUID transactionId = null;
        TransactionRbf transactionRbf = null;
        CreateTransferTransaction201Response response = api.speedupTransactionById(transactionId, transactionRbf);
        // TODO: test validations
    }

}
