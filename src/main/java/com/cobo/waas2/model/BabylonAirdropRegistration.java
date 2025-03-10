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
import com.cobo.waas2.model.BabylonRegistrationRequestStatus;
import com.cobo.waas2.model.StakingSource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
 * The details of a Babylon airdrop registration.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class BabylonAirdropRegistration {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private BabylonRegistrationRequestStatus status;

  public static final String SERIALIZED_NAME_BTC_ADDRESS = "btc_address";
  @SerializedName(SERIALIZED_NAME_BTC_ADDRESS)
  private StakingSource btcAddress;

  public static final String SERIALIZED_NAME_BABYLON_ADDRESS = "babylon_address";
  @SerializedName(SERIALIZED_NAME_BABYLON_ADDRESS)
  private StakingSource babylonAddress;

  public static final String SERIALIZED_NAME_AIRDROP_AMOUNT = "airdrop_amount";
  @SerializedName(SERIALIZED_NAME_AIRDROP_AMOUNT)
  private String airdropAmount;

  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage;

  public static final String SERIALIZED_NAME_CREATED_TIMESTAMP = "created_timestamp";
  @SerializedName(SERIALIZED_NAME_CREATED_TIMESTAMP)
  private Long createdTimestamp;

  public static final String SERIALIZED_NAME_UPDATED_TIMESTAMP = "updated_timestamp";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIMESTAMP)
  private Long updatedTimestamp;

  public BabylonAirdropRegistration() {
  }

  public BabylonAirdropRegistration id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The registration ID, a unique identifier for tracking the airdrop registration.
   * @return id
  **/
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public BabylonAirdropRegistration status(BabylonRegistrationRequestStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public BabylonRegistrationRequestStatus getStatus() {
    return status;
  }

  public void setStatus(BabylonRegistrationRequestStatus status) {
    this.status = status;
  }


  public BabylonAirdropRegistration btcAddress(StakingSource btcAddress) {
    this.btcAddress = btcAddress;
    return this;
  }

   /**
   * Get btcAddress
   * @return btcAddress
  **/
  @javax.annotation.Nullable
  public StakingSource getBtcAddress() {
    return btcAddress;
  }

  public void setBtcAddress(StakingSource btcAddress) {
    this.btcAddress = btcAddress;
  }


  public BabylonAirdropRegistration babylonAddress(StakingSource babylonAddress) {
    this.babylonAddress = babylonAddress;
    return this;
  }

   /**
   * Get babylonAddress
   * @return babylonAddress
  **/
  @javax.annotation.Nullable
  public StakingSource getBabylonAddress() {
    return babylonAddress;
  }

  public void setBabylonAddress(StakingSource babylonAddress) {
    this.babylonAddress = babylonAddress;
  }


  public BabylonAirdropRegistration airdropAmount(String airdropAmount) {
    this.airdropAmount = airdropAmount;
    return this;
  }

   /**
   * The actual airdrop amount allocated for this BTC address.
   * @return airdropAmount
  **/
  @javax.annotation.Nullable
  public String getAirdropAmount() {
    return airdropAmount;
  }

  public void setAirdropAmount(String airdropAmount) {
    this.airdropAmount = airdropAmount;
  }


  public BabylonAirdropRegistration errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The detailed error message if the registration failed.
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public BabylonAirdropRegistration createdTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

   /**
   * The time when the registration was created, in Unix timestamp format, measured in milliseconds.
   * @return createdTimestamp
  **/
  @javax.annotation.Nullable
  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public void setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
  }


  public BabylonAirdropRegistration updatedTimestamp(Long updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
    return this;
  }

   /**
   * The time when the registration was updated, in Unix timestamp format, measured in milliseconds.
   * @return updatedTimestamp
  **/
  @javax.annotation.Nullable
  public Long getUpdatedTimestamp() {
    return updatedTimestamp;
  }

  public void setUpdatedTimestamp(Long updatedTimestamp) {
    this.updatedTimestamp = updatedTimestamp;
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
   * @return the BabylonAirdropRegistration instance itself
   */
  public BabylonAirdropRegistration putAdditionalProperty(String key, Object value) {
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
    BabylonAirdropRegistration babylonAirdropRegistration = (BabylonAirdropRegistration) o;
    return Objects.equals(this.id, babylonAirdropRegistration.id) &&
        Objects.equals(this.status, babylonAirdropRegistration.status) &&
        Objects.equals(this.btcAddress, babylonAirdropRegistration.btcAddress) &&
        Objects.equals(this.babylonAddress, babylonAirdropRegistration.babylonAddress) &&
        Objects.equals(this.airdropAmount, babylonAirdropRegistration.airdropAmount) &&
        Objects.equals(this.errorMessage, babylonAirdropRegistration.errorMessage) &&
        Objects.equals(this.createdTimestamp, babylonAirdropRegistration.createdTimestamp) &&
        Objects.equals(this.updatedTimestamp, babylonAirdropRegistration.updatedTimestamp)&&
        Objects.equals(this.additionalProperties, babylonAirdropRegistration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, btcAddress, babylonAddress, airdropAmount, errorMessage, createdTimestamp, updatedTimestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BabylonAirdropRegistration {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    btcAddress: ").append(toIndentedString(btcAddress)).append("\n");
    sb.append("    babylonAddress: ").append(toIndentedString(babylonAddress)).append("\n");
    sb.append("    airdropAmount: ").append(toIndentedString(airdropAmount)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    createdTimestamp: ").append(toIndentedString(createdTimestamp)).append("\n");
    sb.append("    updatedTimestamp: ").append(toIndentedString(updatedTimestamp)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("status");
    openapiFields.add("btc_address");
    openapiFields.add("babylon_address");
    openapiFields.add("airdrop_amount");
    openapiFields.add("error_message");
    openapiFields.add("created_timestamp");
    openapiFields.add("updated_timestamp");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BabylonAirdropRegistration
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BabylonAirdropRegistration.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BabylonAirdropRegistration is not found in the empty JSON string", BabylonAirdropRegistration.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        BabylonRegistrationRequestStatus.validateJsonElement(jsonObj.get("status"));
      }
      // validate the optional field `btc_address`
      if (jsonObj.get("btc_address") != null && !jsonObj.get("btc_address").isJsonNull()) {
        StakingSource.validateJsonElement(jsonObj.get("btc_address"));
      }
      // validate the optional field `babylon_address`
      if (jsonObj.get("babylon_address") != null && !jsonObj.get("babylon_address").isJsonNull()) {
        StakingSource.validateJsonElement(jsonObj.get("babylon_address"));
      }
      if ((jsonObj.get("airdrop_amount") != null && !jsonObj.get("airdrop_amount").isJsonNull()) && !jsonObj.get("airdrop_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `airdrop_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("airdrop_amount").toString()));
      }
      if ((jsonObj.get("error_message") != null && !jsonObj.get("error_message").isJsonNull()) && !jsonObj.get("error_message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `error_message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("error_message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BabylonAirdropRegistration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BabylonAirdropRegistration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BabylonAirdropRegistration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BabylonAirdropRegistration.class));

       return (TypeAdapter<T>) new TypeAdapter<BabylonAirdropRegistration>() {
           @Override
           public void write(JsonWriter out, BabylonAirdropRegistration value) throws IOException {
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
           public BabylonAirdropRegistration read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BabylonAirdropRegistration instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BabylonAirdropRegistration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BabylonAirdropRegistration
  * @throws IOException if the JSON string is invalid with respect to BabylonAirdropRegistration
  */
  public static BabylonAirdropRegistration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BabylonAirdropRegistration.class);
  }

 /**
  * Convert an instance of BabylonAirdropRegistration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

