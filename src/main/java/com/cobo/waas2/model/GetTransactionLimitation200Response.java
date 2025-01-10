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
import com.cobo.waas2.model.Vasp;
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
 * GetTransactionLimitation200Response
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class GetTransactionLimitation200Response {
  public static final String SERIALIZED_NAME_VASP_LIST = "vasp_list";
  @SerializedName(SERIALIZED_NAME_VASP_LIST)
  private List<Vasp> vaspList = new ArrayList<>();

  public static final String SERIALIZED_NAME_IS_THRESHOLD_REACHED = "is_threshold_reached";
  @SerializedName(SERIALIZED_NAME_IS_THRESHOLD_REACHED)
  private Boolean isThresholdReached;

  public static final String SERIALIZED_NAME_SELF_CUSTODY_WALLET_CHALLENGE = "self_custody_wallet_challenge";
  @SerializedName(SERIALIZED_NAME_SELF_CUSTODY_WALLET_CHALLENGE)
  private String selfCustodyWalletChallenge;

  public static final String SERIALIZED_NAME_CONNECT_WALLET_LIST = "connect_wallet_list";
  @SerializedName(SERIALIZED_NAME_CONNECT_WALLET_LIST)
  private List<String> connectWalletList = new ArrayList<>();

  public GetTransactionLimitation200Response() {
  }

  public GetTransactionLimitation200Response vaspList(List<Vasp> vaspList) {
    this.vaspList = vaspList;
    return this;
  }

  public GetTransactionLimitation200Response addVaspListItem(Vasp vaspListItem) {
    if (this.vaspList == null) {
      this.vaspList = new ArrayList<>();
    }
    this.vaspList.add(vaspListItem);
    return this;
  }

   /**
   * A list of virtual asset service providers (VASP) you can select as the transaction source or destination.
   * @return vaspList
  **/
  @javax.annotation.Nullable
  public List<Vasp> getVaspList() {
    return vaspList;
  }

  public void setVaspList(List<Vasp> vaspList) {
    this.vaspList = vaspList;
  }


  public GetTransactionLimitation200Response isThresholdReached(Boolean isThresholdReached) {
    this.isThresholdReached = isThresholdReached;
    return this;
  }

   /**
   * Indicates whether the transaction amount exceeds a predefined threshold. If exceeded, additional information is required when filling Travel Rule details. - &#x60;true&#x60;: Threshold exceeded. - &#x60;false&#x60;: Threshold not exceeded. 
   * @return isThresholdReached
  **/
  @javax.annotation.Nullable
  public Boolean getIsThresholdReached() {
    return isThresholdReached;
  }

  public void setIsThresholdReached(Boolean isThresholdReached) {
    this.isThresholdReached = isThresholdReached;
  }


  public GetTransactionLimitation200Response selfCustodyWalletChallenge(String selfCustodyWalletChallenge) {
    this.selfCustodyWalletChallenge = selfCustodyWalletChallenge;
    return this;
  }

   /**
   * A human-readable, time-sensitive message to be signed by the wallet owner. The message contains key information including the wallet address, a unique nonce, and a timestamp. Signing this message confirms ownership of the wallet and allows the operation to proceed. 
   * @return selfCustodyWalletChallenge
  **/
  @javax.annotation.Nullable
  public String getSelfCustodyWalletChallenge() {
    return selfCustodyWalletChallenge;
  }

  public void setSelfCustodyWalletChallenge(String selfCustodyWalletChallenge) {
    this.selfCustodyWalletChallenge = selfCustodyWalletChallenge;
  }


  public GetTransactionLimitation200Response connectWalletList(List<String> connectWalletList) {
    this.connectWalletList = connectWalletList;
    return this;
  }

  public GetTransactionLimitation200Response addConnectWalletListItem(String connectWalletListItem) {
    if (this.connectWalletList == null) {
      this.connectWalletList = new ArrayList<>();
    }
    this.connectWalletList.add(connectWalletListItem);
    return this;
  }

   /**
   * A list of self-custody wallet providers you can select as the transaction source or destination.
   * @return connectWalletList
  **/
  @javax.annotation.Nullable
  public List<String> getConnectWalletList() {
    return connectWalletList;
  }

  public void setConnectWalletList(List<String> connectWalletList) {
    this.connectWalletList = connectWalletList;
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
   * @return the GetTransactionLimitation200Response instance itself
   */
  public GetTransactionLimitation200Response putAdditionalProperty(String key, Object value) {
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
    GetTransactionLimitation200Response getTransactionLimitation200Response = (GetTransactionLimitation200Response) o;
    return Objects.equals(this.vaspList, getTransactionLimitation200Response.vaspList) &&
        Objects.equals(this.isThresholdReached, getTransactionLimitation200Response.isThresholdReached) &&
        Objects.equals(this.selfCustodyWalletChallenge, getTransactionLimitation200Response.selfCustodyWalletChallenge) &&
        Objects.equals(this.connectWalletList, getTransactionLimitation200Response.connectWalletList)&&
        Objects.equals(this.additionalProperties, getTransactionLimitation200Response.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaspList, isThresholdReached, selfCustodyWalletChallenge, connectWalletList, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransactionLimitation200Response {\n");
    sb.append("    vaspList: ").append(toIndentedString(vaspList)).append("\n");
    sb.append("    isThresholdReached: ").append(toIndentedString(isThresholdReached)).append("\n");
    sb.append("    selfCustodyWalletChallenge: ").append(toIndentedString(selfCustodyWalletChallenge)).append("\n");
    sb.append("    connectWalletList: ").append(toIndentedString(connectWalletList)).append("\n");
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
    openapiFields.add("vasp_list");
    openapiFields.add("is_threshold_reached");
    openapiFields.add("self_custody_wallet_challenge");
    openapiFields.add("connect_wallet_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to GetTransactionLimitation200Response
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!GetTransactionLimitation200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetTransactionLimitation200Response is not found in the empty JSON string", GetTransactionLimitation200Response.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("vasp_list") != null && !jsonObj.get("vasp_list").isJsonNull()) {
        JsonArray jsonArrayvaspList = jsonObj.getAsJsonArray("vasp_list");
        if (jsonArrayvaspList != null) {
          // ensure the json data is an array
          if (!jsonObj.get("vasp_list").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `vasp_list` to be an array in the JSON string but got `%s`", jsonObj.get("vasp_list").toString()));
          }

          // validate the optional field `vasp_list` (array)
          for (int i = 0; i < jsonArrayvaspList.size(); i++) {
            Vasp.validateJsonElement(jsonArrayvaspList.get(i));
          };
        }
      }
      if ((jsonObj.get("self_custody_wallet_challenge") != null && !jsonObj.get("self_custody_wallet_challenge").isJsonNull()) && !jsonObj.get("self_custody_wallet_challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self_custody_wallet_challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self_custody_wallet_challenge").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("connect_wallet_list") != null && !jsonObj.get("connect_wallet_list").isJsonNull() && !jsonObj.get("connect_wallet_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `connect_wallet_list` to be an array in the JSON string but got `%s`", jsonObj.get("connect_wallet_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetTransactionLimitation200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetTransactionLimitation200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetTransactionLimitation200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetTransactionLimitation200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetTransactionLimitation200Response>() {
           @Override
           public void write(JsonWriter out, GetTransactionLimitation200Response value) throws IOException {
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
           public GetTransactionLimitation200Response read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             GetTransactionLimitation200Response instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of GetTransactionLimitation200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetTransactionLimitation200Response
  * @throws IOException if the JSON string is invalid with respect to GetTransactionLimitation200Response
  */
  public static GetTransactionLimitation200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetTransactionLimitation200Response.class);
  }

 /**
  * Convert an instance of GetTransactionLimitation200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
