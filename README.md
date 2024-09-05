# cobo-waas2-java-sdk

Cobo Wallet as a Service 2.0
- API version: 1.2.0
  - Generator version: 7.6.0

The Cobo Wallet-as-a-Service (WaaS) 2.0 API is the latest version of Cobo’s WaaS API offering. It enables you to access Cobo’s full suite of crypto wallet technologies with powerful and flexible access controls. By encapsulating complex security protocols and streamlining blockchain interactions, this API allows you to concentrate on your core business activities without worrying about the safety of your assets. The WaaS 2.0 API presents the following key features:

- A unified API for Cobo’s [all four wallet types](https://manuals.cobo.com/en/portal/introduction#an-all-in-one-wallet-platform)
- Support for 80+ chains and 3000+ tokens
- A comprehensive selection of webhook events
- Flexible usage models for MPC wallets, including [Organization-Controlled Wallets](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/introduction) and [User-Controlled Wallets](https://manuals.cobo.com/en/portal/mpc-wallets/ucw/introduction)
- Programmatic control of smart contract wallets such as Safe{Wallet} with fine-grained access controls
- Seamlessly transfer funds across multiple exchanges, including Binance, OKX, Bybit, Deribit, and more

For more information about the WaaS 2.0 API, see [Introduction to WaaS 2.0](https://www.cobo.com/developers/v2/guides/overview/introduction).


  For more information, please visit [https://www.cobo.com/waas](https://www.cobo.com/waas)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.cobo.waas2</groupId>
  <artifactId>cobo-waas2</artifactId>
  <version>1.2.2</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'cobo-waas2' jar has been published to maven central.
    mavenLocal()       // Needed if the 'cobo-waas2' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.cobo.waas2:cobo-waas2:1.2.2"
  }
```

### Callback/Webhook Server Demo
A server demo for callback and webhook was implemented at `src/main/java/com/cobo/waas2/demo`.
Run this demo with command:

```shell
mvn spring-boot:run
```

or

```shell
./gradlew bootRun
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/cobo-waas2-1.2.2.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
// Import classes:
import com.cobo.waas2.ApiClient;
import com.cobo.waas2.ApiException;
import com.cobo.waas2.Configuration;
import com.cobo.waas2.model.*;
import com.cobo.waas2.api.WalletsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    // for dev environment
    // defaultClient.setEnv(Env.DEV);
    // for production environment
    // defaultClient.setEnv(Env.PROD);
    defaultClient.setPrivKey("<YOUR_API_PRIVATE_KEY_IN_HEX>");
    WalletsApi apiInstance = new WalletsApi();
    WalletType walletType = WalletType.fromValue("Custodial");
    WalletSubtype walletSubtype = WalletSubtype.fromValue("Asset");
    String chainIds = "BTC,ETH";
    Integer limit = 10;
    String before = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGmk1";
    String after = "RqeEoTkgKG5rpzqYzg2Hd3szmPoj2cE7w5jWwShz3C1vyGSAk";
    try {
      ListSupportedChains200Response result = apiInstance.listSupportedChains(walletType, walletSubtype, chainIds, limit, before, after);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WalletsApi#listSupportedChains");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

## Documentation for API Endpoints

All URIs are relative to *https://api.dev.cobo.com/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DevelopersWebhooksApi* | [**createWebhookEndpoint**](docs/DevelopersWebhooksApi.md#createWebhookEndpoint) | **POST** /webhooks/endpoints | Register webhook endpoint
*DevelopersWebhooksApi* | [**getWebhookEndpointById**](docs/DevelopersWebhooksApi.md#getWebhookEndpointById) | **GET** /webhooks/endpoints/{endpoint_id} | Get webhook endpoint information
*DevelopersWebhooksApi* | [**getWebhookEventById**](docs/DevelopersWebhooksApi.md#getWebhookEventById) | **GET** /webhooks/endpoints/{endpoint_id}/events/{event_id} | Retrieve event information
*DevelopersWebhooksApi* | [**listWebhookEndpoints**](docs/DevelopersWebhooksApi.md#listWebhookEndpoints) | **GET** /webhooks/endpoints | List webhook endpoints
*DevelopersWebhooksApi* | [**listWebhookEventDefinitions**](docs/DevelopersWebhooksApi.md#listWebhookEventDefinitions) | **GET** /webhooks/events/definitions | Get webhook event types
*DevelopersWebhooksApi* | [**listWebhookEventLogs**](docs/DevelopersWebhooksApi.md#listWebhookEventLogs) | **GET** /webhooks/endpoints/{endpoint_id}/events/{event_id}/logs | List webhook event logs
*DevelopersWebhooksApi* | [**listWebhookEvents**](docs/DevelopersWebhooksApi.md#listWebhookEvents) | **GET** /webhooks/endpoints/{endpoint_id}/events | List all webhook events
*DevelopersWebhooksApi* | [**retryWebhookEventById**](docs/DevelopersWebhooksApi.md#retryWebhookEventById) | **POST** /webhooks/endpoints/{endpoint_id}/events/{event_id}/retry | Retry event
*DevelopersWebhooksApi* | [**updateWebhookEndpointById**](docs/DevelopersWebhooksApi.md#updateWebhookEndpointById) | **PUT** /webhooks/endpoints/{endpoint_id} | Update webhook endpoint
*OAuthApi* | [**getToken**](docs/OAuthApi.md#getToken) | **GET** /oauth/token | Get access token
*OAuthApi* | [**refreshToken**](docs/OAuthApi.md#refreshToken) | **POST** /oauth/token | Refresh access token
*TransactionsApi* | [**cancelTransactionById**](docs/TransactionsApi.md#cancelTransactionById) | **POST** /transactions/{transaction_id}/cancel | Cancel transaction
*TransactionsApi* | [**createContractCallTransaction**](docs/TransactionsApi.md#createContractCallTransaction) | **POST** /transactions/contract_call | Call smart contract
*TransactionsApi* | [**createMessageSignTransaction**](docs/TransactionsApi.md#createMessageSignTransaction) | **POST** /transactions/message_sign | Sign message
*TransactionsApi* | [**createTransferTransaction**](docs/TransactionsApi.md#createTransferTransaction) | **POST** /transactions/transfer | Transfer token
*TransactionsApi* | [**dropTransactionById**](docs/TransactionsApi.md#dropTransactionById) | **POST** /transactions/{transaction_id}/drop | Drop transaction
*TransactionsApi* | [**estimateFee**](docs/TransactionsApi.md#estimateFee) | **POST** /transactions/estimate_fee | Estimate transaction fee
*TransactionsApi* | [**getTransactionById**](docs/TransactionsApi.md#getTransactionById) | **GET** /transactions/{transaction_id} | Get transaction information
*TransactionsApi* | [**listTransactions**](docs/TransactionsApi.md#listTransactions) | **GET** /transactions | List all transactions
*TransactionsApi* | [**resendTransactionById**](docs/TransactionsApi.md#resendTransactionById) | **POST** /transactions/{transaction_id}/resend | Resend transaction
*TransactionsApi* | [**speedupTransactionById**](docs/TransactionsApi.md#speedupTransactionById) | **POST** /transactions/{transaction_id}/speedup | Speed up transaction
*WalletsApi* | [**checkAddressValidity**](docs/WalletsApi.md#checkAddressValidity) | **GET** /wallets/check_address_validity | Check address validity
*WalletsApi* | [**checkAddressesValidity**](docs/WalletsApi.md#checkAddressesValidity) | **GET** /wallets/check_addresses_validity | Check addresses validity
*WalletsApi* | [**checkLoopTransfers**](docs/WalletsApi.md#checkLoopTransfers) | **GET** /wallets/check_loop_transfers | Check Loop transfers
*WalletsApi* | [**createAddress**](docs/WalletsApi.md#createAddress) | **POST** /wallets/{wallet_id}/addresses | Create addresses in wallet
*WalletsApi* | [**createWallet**](docs/WalletsApi.md#createWallet) | **POST** /wallets | Create wallet
*WalletsApi* | [**deleteWalletById**](docs/WalletsApi.md#deleteWalletById) | **POST** /wallets/{wallet_id}/delete | Delete wallet
*WalletsApi* | [**getAddress**](docs/WalletsApi.md#getAddress) | **GET** /wallets/{wallet_id}/addresses/{address} | Get address information
*WalletsApi* | [**getChainById**](docs/WalletsApi.md#getChainById) | **GET** /wallets/chains/{chain_id} | Get chain information
*WalletsApi* | [**getMaxTransferableValue**](docs/WalletsApi.md#getMaxTransferableValue) | **GET** /wallets/{wallet_id}/max_transferable_value | Get maximum transferable value
*WalletsApi* | [**getTokenById**](docs/WalletsApi.md#getTokenById) | **GET** /wallets/tokens/{token_id} | Get token information
*WalletsApi* | [**getWalletById**](docs/WalletsApi.md#getWalletById) | **GET** /wallets/{wallet_id} | Get wallet information
*WalletsApi* | [**listAddresses**](docs/WalletsApi.md#listAddresses) | **GET** /wallets/{wallet_id}/addresses | List wallet addresses
*WalletsApi* | [**listEnabledChains**](docs/WalletsApi.md#listEnabledChains) | **GET** /wallets/enabled_chains | List enabled chains
*WalletsApi* | [**listEnabledTokens**](docs/WalletsApi.md#listEnabledTokens) | **GET** /wallets/enabled_tokens | List enabled tokens
*WalletsApi* | [**listSupportedChains**](docs/WalletsApi.md#listSupportedChains) | **GET** /wallets/chains | List supported chains
*WalletsApi* | [**listSupportedTokens**](docs/WalletsApi.md#listSupportedTokens) | **GET** /wallets/tokens | List supported tokens
*WalletsApi* | [**listTokenBalancesForAddress**](docs/WalletsApi.md#listTokenBalancesForAddress) | **GET** /wallets/{wallet_id}/addresses/{address}/tokens | List token balances by address
*WalletsApi* | [**listTokenBalancesForWallet**](docs/WalletsApi.md#listTokenBalancesForWallet) | **GET** /wallets/{wallet_id}/tokens | List token balances by wallet
*WalletsApi* | [**listUtxos**](docs/WalletsApi.md#listUtxos) | **GET** /wallets/{wallet_id}/utxos | List UTXOs
*WalletsApi* | [**listWallets**](docs/WalletsApi.md#listWallets) | **GET** /wallets | List all wallets
*WalletsApi* | [**lockUtxos**](docs/WalletsApi.md#lockUtxos) | **POST** /wallets/{wallet_id}/utxos/lock | Lock UTXOs
*WalletsApi* | [**unlockUtxos**](docs/WalletsApi.md#unlockUtxos) | **POST** /wallets/{wallet_id}/utxos/unlock | Unlock UTXOs
*WalletsApi* | [**updateWalletById**](docs/WalletsApi.md#updateWalletById) | **PUT** /wallets/{wallet_id} | Update wallet
*WalletsExchangeWalletApi* | [**listAssetBalancesForExchangeWallet**](docs/WalletsExchangeWalletApi.md#listAssetBalancesForExchangeWallet) | **GET** /wallets/{wallet_id}/exchanges/assets | List asset balances
*WalletsExchangeWalletApi* | [**listExchanges**](docs/WalletsExchangeWalletApi.md#listExchanges) | **GET** /wallets/exchanges | List supported exchanges
*WalletsExchangeWalletApi* | [**listSupportedAssetsForExchange**](docs/WalletsExchangeWalletApi.md#listSupportedAssetsForExchange) | **GET** /wallets/exchanges/{exchange_id}/assets | List supported assets
*WalletsExchangeWalletApi* | [**listSupportedChainsForExchange**](docs/WalletsExchangeWalletApi.md#listSupportedChainsForExchange) | **GET** /wallets/exchanges/{exchange_id}/assets/{asset_id}/chains | List supported chains
*WalletsMpcWalletsApi* | [**cancelTssRequestById**](docs/WalletsMpcWalletsApi.md#cancelTssRequestById) | **POST** /wallets/mpc/vaults/{vault_id}/tss_requests/{tss_request_id}/cancel | Cancel TSS request
*WalletsMpcWalletsApi* | [**createKeyShareHolderGroup**](docs/WalletsMpcWalletsApi.md#createKeyShareHolderGroup) | **POST** /wallets/mpc/vaults/{vault_id}/key_share_holder_groups | Create key share holder group
*WalletsMpcWalletsApi* | [**createMpcProject**](docs/WalletsMpcWalletsApi.md#createMpcProject) | **POST** /wallets/mpc/projects | Create project
*WalletsMpcWalletsApi* | [**createMpcVault**](docs/WalletsMpcWalletsApi.md#createMpcVault) | **POST** /wallets/mpc/vaults | Create vault
*WalletsMpcWalletsApi* | [**createTssRequest**](docs/WalletsMpcWalletsApi.md#createTssRequest) | **POST** /wallets/mpc/vaults/{vault_id}/tss_requests | Create TSS request
*WalletsMpcWalletsApi* | [**deleteKeyShareHolderGroupById**](docs/WalletsMpcWalletsApi.md#deleteKeyShareHolderGroupById) | **POST** /wallets/mpc/vaults/{vault_id}/key_share_holder_groups/{key_share_holder_group_id}/delete | Delete key share holder group
*WalletsMpcWalletsApi* | [**getKeyShareHolderGroupById**](docs/WalletsMpcWalletsApi.md#getKeyShareHolderGroupById) | **GET** /wallets/mpc/vaults/{vault_id}/key_share_holder_groups/{key_share_holder_group_id} | Get key share holder group information
*WalletsMpcWalletsApi* | [**getMpcProjectById**](docs/WalletsMpcWalletsApi.md#getMpcProjectById) | **GET** /wallets/mpc/projects/{project_id} | Get project information
*WalletsMpcWalletsApi* | [**getMpcVaultById**](docs/WalletsMpcWalletsApi.md#getMpcVaultById) | **GET** /wallets/mpc/vaults/{vault_id} | Get vault information
*WalletsMpcWalletsApi* | [**getTssRequestById**](docs/WalletsMpcWalletsApi.md#getTssRequestById) | **GET** /wallets/mpc/vaults/{vault_id}/tss_requests/{tss_request_id} | Get TSS request
*WalletsMpcWalletsApi* | [**listCoboKeyHolders**](docs/WalletsMpcWalletsApi.md#listCoboKeyHolders) | **GET** /wallets/mpc/cobo_key_share_holders | List all Cobo key share holders
*WalletsMpcWalletsApi* | [**listKeyShareHolderGroups**](docs/WalletsMpcWalletsApi.md#listKeyShareHolderGroups) | **GET** /wallets/mpc/vaults/{vault_id}/key_share_holder_groups | List all key share holder groups
*WalletsMpcWalletsApi* | [**listMpcProjects**](docs/WalletsMpcWalletsApi.md#listMpcProjects) | **GET** /wallets/mpc/projects | List all projects
*WalletsMpcWalletsApi* | [**listMpcVaults**](docs/WalletsMpcWalletsApi.md#listMpcVaults) | **GET** /wallets/mpc/vaults | List all vaults
*WalletsMpcWalletsApi* | [**listTssRequests**](docs/WalletsMpcWalletsApi.md#listTssRequests) | **GET** /wallets/mpc/vaults/{vault_id}/tss_requests | List TSS requests
*WalletsMpcWalletsApi* | [**updateKeyShareHolderGroupById**](docs/WalletsMpcWalletsApi.md#updateKeyShareHolderGroupById) | **PUT** /wallets/mpc/vaults/{vault_id}/key_share_holder_groups/{key_share_holder_group_id} | Update key share holder group
*WalletsMpcWalletsApi* | [**updateMpcProjectById**](docs/WalletsMpcWalletsApi.md#updateMpcProjectById) | **PUT** /wallets/mpc/projects/{project_id} | Update project name
*WalletsMpcWalletsApi* | [**updateMpcVaultById**](docs/WalletsMpcWalletsApi.md#updateMpcVaultById) | **PUT** /wallets/mpc/vaults/{vault_id} | Update vault name


## Documentation for Models

 - [Activity](docs/Activity.md)
 - [ActivityAction](docs/ActivityAction.md)
 - [ActivityInitiator](docs/ActivityInitiator.md)
 - [ActivityStatus](docs/ActivityStatus.md)
 - [ActivityTimeline](docs/ActivityTimeline.md)
 - [ActivityType](docs/ActivityType.md)
 - [AddressEncoding](docs/AddressEncoding.md)
 - [AddressInfo](docs/AddressInfo.md)
 - [AddressTransferDestination](docs/AddressTransferDestination.md)
 - [AddressTransferDestinationAccountOutput](docs/AddressTransferDestinationAccountOutput.md)
 - [AddressTransferDestinationUtxoOutputsInner](docs/AddressTransferDestinationUtxoOutputsInner.md)
 - [AmountDetailsInner](docs/AmountDetailsInner.md)
 - [AmountStatus](docs/AmountStatus.md)
 - [AssetBalance](docs/AssetBalance.md)
 - [AssetInfo](docs/AssetInfo.md)
 - [BabylonStakeExtra](docs/BabylonStakeExtra.md)
 - [BabylonValidator](docs/BabylonValidator.md)
 - [BaseContractCallSource](docs/BaseContractCallSource.md)
 - [BaseEstimateStakingFee](docs/BaseEstimateStakingFee.md)
 - [BaseStakeExtra](docs/BaseStakeExtra.md)
 - [ChainInfo](docs/ChainInfo.md)
 - [CheckAddressValidity200Response](docs/CheckAddressValidity200Response.md)
 - [CheckAddressesValidity200ResponseInner](docs/CheckAddressesValidity200ResponseInner.md)
 - [CheckLoopTransfers200ResponseInner](docs/CheckLoopTransfers200ResponseInner.md)
 - [CoboSafeDelegate](docs/CoboSafeDelegate.md)
 - [CoboSafeDelegateType](docs/CoboSafeDelegateType.md)
 - [ContractCallDestination](docs/ContractCallDestination.md)
 - [ContractCallDestinationType](docs/ContractCallDestinationType.md)
 - [ContractCallParams](docs/ContractCallParams.md)
 - [ContractCallSource](docs/ContractCallSource.md)
 - [ContractCallSourceType](docs/ContractCallSourceType.md)
 - [CreateAddressRequest](docs/CreateAddressRequest.md)
 - [CreateCustodialWalletParams](docs/CreateCustodialWalletParams.md)
 - [CreateExchangeWalletParams](docs/CreateExchangeWalletParams.md)
 - [CreateKeyShareHolder](docs/CreateKeyShareHolder.md)
 - [CreateKeyShareHolderGroupRequest](docs/CreateKeyShareHolderGroupRequest.md)
 - [CreateMpcProjectRequest](docs/CreateMpcProjectRequest.md)
 - [CreateMpcVaultRequest](docs/CreateMpcVaultRequest.md)
 - [CreateMpcWalletParams](docs/CreateMpcWalletParams.md)
 - [CreateSafeWalletParams](docs/CreateSafeWalletParams.md)
 - [CreateSmartContractWalletParams](docs/CreateSmartContractWalletParams.md)
 - [CreateStakeActivity](docs/CreateStakeActivity.md)
 - [CreateStakeActivityExtra](docs/CreateStakeActivityExtra.md)
 - [CreateTransferTransaction201Response](docs/CreateTransferTransaction201Response.md)
 - [CreateTssRequestRequest](docs/CreateTssRequestRequest.md)
 - [CreateUnstakeActivity](docs/CreateUnstakeActivity.md)
 - [CreateWalletParams](docs/CreateWalletParams.md)
 - [CreateWebhookEndpointRequest](docs/CreateWebhookEndpointRequest.md)
 - [CreateWithdrawActivity](docs/CreateWithdrawActivity.md)
 - [CreatedWalletInfo](docs/CreatedWalletInfo.md)
 - [CurveType](docs/CurveType.md)
 - [CustodialTransferSource](docs/CustodialTransferSource.md)
 - [CustodialWalletInfo](docs/CustodialWalletInfo.md)
 - [DeleteKeyShareHolderGroupById201Response](docs/DeleteKeyShareHolderGroupById201Response.md)
 - [DeleteWalletById201Response](docs/DeleteWalletById201Response.md)
 - [EigenLayerLstStakeExtra](docs/EigenLayerLstStakeExtra.md)
 - [EigenLayerNativeStakeExtra](docs/EigenLayerNativeStakeExtra.md)
 - [EigenlayerValidator](docs/EigenlayerValidator.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [EstimateContractCallFeeParams](docs/EstimateContractCallFeeParams.md)
 - [EstimateFeeParams](docs/EstimateFeeParams.md)
 - [EstimateFeeRequestType](docs/EstimateFeeRequestType.md)
 - [EstimateStakeFee](docs/EstimateStakeFee.md)
 - [EstimateTransferFeeParams](docs/EstimateTransferFeeParams.md)
 - [EstimateUnstakeFee](docs/EstimateUnstakeFee.md)
 - [EstimateWithdrawFee](docs/EstimateWithdrawFee.md)
 - [EstimatedEvmEip1559Fee](docs/EstimatedEvmEip1559Fee.md)
 - [EstimatedEvmEip1559FeeSlow](docs/EstimatedEvmEip1559FeeSlow.md)
 - [EstimatedEvmLegacyFee](docs/EstimatedEvmLegacyFee.md)
 - [EstimatedEvmLegacyFeeSlow](docs/EstimatedEvmLegacyFeeSlow.md)
 - [EstimatedFee](docs/EstimatedFee.md)
 - [EstimatedFixedFee](docs/EstimatedFixedFee.md)
 - [EstimatedUtxoFee](docs/EstimatedUtxoFee.md)
 - [EstimatedUtxoFeeSlow](docs/EstimatedUtxoFeeSlow.md)
 - [EvmContractCallDestination](docs/EvmContractCallDestination.md)
 - [EvmEIP191MessageSignDestination](docs/EvmEIP191MessageSignDestination.md)
 - [EvmEIP712MessageSignDestination](docs/EvmEIP712MessageSignDestination.md)
 - [EvmEip1559FeeBasePrice](docs/EvmEip1559FeeBasePrice.md)
 - [EvmEip1559FeeRate](docs/EvmEip1559FeeRate.md)
 - [EvmLegacyFeeBasePrice](docs/EvmLegacyFeeBasePrice.md)
 - [EvmLegacyFeeRate](docs/EvmLegacyFeeRate.md)
 - [ExchangeId](docs/ExchangeId.md)
 - [ExchangeTransferDestination](docs/ExchangeTransferDestination.md)
 - [ExchangeTransferSource](docs/ExchangeTransferSource.md)
 - [ExchangeWalletInfo](docs/ExchangeWalletInfo.md)
 - [ExtendedTokenInfo](docs/ExtendedTokenInfo.md)
 - [FeeAmount](docs/FeeAmount.md)
 - [FeeGasLimit](docs/FeeGasLimit.md)
 - [FeeRate](docs/FeeRate.md)
 - [FeeType](docs/FeeType.md)
 - [FixedFeeRate](docs/FixedFeeRate.md)
 - [GetToken200Response](docs/GetToken200Response.md)
 - [GetToken4XXResponse](docs/GetToken4XXResponse.md)
 - [KeyShareHolder](docs/KeyShareHolder.md)
 - [KeyShareHolderGroup](docs/KeyShareHolderGroup.md)
 - [KeyShareHolderGroupStatus](docs/KeyShareHolderGroupStatus.md)
 - [KeyShareHolderGroupType](docs/KeyShareHolderGroupType.md)
 - [KeyShareHolderStatus](docs/KeyShareHolderStatus.md)
 - [KeyShareHolderType](docs/KeyShareHolderType.md)
 - [ListAddresses200Response](docs/ListAddresses200Response.md)
 - [ListAssetBalancesForExchangeWallet200Response](docs/ListAssetBalancesForExchangeWallet200Response.md)
 - [ListExchanges200ResponseInner](docs/ListExchanges200ResponseInner.md)
 - [ListKeyShareHolderGroups200Response](docs/ListKeyShareHolderGroups200Response.md)
 - [ListMpcProjects200Response](docs/ListMpcProjects200Response.md)
 - [ListMpcVaults200Response](docs/ListMpcVaults200Response.md)
 - [ListSupportedAssetsForExchange200Response](docs/ListSupportedAssetsForExchange200Response.md)
 - [ListSupportedChains200Response](docs/ListSupportedChains200Response.md)
 - [ListSupportedTokens200Response](docs/ListSupportedTokens200Response.md)
 - [ListTokenBalancesForAddress200Response](docs/ListTokenBalancesForAddress200Response.md)
 - [ListTransactions200Response](docs/ListTransactions200Response.md)
 - [ListTssRequests200Response](docs/ListTssRequests200Response.md)
 - [ListUtxos200Response](docs/ListUtxos200Response.md)
 - [ListWallets200Response](docs/ListWallets200Response.md)
 - [ListWebhookEndpoints200Response](docs/ListWebhookEndpoints200Response.md)
 - [ListWebhookEventDefinitions200ResponseInner](docs/ListWebhookEventDefinitions200ResponseInner.md)
 - [ListWebhookEventLogs200Response](docs/ListWebhookEventLogs200Response.md)
 - [ListWebhookEvents200Response](docs/ListWebhookEvents200Response.md)
 - [LockUtxos201Response](docs/LockUtxos201Response.md)
 - [LockUtxosRequest](docs/LockUtxosRequest.md)
 - [LockUtxosRequestUtxosInner](docs/LockUtxosRequestUtxosInner.md)
 - [MPCDelegate](docs/MPCDelegate.md)
 - [MPCProject](docs/MPCProject.md)
 - [MPCVault](docs/MPCVault.md)
 - [MPCVaultType](docs/MPCVaultType.md)
 - [MPCWalletInfo](docs/MPCWalletInfo.md)
 - [MaxFeeAmount](docs/MaxFeeAmount.md)
 - [MaxTransferableValue](docs/MaxTransferableValue.md)
 - [MessageSignDestination](docs/MessageSignDestination.md)
 - [MessageSignDestinationType](docs/MessageSignDestinationType.md)
 - [MessageSignParams](docs/MessageSignParams.md)
 - [MessageSignSource](docs/MessageSignSource.md)
 - [MessageSignSourceType](docs/MessageSignSourceType.md)
 - [MpcContractCallSource](docs/MpcContractCallSource.md)
 - [MpcMessageSignSource](docs/MpcMessageSignSource.md)
 - [MpcSigningGroup](docs/MpcSigningGroup.md)
 - [MpcTransferSource](docs/MpcTransferSource.md)
 - [Pagination](docs/Pagination.md)
 - [PoolDetails](docs/PoolDetails.md)
 - [PoolDetailsAllOfValidatorsInfo](docs/PoolDetailsAllOfValidatorsInfo.md)
 - [PoolSummary](docs/PoolSummary.md)
 - [RefreshToken200Response](docs/RefreshToken200Response.md)
 - [RefreshTokenRequest](docs/RefreshTokenRequest.md)
 - [ReplaceType](docs/ReplaceType.md)
 - [RetryWebhookEventById201Response](docs/RetryWebhookEventById201Response.md)
 - [RootPubkey](docs/RootPubkey.md)
 - [SafeContractCallSource](docs/SafeContractCallSource.md)
 - [SafeTransferSource](docs/SafeTransferSource.md)
 - [SafeWallet](docs/SafeWallet.md)
 - [SmartContractInitiator](docs/SmartContractInitiator.md)
 - [SmartContractWalletInfo](docs/SmartContractWalletInfo.md)
 - [SmartContractWalletOperationType](docs/SmartContractWalletOperationType.md)
 - [SmartContractWalletType](docs/SmartContractWalletType.md)
 - [SourceGroup](docs/SourceGroup.md)
 - [StakingPoolType](docs/StakingPoolType.md)
 - [StakingSource](docs/StakingSource.md)
 - [Stakings](docs/Stakings.md)
 - [StakingsValidatorInfo](docs/StakingsValidatorInfo.md)
 - [SubWalletAssetBalance](docs/SubWalletAssetBalance.md)
 - [TSSGroups](docs/TSSGroups.md)
 - [TSSRequest](docs/TSSRequest.md)
 - [TSSRequestStatus](docs/TSSRequestStatus.md)
 - [TSSRequestType](docs/TSSRequestType.md)
 - [TSSRequestWebhookEventData](docs/TSSRequestWebhookEventData.md)
 - [TokenBalance](docs/TokenBalance.md)
 - [TokenBalanceBalance](docs/TokenBalanceBalance.md)
 - [TokenInfo](docs/TokenInfo.md)
 - [Transaction](docs/Transaction.md)
 - [TransactionApprover](docs/TransactionApprover.md)
 - [TransactionBlockInfo](docs/TransactionBlockInfo.md)
 - [TransactionCustodialAssetWalletSource](docs/TransactionCustodialAssetWalletSource.md)
 - [TransactionDepositFromAddressSource](docs/TransactionDepositFromAddressSource.md)
 - [TransactionDepositFromLoopSource](docs/TransactionDepositFromLoopSource.md)
 - [TransactionDepositFromWalletSource](docs/TransactionDepositFromWalletSource.md)
 - [TransactionDepositToAddressDestination](docs/TransactionDepositToAddressDestination.md)
 - [TransactionDepositToWalletDestination](docs/TransactionDepositToWalletDestination.md)
 - [TransactionDestination](docs/TransactionDestination.md)
 - [TransactionDestinationType](docs/TransactionDestinationType.md)
 - [TransactionDetail](docs/TransactionDetail.md)
 - [TransactionDetails](docs/TransactionDetails.md)
 - [TransactionEvmContractDestination](docs/TransactionEvmContractDestination.md)
 - [TransactionEvmEip1559Fee](docs/TransactionEvmEip1559Fee.md)
 - [TransactionEvmLegacyFee](docs/TransactionEvmLegacyFee.md)
 - [TransactionExchangeWalletSource](docs/TransactionExchangeWalletSource.md)
 - [TransactionFee](docs/TransactionFee.md)
 - [TransactionFeeStationWalletSource](docs/TransactionFeeStationWalletSource.md)
 - [TransactionFixedFee](docs/TransactionFixedFee.md)
 - [TransactionInitiatorType](docs/TransactionInitiatorType.md)
 - [TransactionMPCWalletSource](docs/TransactionMPCWalletSource.md)
 - [TransactionMessageSignEIP191Destination](docs/TransactionMessageSignEIP191Destination.md)
 - [TransactionMessageSignEIP712Destination](docs/TransactionMessageSignEIP712Destination.md)
 - [TransactionRawTxInfo](docs/TransactionRawTxInfo.md)
 - [TransactionRbf](docs/TransactionRbf.md)
 - [TransactionRbfSource](docs/TransactionRbfSource.md)
 - [TransactionReplacement](docs/TransactionReplacement.md)
 - [TransactionRequestEvmEip1559Fee](docs/TransactionRequestEvmEip1559Fee.md)
 - [TransactionRequestEvmLegacyFee](docs/TransactionRequestEvmLegacyFee.md)
 - [TransactionRequestFee](docs/TransactionRequestFee.md)
 - [TransactionRequestFixedFee](docs/TransactionRequestFixedFee.md)
 - [TransactionRequestUtxoFee](docs/TransactionRequestUtxoFee.md)
 - [TransactionResend](docs/TransactionResend.md)
 - [TransactionResult](docs/TransactionResult.md)
 - [TransactionResultType](docs/TransactionResultType.md)
 - [TransactionSignatureResult](docs/TransactionSignatureResult.md)
 - [TransactionSigner](docs/TransactionSigner.md)
 - [TransactionSmartContractSafeWalletSource](docs/TransactionSmartContractSafeWalletSource.md)
 - [TransactionSource](docs/TransactionSource.md)
 - [TransactionSourceType](docs/TransactionSourceType.md)
 - [TransactionStatus](docs/TransactionStatus.md)
 - [TransactionSubStatus](docs/TransactionSubStatus.md)
 - [TransactionTimeline](docs/TransactionTimeline.md)
 - [TransactionTokeApproval](docs/TransactionTokeApproval.md)
 - [TransactionTokenAmount](docs/TransactionTokenAmount.md)
 - [TransactionTransferToAddressDestination](docs/TransactionTransferToAddressDestination.md)
 - [TransactionTransferToAddressDestinationAccountOutput](docs/TransactionTransferToAddressDestinationAccountOutput.md)
 - [TransactionTransferToAddressDestinationUtxoOutputsInner](docs/TransactionTransferToAddressDestinationUtxoOutputsInner.md)
 - [TransactionTransferToWalletDestination](docs/TransactionTransferToWalletDestination.md)
 - [TransactionType](docs/TransactionType.md)
 - [TransactionUtxo](docs/TransactionUtxo.md)
 - [TransactionUtxoFee](docs/TransactionUtxoFee.md)
 - [TransactionWebhookEventData](docs/TransactionWebhookEventData.md)
 - [TransferDestination](docs/TransferDestination.md)
 - [TransferDestinationType](docs/TransferDestinationType.md)
 - [TransferParams](docs/TransferParams.md)
 - [TransferSource](docs/TransferSource.md)
 - [UTXO](docs/UTXO.md)
 - [UpdateCustodialWalletParams](docs/UpdateCustodialWalletParams.md)
 - [UpdateExchangeWalletParams](docs/UpdateExchangeWalletParams.md)
 - [UpdateGroupAction](docs/UpdateGroupAction.md)
 - [UpdateKeyShareHolderGroupByIdRequest](docs/UpdateKeyShareHolderGroupByIdRequest.md)
 - [UpdateMpcProjectByIdRequest](docs/UpdateMpcProjectByIdRequest.md)
 - [UpdateMpcVaultByIdRequest](docs/UpdateMpcVaultByIdRequest.md)
 - [UpdateMpcWalletParams](docs/UpdateMpcWalletParams.md)
 - [UpdateSmartContractWalletParams](docs/UpdateSmartContractWalletParams.md)
 - [UpdateWalletParams](docs/UpdateWalletParams.md)
 - [UpdateWebhookEndpointByIdRequest](docs/UpdateWebhookEndpointByIdRequest.md)
 - [UtxoFeeBasePrice](docs/UtxoFeeBasePrice.md)
 - [UtxoFeeRate](docs/UtxoFeeRate.md)
 - [WalletInfo](docs/WalletInfo.md)
 - [WalletSubtype](docs/WalletSubtype.md)
 - [WalletType](docs/WalletType.md)
 - [WebhookEndpoint](docs/WebhookEndpoint.md)
 - [WebhookEndpointStatus](docs/WebhookEndpointStatus.md)
 - [WebhookEvent](docs/WebhookEvent.md)
 - [WebhookEventData](docs/WebhookEventData.md)
 - [WebhookEventDataType](docs/WebhookEventDataType.md)
 - [WebhookEventLog](docs/WebhookEventLog.md)
 - [WebhookEventStatus](docs/WebhookEventStatus.md)
 - [WebhookEventType](docs/WebhookEventType.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="CoboAuth"></a>
### CoboAuth

- **Type**: API key
- **API key parameter name**: BIZ-API-KEY
- **Location**: HTTP header

<a id="OAuth2"></a>
### OAuth2

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://auth.cobo.com/authorize
- **Scopes**: 
  - custodial_asset_wallet:create: Create access to custodial asset wallets
  - custodial_asset_wallet:add: Generate address access to custodial asset wallets
  - custodial_asset_wallet:edit: Change wallet name access to custodial asset wallets
  - custodial_asset_wallet:withdraw: Withdraw access to custodial asset wallets
  - mpc_organization_controlled_wallet:create: Create access to MPC organization-controlled wallets
  - mpc_organization_controlled_wallet:add: Generate address access to MPC organization-controlled wallets
  - mpc_organization_controlled_wallet:edit: Change wallet name access to MPC organization-controlled wallets
  - mpc_organization_controlled_wallet:withdraw: Withdraw access to MPC organization-controlled wallets
  - mpc_organization_controlled_wallet:contract_call: Contract call access to MPC organization-controlled wallets
  - mpc_organization_controlled_wallet:message_sign: Message sign access to MPC organization-controlled wallets
  - mpc_organization_controlled_vault:manage: Create/Edit access to MPC organization-controlled vaults
  - mpc_organization_controlled_key_group:manage: Create/Edit/Delete access to MPC organization-controlled key groups
  - mpc_organization_controlled_tss_request:manage: Create/Cancel access to MPC organization-controlled tss requests
  - mpc_user_controlled_wallet:create: Create access to MPC user-controlled wallets
  - mpc_user_controlled_wallet:add: Generate address access to MPC user-controlled wallets
  - mpc_user_controlled_wallet:edit: Change wallet name access to MPC user-controlled wallets
  - mpc_user_controlled_wallet:withdraw: Withdraw access to MPC user-controlled wallets
  - mpc_user_controlled_wallet:contract_call: Contract call access to MPC user-controlled wallets
  - mpc_user_controlled_wallet:message_sign: Message sign access to MPC user-controlled wallets
  - mpc_user_controlled_project:manage: Create/Edit access to MPC user-controlled projects
  - mpc_user_controlled_vault:manage: Create/Edit access to MPC user-controlled vaults
  - mpc_user_controlled_key_group:manage: Create/Edit/Delete access to MPC user-controlled key groups
  - mpc_user_controlled_tss_request:manage: Create/Cancel access to MPC user-controlled tss requests
  - webhook:resend: Resend access to webhook events
  - webhook_url:edit: Create/Edit access to webhook urls


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

help@cobo.com

