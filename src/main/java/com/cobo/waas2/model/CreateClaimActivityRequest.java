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
import com.cobo.waas2.model.TransactionRequestFee;
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
 * CreateClaimActivityRequest
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CreateClaimActivityRequest {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_STAKING_ID = "staking_id";
  @SerializedName(SERIALIZED_NAME_STAKING_ID)
  private String stakingId;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private TransactionRequestFee fee;

  public static final String SERIALIZED_NAME_APP_INITIATOR = "app_initiator";
  @SerializedName(SERIALIZED_NAME_APP_INITIATOR)
  private String appInitiator;

  public CreateClaimActivityRequest() {
  }

  public CreateClaimActivityRequest requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * The request ID that is used to track a request. The request ID is provided by you and must be unique within your organization.
   * @return requestId
  **/
  @javax.annotation.Nullable
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public CreateClaimActivityRequest stakingId(String stakingId) {
    this.stakingId = stakingId;
    return this;
  }

   /**
   * The ID of the staking position. You can retrieve a list of staking positions by calling [List staking positions](https://www.cobo.com/developers/v2/api-references/stakings/list-staking-positions).
   * @return stakingId
  **/
  @javax.annotation.Nonnull
  public String getStakingId() {
    return stakingId;
  }

  public void setStakingId(String stakingId) {
    this.stakingId = stakingId;
  }


  public CreateClaimActivityRequest fee(TransactionRequestFee fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nullable
  public TransactionRequestFee getFee() {
    return fee;
  }

  public void setFee(TransactionRequestFee fee) {
    this.fee = fee;
  }


  public CreateClaimActivityRequest appInitiator(String appInitiator) {
    this.appInitiator = appInitiator;
    return this;
  }

   /**
   * The initiator of the staking activity. If you do not specify this property, the WaaS service will automatically designate the API key as the initiator.
   * @return appInitiator
  **/
  @javax.annotation.Nullable
  public String getAppInitiator() {
    return appInitiator;
  }

  public void setAppInitiator(String appInitiator) {
    this.appInitiator = appInitiator;
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
   * @return the CreateClaimActivityRequest instance itself
   */
  public CreateClaimActivityRequest putAdditionalProperty(String key, Object value) {
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
    CreateClaimActivityRequest createClaimActivityRequest = (CreateClaimActivityRequest) o;
    return Objects.equals(this.requestId, createClaimActivityRequest.requestId) &&
        Objects.equals(this.stakingId, createClaimActivityRequest.stakingId) &&
        Objects.equals(this.fee, createClaimActivityRequest.fee) &&
        Objects.equals(this.appInitiator, createClaimActivityRequest.appInitiator)&&
        Objects.equals(this.additionalProperties, createClaimActivityRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, stakingId, fee, appInitiator, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClaimActivityRequest {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    stakingId: ").append(toIndentedString(stakingId)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    appInitiator: ").append(toIndentedString(appInitiator)).append("\n");
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
    openapiFields.add("request_id");
    openapiFields.add("staking_id");
    openapiFields.add("fee");
    openapiFields.add("app_initiator");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("staking_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateClaimActivityRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateClaimActivityRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateClaimActivityRequest is not found in the empty JSON string", CreateClaimActivityRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateClaimActivityRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("request_id") != null && !jsonObj.get("request_id").isJsonNull()) && !jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
      if (!jsonObj.get("staking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `staking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("staking_id").toString()));
      }
      // validate the optional field `fee`
      if (jsonObj.get("fee") != null && !jsonObj.get("fee").isJsonNull()) {
        TransactionRequestFee.validateJsonElement(jsonObj.get("fee"));
      }
      if ((jsonObj.get("app_initiator") != null && !jsonObj.get("app_initiator").isJsonNull()) && !jsonObj.get("app_initiator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_initiator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_initiator").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateClaimActivityRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateClaimActivityRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateClaimActivityRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateClaimActivityRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateClaimActivityRequest>() {
           @Override
           public void write(JsonWriter out, CreateClaimActivityRequest value) throws IOException {
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
           public CreateClaimActivityRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateClaimActivityRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateClaimActivityRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateClaimActivityRequest
  * @throws IOException if the JSON string is invalid with respect to CreateClaimActivityRequest
  */
  public static CreateClaimActivityRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateClaimActivityRequest.class);
  }

 /**
  * Convert an instance of CreateClaimActivityRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

