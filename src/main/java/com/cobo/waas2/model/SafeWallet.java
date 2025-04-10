/*
 * Cobo Wallet as a Service 2.0
 *
 * Contact: help@cobo.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.cobo.waas2.model;

import java.util.Objects;
import com.cobo.waas2.model.SmartContractInitiator;
import com.cobo.waas2.model.SmartContractWalletType;
import com.cobo.waas2.model.WalletSubtype;
import com.cobo.waas2.model.WalletType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cobo.waas2.JSON;

/**
 * SafeWallet
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class SafeWallet {
  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private UUID walletId;

  public static final String SERIALIZED_NAME_WALLET_TYPE = "wallet_type";
  @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
  private WalletType walletType;

  public static final String SERIALIZED_NAME_WALLET_SUBTYPE = "wallet_subtype";
  @SerializedName(SERIALIZED_NAME_WALLET_SUBTYPE)
  private WalletSubtype walletSubtype;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ORG_ID = "org_id";
  @SerializedName(SERIALIZED_NAME_ORG_ID)
  private String orgId;

  public static final String SERIALIZED_NAME_CHAIN_ID = "chain_id";
  @SerializedName(SERIALIZED_NAME_CHAIN_ID)
  private String chainId;

  public static final String SERIALIZED_NAME_SMART_CONTRACT_WALLET_TYPE = "smart_contract_wallet_type";
  @SerializedName(SERIALIZED_NAME_SMART_CONTRACT_WALLET_TYPE)
  private SmartContractWalletType smartContractWalletType = SmartContractWalletType.SAFE_WALLET_;

  public static final String SERIALIZED_NAME_SAFE_ADDRESS = "safe_address";
  @SerializedName(SERIALIZED_NAME_SAFE_ADDRESS)
  private String safeAddress;

  public static final String SERIALIZED_NAME_SIGNERS = "signers";
  @SerializedName(SERIALIZED_NAME_SIGNERS)
  private List<String> signers = new ArrayList<>();

  public static final String SERIALIZED_NAME_THRESHOLD = "threshold";
  @SerializedName(SERIALIZED_NAME_THRESHOLD)
  private Integer threshold;

  public static final String SERIALIZED_NAME_COBO_SAFE_ADDRESS = "cobo_safe_address";
  @SerializedName(SERIALIZED_NAME_COBO_SAFE_ADDRESS)
  private String coboSafeAddress;

  public static final String SERIALIZED_NAME_INITIATOR = "initiator";
  @SerializedName(SERIALIZED_NAME_INITIATOR)
  private SmartContractInitiator initiator;

  public SafeWallet() {
  }

  public SafeWallet walletId(UUID walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * The wallet ID.
   * @return walletId
  **/
  @javax.annotation.Nonnull
  public UUID getWalletId() {
    return walletId;
  }

  public void setWalletId(UUID walletId) {
    this.walletId = walletId;
  }


  public SafeWallet walletType(WalletType walletType) {
    this.walletType = walletType;
    return this;
  }

   /**
   * Get walletType
   * @return walletType
  **/
  @javax.annotation.Nonnull
  public WalletType getWalletType() {
    return walletType;
  }

  public void setWalletType(WalletType walletType) {
    this.walletType = walletType;
  }


  public SafeWallet walletSubtype(WalletSubtype walletSubtype) {
    this.walletSubtype = walletSubtype;
    return this;
  }

   /**
   * Get walletSubtype
   * @return walletSubtype
  **/
  @javax.annotation.Nonnull
  public WalletSubtype getWalletSubtype() {
    return walletSubtype;
  }

  public void setWalletSubtype(WalletSubtype walletSubtype) {
    this.walletSubtype = walletSubtype;
  }


  public SafeWallet name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The wallet name.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public SafeWallet orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * The ID of the owning organization.
   * @return orgId
  **/
  @javax.annotation.Nonnull
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }


  public SafeWallet chainId(String chainId) {
    this.chainId = chainId;
    return this;
  }

   /**
   * The ID of the chain on which the wallet operates.
   * @return chainId
  **/
  @javax.annotation.Nullable
  public String getChainId() {
    return chainId;
  }

  public void setChainId(String chainId) {
    this.chainId = chainId;
  }


  public SafeWallet smartContractWalletType(SmartContractWalletType smartContractWalletType) {
    this.smartContractWalletType = smartContractWalletType;
    return this;
  }

   /**
   * Get smartContractWalletType
   * @return smartContractWalletType
  **/
  @javax.annotation.Nonnull
  public SmartContractWalletType getSmartContractWalletType() {
    return smartContractWalletType;
  }

  public void setSmartContractWalletType(SmartContractWalletType smartContractWalletType) {
    this.smartContractWalletType = smartContractWalletType;
  }


  public SafeWallet safeAddress(String safeAddress) {
    this.safeAddress = safeAddress;
    return this;
  }

   /**
   * The Smart Contract Wallet address.
   * @return safeAddress
  **/
  @javax.annotation.Nullable
  public String getSafeAddress() {
    return safeAddress;
  }

  public void setSafeAddress(String safeAddress) {
    this.safeAddress = safeAddress;
  }


  public SafeWallet signers(List<String> signers) {
    this.signers = signers;
    return this;
  }

  public SafeWallet addSignersItem(String signersItem) {
    if (this.signers == null) {
      this.signers = new ArrayList<>();
    }
    this.signers.add(signersItem);
    return this;
  }

   /**
   * The signers of the Smart Contract Wallet.
   * @return signers
  **/
  @javax.annotation.Nullable
  public List<String> getSigners() {
    return signers;
  }

  public void setSigners(List<String> signers) {
    this.signers = signers;
  }


  public SafeWallet threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * The minimum number of confirmations required for the Smart Contract Wallet. 
   * minimum: 1
   * @return threshold
  **/
  @javax.annotation.Nullable
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }


  public SafeWallet coboSafeAddress(String coboSafeAddress) {
    this.coboSafeAddress = coboSafeAddress;
    return this;
  }

   /**
   * The address of Cobo Safe.
   * @return coboSafeAddress
  **/
  @javax.annotation.Nullable
  public String getCoboSafeAddress() {
    return coboSafeAddress;
  }

  public void setCoboSafeAddress(String coboSafeAddress) {
    this.coboSafeAddress = coboSafeAddress;
  }


  public SafeWallet initiator(SmartContractInitiator initiator) {
    this.initiator = initiator;
    return this;
  }

   /**
   * Get initiator
   * @return initiator
  **/
  @javax.annotation.Nullable
  public SmartContractInitiator getInitiator() {
    return initiator;
  }

  public void setInitiator(SmartContractInitiator initiator) {
    this.initiator = initiator;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the SafeWallet instance itself
   */
  public SafeWallet putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SafeWallet safeWallet = (SafeWallet) o;
    return Objects.equals(this.walletId, safeWallet.walletId) &&
        Objects.equals(this.walletType, safeWallet.walletType) &&
        Objects.equals(this.walletSubtype, safeWallet.walletSubtype) &&
        Objects.equals(this.name, safeWallet.name) &&
        Objects.equals(this.orgId, safeWallet.orgId) &&
        Objects.equals(this.chainId, safeWallet.chainId) &&
        Objects.equals(this.smartContractWalletType, safeWallet.smartContractWalletType) &&
        Objects.equals(this.safeAddress, safeWallet.safeAddress) &&
        Objects.equals(this.signers, safeWallet.signers) &&
        Objects.equals(this.threshold, safeWallet.threshold) &&
        Objects.equals(this.coboSafeAddress, safeWallet.coboSafeAddress) &&
        Objects.equals(this.initiator, safeWallet.initiator)&&
        Objects.equals(this.additionalProperties, safeWallet.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletId, walletType, walletSubtype, name, orgId, chainId, smartContractWalletType, safeAddress, signers, threshold, coboSafeAddress, initiator, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SafeWallet {\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
    sb.append("    walletSubtype: ").append(toIndentedString(walletSubtype)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    chainId: ").append(toIndentedString(chainId)).append("\n");
    sb.append("    smartContractWalletType: ").append(toIndentedString(smartContractWalletType)).append("\n");
    sb.append("    safeAddress: ").append(toIndentedString(safeAddress)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    coboSafeAddress: ").append(toIndentedString(coboSafeAddress)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("wallet_id");
    openapiFields.add("wallet_type");
    openapiFields.add("wallet_subtype");
    openapiFields.add("name");
    openapiFields.add("org_id");
    openapiFields.add("chain_id");
    openapiFields.add("smart_contract_wallet_type");
    openapiFields.add("safe_address");
    openapiFields.add("signers");
    openapiFields.add("threshold");
    openapiFields.add("cobo_safe_address");
    openapiFields.add("initiator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("wallet_id");
    openapiRequiredFields.add("wallet_type");
    openapiRequiredFields.add("wallet_subtype");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("org_id");
    openapiRequiredFields.add("smart_contract_wallet_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SafeWallet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SafeWallet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SafeWallet is not found in the empty JSON string", SafeWallet.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SafeWallet.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallet_id").toString()));
      }
      // validate the required field `wallet_type`
      WalletType.validateJsonElement(jsonObj.get("wallet_type"));
      // validate the required field `wallet_subtype`
      WalletSubtype.validateJsonElement(jsonObj.get("wallet_subtype"));
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("org_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `org_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("org_id").toString()));
      }
      if ((jsonObj.get("chain_id") != null && !jsonObj.get("chain_id").isJsonNull()) && !jsonObj.get("chain_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chain_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chain_id").toString()));
      }
      // validate the required field `smart_contract_wallet_type`
      SmartContractWalletType.validateJsonElement(jsonObj.get("smart_contract_wallet_type"));
      if ((jsonObj.get("safe_address") != null && !jsonObj.get("safe_address").isJsonNull()) && !jsonObj.get("safe_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `safe_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("safe_address").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("signers") != null && !jsonObj.get("signers").isJsonNull() && !jsonObj.get("signers").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `signers` to be an array in the JSON string but got `%s`", jsonObj.get("signers").toString()));
      }
      if ((jsonObj.get("cobo_safe_address") != null && !jsonObj.get("cobo_safe_address").isJsonNull()) && !jsonObj.get("cobo_safe_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cobo_safe_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cobo_safe_address").toString()));
      }
      // validate the optional field `initiator`
      if (jsonObj.get("initiator") != null && !jsonObj.get("initiator").isJsonNull()) {
        SmartContractInitiator.validateJsonElement(jsonObj.get("initiator"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SafeWallet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SafeWallet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SafeWallet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SafeWallet.class));

       return (TypeAdapter<T>) new TypeAdapter<SafeWallet>() {
           @Override
           public void write(JsonWriter out, SafeWallet value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() == null)
                   obj.addProperty(entry.getKey(), (String) null);
                 else if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   JsonElement jsonElement = gson.toJsonTree(entry.getValue());
                   if (jsonElement.isJsonArray()) {
                     obj.add(entry.getKey(), jsonElement.getAsJsonArray());
                   } else {
                     obj.add(entry.getKey(), jsonElement.getAsJsonObject());
                   }
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public SafeWallet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SafeWallet instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SafeWallet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SafeWallet
  * @throws IOException if the JSON string is invalid with respect to SafeWallet
  */
  public static SafeWallet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SafeWallet.class);
  }

 /**
  * Convert an instance of SafeWallet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

