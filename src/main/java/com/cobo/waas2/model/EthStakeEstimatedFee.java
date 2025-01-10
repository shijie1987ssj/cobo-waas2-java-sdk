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
import com.cobo.waas2.model.EstimatedFee;
import com.cobo.waas2.model.StakingPoolType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * EthStakeEstimatedFee
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class EthStakeEstimatedFee {
  public static final String SERIALIZED_NAME_POOL_TYPE = "pool_type";
  @SerializedName(SERIALIZED_NAME_POOL_TYPE)
  private StakingPoolType poolType;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private EstimatedFee fee;

  public static final String SERIALIZED_NAME_VALIDATOR_PUBKEYS = "validator_pubkeys";
  @SerializedName(SERIALIZED_NAME_VALIDATOR_PUBKEYS)
  private List<String> validatorPubkeys = new ArrayList<>();

  public static final String SERIALIZED_NAME_CORE_BTC_STAKING_ADDRESS = "core_btc_staking_address";
  @SerializedName(SERIALIZED_NAME_CORE_BTC_STAKING_ADDRESS)
  private String coreBtcStakingAddress;

  public EthStakeEstimatedFee() {
  }

  public EthStakeEstimatedFee poolType(StakingPoolType poolType) {
    this.poolType = poolType;
    return this;
  }

   /**
   * Get poolType
   * @return poolType
  **/
  @javax.annotation.Nullable
  public StakingPoolType getPoolType() {
    return poolType;
  }

  public void setPoolType(StakingPoolType poolType) {
    this.poolType = poolType;
  }


  public EthStakeEstimatedFee fee(EstimatedFee fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nullable
  public EstimatedFee getFee() {
    return fee;
  }

  public void setFee(EstimatedFee fee) {
    this.fee = fee;
  }


  public EthStakeEstimatedFee validatorPubkeys(List<String> validatorPubkeys) {
    this.validatorPubkeys = validatorPubkeys;
    return this;
  }

  public EthStakeEstimatedFee addValidatorPubkeysItem(String validatorPubkeysItem) {
    if (this.validatorPubkeys == null) {
      this.validatorPubkeys = new ArrayList<>();
    }
    this.validatorPubkeys.add(validatorPubkeysItem);
    return this;
  }

   /**
   * A list of public keys associated with the Ethereum validators for this staking operation.
   * @return validatorPubkeys
  **/
  @javax.annotation.Nullable
  public List<String> getValidatorPubkeys() {
    return validatorPubkeys;
  }

  public void setValidatorPubkeys(List<String> validatorPubkeys) {
    this.validatorPubkeys = validatorPubkeys;
  }


  public EthStakeEstimatedFee coreBtcStakingAddress(String coreBtcStakingAddress) {
    this.coreBtcStakingAddress = coreBtcStakingAddress;
    return this;
  }

   /**
   * The P2WSH address generated for this staking operation (only applicable if the estimated fee is for CORE staking).
   * @return coreBtcStakingAddress
  **/
  @javax.annotation.Nullable
  public String getCoreBtcStakingAddress() {
    return coreBtcStakingAddress;
  }

  public void setCoreBtcStakingAddress(String coreBtcStakingAddress) {
    this.coreBtcStakingAddress = coreBtcStakingAddress;
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
   * @return the EthStakeEstimatedFee instance itself
   */
  public EthStakeEstimatedFee putAdditionalProperty(String key, Object value) {
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
    EthStakeEstimatedFee ethStakeEstimatedFee = (EthStakeEstimatedFee) o;
    return Objects.equals(this.poolType, ethStakeEstimatedFee.poolType) &&
        Objects.equals(this.fee, ethStakeEstimatedFee.fee) &&
        Objects.equals(this.validatorPubkeys, ethStakeEstimatedFee.validatorPubkeys) &&
        Objects.equals(this.coreBtcStakingAddress, ethStakeEstimatedFee.coreBtcStakingAddress)&&
        Objects.equals(this.additionalProperties, ethStakeEstimatedFee.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poolType, fee, validatorPubkeys, coreBtcStakingAddress, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EthStakeEstimatedFee {\n");
    sb.append("    poolType: ").append(toIndentedString(poolType)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    validatorPubkeys: ").append(toIndentedString(validatorPubkeys)).append("\n");
    sb.append("    coreBtcStakingAddress: ").append(toIndentedString(coreBtcStakingAddress)).append("\n");
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
    openapiFields.add("pool_type");
    openapiFields.add("fee");
    openapiFields.add("validator_pubkeys");
    openapiFields.add("core_btc_staking_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to EthStakeEstimatedFee
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EthStakeEstimatedFee.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EthStakeEstimatedFee is not found in the empty JSON string", EthStakeEstimatedFee.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `pool_type`
      if (jsonObj.get("pool_type") != null && !jsonObj.get("pool_type").isJsonNull()) {
        StakingPoolType.validateJsonElement(jsonObj.get("pool_type"));
      }
      // validate the optional field `fee`
      if (jsonObj.get("fee") != null && !jsonObj.get("fee").isJsonNull()) {
        EstimatedFee.validateJsonElement(jsonObj.get("fee"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("validator_pubkeys") != null && !jsonObj.get("validator_pubkeys").isJsonNull() && !jsonObj.get("validator_pubkeys").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `validator_pubkeys` to be an array in the JSON string but got `%s`", jsonObj.get("validator_pubkeys").toString()));
      }
      if ((jsonObj.get("core_btc_staking_address") != null && !jsonObj.get("core_btc_staking_address").isJsonNull()) && !jsonObj.get("core_btc_staking_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `core_btc_staking_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("core_btc_staking_address").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EthStakeEstimatedFee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EthStakeEstimatedFee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EthStakeEstimatedFee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EthStakeEstimatedFee.class));

       return (TypeAdapter<T>) new TypeAdapter<EthStakeEstimatedFee>() {
           @Override
           public void write(JsonWriter out, EthStakeEstimatedFee value) throws IOException {
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
           public EthStakeEstimatedFee read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             EthStakeEstimatedFee instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EthStakeEstimatedFee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EthStakeEstimatedFee
  * @throws IOException if the JSON string is invalid with respect to EthStakeEstimatedFee
  */
  public static EthStakeEstimatedFee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EthStakeEstimatedFee.class);
  }

 /**
  * Convert an instance of EthStakeEstimatedFee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

