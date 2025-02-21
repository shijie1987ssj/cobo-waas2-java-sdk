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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
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
 * CreateSwapQuoteRequest
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CreateSwapQuoteRequest {
  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private UUID walletId;

  public static final String SERIALIZED_NAME_PAY_TOKEN_ID = "pay_token_id";
  @SerializedName(SERIALIZED_NAME_PAY_TOKEN_ID)
  private String payTokenId;

  public static final String SERIALIZED_NAME_RECEIVE_TOKEN_ID = "receive_token_id";
  @SerializedName(SERIALIZED_NAME_RECEIVE_TOKEN_ID)
  private String receiveTokenId;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private String payAmount;

  public static final String SERIALIZED_NAME_RECEIVE_AMOUNT = "receive_amount";
  @SerializedName(SERIALIZED_NAME_RECEIVE_AMOUNT)
  private String receiveAmount;

  public CreateSwapQuoteRequest() {
  }

  public CreateSwapQuoteRequest walletId(UUID walletId) {
    this.walletId = walletId;
    return this;
  }

   /**
   * The unique identifier of the wallet.
   * @return walletId
  **/
  @javax.annotation.Nonnull
  public UUID getWalletId() {
    return walletId;
  }

  public void setWalletId(UUID walletId) {
    this.walletId = walletId;
  }


  public CreateSwapQuoteRequest payTokenId(String payTokenId) {
    this.payTokenId = payTokenId;
    return this;
  }

   /**
   * Unique id of the token to pay.
   * @return payTokenId
  **/
  @javax.annotation.Nonnull
  public String getPayTokenId() {
    return payTokenId;
  }

  public void setPayTokenId(String payTokenId) {
    this.payTokenId = payTokenId;
  }


  public CreateSwapQuoteRequest receiveTokenId(String receiveTokenId) {
    this.receiveTokenId = receiveTokenId;
    return this;
  }

   /**
   * Unique id of the token to receive.
   * @return receiveTokenId
  **/
  @javax.annotation.Nonnull
  public String getReceiveTokenId() {
    return receiveTokenId;
  }

  public void setReceiveTokenId(String receiveTokenId) {
    this.receiveTokenId = receiveTokenId;
  }


  public CreateSwapQuoteRequest payAmount(String payAmount) {
    this.payAmount = payAmount;
    return this;
  }

   /**
   * Amount of tokens to pay. For example \&quot;0.5 BTC\&quot;. Note: Either pay_amount or receive_amount must be provided, but not both. 
   * @return payAmount
  **/
  @javax.annotation.Nullable
  public String getPayAmount() {
    return payAmount;
  }

  public void setPayAmount(String payAmount) {
    this.payAmount = payAmount;
  }


  public CreateSwapQuoteRequest receiveAmount(String receiveAmount) {
    this.receiveAmount = receiveAmount;
    return this;
  }

   /**
   * Amount of tokens to receive. For example \&quot;0.5 ETH_WBTC\&quot;. Note: Either pay_amount or receive_amount must be provided, but not both. 
   * @return receiveAmount
  **/
  @javax.annotation.Nullable
  public String getReceiveAmount() {
    return receiveAmount;
  }

  public void setReceiveAmount(String receiveAmount) {
    this.receiveAmount = receiveAmount;
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
   * @return the CreateSwapQuoteRequest instance itself
   */
  public CreateSwapQuoteRequest putAdditionalProperty(String key, Object value) {
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
    CreateSwapQuoteRequest createSwapQuoteRequest = (CreateSwapQuoteRequest) o;
    return Objects.equals(this.walletId, createSwapQuoteRequest.walletId) &&
        Objects.equals(this.payTokenId, createSwapQuoteRequest.payTokenId) &&
        Objects.equals(this.receiveTokenId, createSwapQuoteRequest.receiveTokenId) &&
        Objects.equals(this.payAmount, createSwapQuoteRequest.payAmount) &&
        Objects.equals(this.receiveAmount, createSwapQuoteRequest.receiveAmount)&&
        Objects.equals(this.additionalProperties, createSwapQuoteRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(walletId, payTokenId, receiveTokenId, payAmount, receiveAmount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSwapQuoteRequest {\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    payTokenId: ").append(toIndentedString(payTokenId)).append("\n");
    sb.append("    receiveTokenId: ").append(toIndentedString(receiveTokenId)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
    sb.append("    receiveAmount: ").append(toIndentedString(receiveAmount)).append("\n");
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
    openapiFields.add("pay_token_id");
    openapiFields.add("receive_token_id");
    openapiFields.add("pay_amount");
    openapiFields.add("receive_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("wallet_id");
    openapiRequiredFields.add("pay_token_id");
    openapiRequiredFields.add("receive_token_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateSwapQuoteRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateSwapQuoteRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateSwapQuoteRequest is not found in the empty JSON string", CreateSwapQuoteRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateSwapQuoteRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("wallet_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `wallet_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("wallet_id").toString()));
      }
      if (!jsonObj.get("pay_token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_token_id").toString()));
      }
      if (!jsonObj.get("receive_token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receive_token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receive_token_id").toString()));
      }
      if ((jsonObj.get("pay_amount") != null && !jsonObj.get("pay_amount").isJsonNull()) && !jsonObj.get("pay_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_amount").toString()));
      }
      if ((jsonObj.get("receive_amount") != null && !jsonObj.get("receive_amount").isJsonNull()) && !jsonObj.get("receive_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `receive_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("receive_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateSwapQuoteRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateSwapQuoteRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateSwapQuoteRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateSwapQuoteRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateSwapQuoteRequest>() {
           @Override
           public void write(JsonWriter out, CreateSwapQuoteRequest value) throws IOException {
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
           public CreateSwapQuoteRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateSwapQuoteRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateSwapQuoteRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateSwapQuoteRequest
  * @throws IOException if the JSON string is invalid with respect to CreateSwapQuoteRequest
  */
  public static CreateSwapQuoteRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateSwapQuoteRequest.class);
  }

 /**
  * Convert an instance of CreateSwapQuoteRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

