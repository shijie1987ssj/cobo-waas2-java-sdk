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
 * CreateBabylonAirdropRegistrationRequest
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CreateBabylonAirdropRegistrationRequest {
  public static final String SERIALIZED_NAME_BTC_ADDRESS = "btc_address";
  @SerializedName(SERIALIZED_NAME_BTC_ADDRESS)
  private StakingSource btcAddress;

  public static final String SERIALIZED_NAME_BABYLON_ADDRESS = "babylon_address";
  @SerializedName(SERIALIZED_NAME_BABYLON_ADDRESS)
  private StakingSource babylonAddress;

  public CreateBabylonAirdropRegistrationRequest() {
  }

  public CreateBabylonAirdropRegistrationRequest btcAddress(StakingSource btcAddress) {
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


  public CreateBabylonAirdropRegistrationRequest babylonAddress(StakingSource babylonAddress) {
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
   * @return the CreateBabylonAirdropRegistrationRequest instance itself
   */
  public CreateBabylonAirdropRegistrationRequest putAdditionalProperty(String key, Object value) {
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
    CreateBabylonAirdropRegistrationRequest createBabylonAirdropRegistrationRequest = (CreateBabylonAirdropRegistrationRequest) o;
    return Objects.equals(this.btcAddress, createBabylonAirdropRegistrationRequest.btcAddress) &&
        Objects.equals(this.babylonAddress, createBabylonAirdropRegistrationRequest.babylonAddress)&&
        Objects.equals(this.additionalProperties, createBabylonAirdropRegistrationRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(btcAddress, babylonAddress, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateBabylonAirdropRegistrationRequest {\n");
    sb.append("    btcAddress: ").append(toIndentedString(btcAddress)).append("\n");
    sb.append("    babylonAddress: ").append(toIndentedString(babylonAddress)).append("\n");
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
    openapiFields.add("btc_address");
    openapiFields.add("babylon_address");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateBabylonAirdropRegistrationRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateBabylonAirdropRegistrationRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateBabylonAirdropRegistrationRequest is not found in the empty JSON string", CreateBabylonAirdropRegistrationRequest.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `btc_address`
      if (jsonObj.get("btc_address") != null && !jsonObj.get("btc_address").isJsonNull()) {
        StakingSource.validateJsonElement(jsonObj.get("btc_address"));
      }
      // validate the optional field `babylon_address`
      if (jsonObj.get("babylon_address") != null && !jsonObj.get("babylon_address").isJsonNull()) {
        StakingSource.validateJsonElement(jsonObj.get("babylon_address"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateBabylonAirdropRegistrationRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateBabylonAirdropRegistrationRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateBabylonAirdropRegistrationRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateBabylonAirdropRegistrationRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateBabylonAirdropRegistrationRequest>() {
           @Override
           public void write(JsonWriter out, CreateBabylonAirdropRegistrationRequest value) throws IOException {
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
           public CreateBabylonAirdropRegistrationRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateBabylonAirdropRegistrationRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateBabylonAirdropRegistrationRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateBabylonAirdropRegistrationRequest
  * @throws IOException if the JSON string is invalid with respect to CreateBabylonAirdropRegistrationRequest
  */
  public static CreateBabylonAirdropRegistrationRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateBabylonAirdropRegistrationRequest.class);
  }

 /**
  * Convert an instance of CreateBabylonAirdropRegistrationRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

