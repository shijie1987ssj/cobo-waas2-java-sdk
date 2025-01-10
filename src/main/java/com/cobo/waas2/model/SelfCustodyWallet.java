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
import com.cobo.waas2.model.DestinationWalletType;
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
 * Required information when depositing from or withdrawing to a self-custody wallet.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class SelfCustodyWallet {
  public static final String SERIALIZED_NAME_DESTINATION_WALLET_TYPE = "destination_wallet_type";
  @SerializedName(SERIALIZED_NAME_DESTINATION_WALLET_TYPE)
  private DestinationWalletType destinationWalletType;

  public static final String SERIALIZED_NAME_SELF_CUSTODY_WALLET_CHALLENGE = "self_custody_wallet_challenge";
  @SerializedName(SERIALIZED_NAME_SELF_CUSTODY_WALLET_CHALLENGE)
  private String selfCustodyWalletChallenge;

  public static final String SERIALIZED_NAME_SELF_CUSTODY_WALLET_ADDRESS = "self_custody_wallet_address";
  @SerializedName(SERIALIZED_NAME_SELF_CUSTODY_WALLET_ADDRESS)
  private String selfCustodyWalletAddress;

  public static final String SERIALIZED_NAME_SELF_CUSTODY_WALLET_SIGN = "self_custody_wallet_sign";
  @SerializedName(SERIALIZED_NAME_SELF_CUSTODY_WALLET_SIGN)
  private String selfCustodyWalletSign;

  public SelfCustodyWallet() {
  }

  public SelfCustodyWallet destinationWalletType(DestinationWalletType destinationWalletType) {
    this.destinationWalletType = destinationWalletType;
    return this;
  }

   /**
   * Get destinationWalletType
   * @return destinationWalletType
  **/
  @javax.annotation.Nonnull
  public DestinationWalletType getDestinationWalletType() {
    return destinationWalletType;
  }

  public void setDestinationWalletType(DestinationWalletType destinationWalletType) {
    this.destinationWalletType = destinationWalletType;
  }


  public SelfCustodyWallet selfCustodyWalletChallenge(String selfCustodyWalletChallenge) {
    this.selfCustodyWalletChallenge = selfCustodyWalletChallenge;
    return this;
  }

   /**
   * The message obtained from the &#x60;Retrieve transaction limitations&#x60; operation. This message is used to verify wallet ownership through signing.
   * @return selfCustodyWalletChallenge
  **/
  @javax.annotation.Nonnull
  public String getSelfCustodyWalletChallenge() {
    return selfCustodyWalletChallenge;
  }

  public void setSelfCustodyWalletChallenge(String selfCustodyWalletChallenge) {
    this.selfCustodyWalletChallenge = selfCustodyWalletChallenge;
  }


  public SelfCustodyWallet selfCustodyWalletAddress(String selfCustodyWalletAddress) {
    this.selfCustodyWalletAddress = selfCustodyWalletAddress;
    return this;
  }

   /**
   * The address of the self-custody wallet.
   * @return selfCustodyWalletAddress
  **/
  @javax.annotation.Nonnull
  public String getSelfCustodyWalletAddress() {
    return selfCustodyWalletAddress;
  }

  public void setSelfCustodyWalletAddress(String selfCustodyWalletAddress) {
    this.selfCustodyWalletAddress = selfCustodyWalletAddress;
  }


  public SelfCustodyWallet selfCustodyWalletSign(String selfCustodyWalletSign) {
    this.selfCustodyWalletSign = selfCustodyWalletSign;
    return this;
  }

   /**
   * The signature created by signing the challenge message with the wallet&#39;s private key.
   * @return selfCustodyWalletSign
  **/
  @javax.annotation.Nonnull
  public String getSelfCustodyWalletSign() {
    return selfCustodyWalletSign;
  }

  public void setSelfCustodyWalletSign(String selfCustodyWalletSign) {
    this.selfCustodyWalletSign = selfCustodyWalletSign;
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
   * @return the SelfCustodyWallet instance itself
   */
  public SelfCustodyWallet putAdditionalProperty(String key, Object value) {
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
    SelfCustodyWallet selfCustodyWallet = (SelfCustodyWallet) o;
    return Objects.equals(this.destinationWalletType, selfCustodyWallet.destinationWalletType) &&
        Objects.equals(this.selfCustodyWalletChallenge, selfCustodyWallet.selfCustodyWalletChallenge) &&
        Objects.equals(this.selfCustodyWalletAddress, selfCustodyWallet.selfCustodyWalletAddress) &&
        Objects.equals(this.selfCustodyWalletSign, selfCustodyWallet.selfCustodyWalletSign)&&
        Objects.equals(this.additionalProperties, selfCustodyWallet.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationWalletType, selfCustodyWalletChallenge, selfCustodyWalletAddress, selfCustodyWalletSign, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfCustodyWallet {\n");
    sb.append("    destinationWalletType: ").append(toIndentedString(destinationWalletType)).append("\n");
    sb.append("    selfCustodyWalletChallenge: ").append(toIndentedString(selfCustodyWalletChallenge)).append("\n");
    sb.append("    selfCustodyWalletAddress: ").append(toIndentedString(selfCustodyWalletAddress)).append("\n");
    sb.append("    selfCustodyWalletSign: ").append(toIndentedString(selfCustodyWalletSign)).append("\n");
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
    openapiFields.add("destination_wallet_type");
    openapiFields.add("self_custody_wallet_challenge");
    openapiFields.add("self_custody_wallet_address");
    openapiFields.add("self_custody_wallet_sign");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("destination_wallet_type");
    openapiRequiredFields.add("self_custody_wallet_challenge");
    openapiRequiredFields.add("self_custody_wallet_address");
    openapiRequiredFields.add("self_custody_wallet_sign");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SelfCustodyWallet
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SelfCustodyWallet.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SelfCustodyWallet is not found in the empty JSON string", SelfCustodyWallet.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SelfCustodyWallet.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `destination_wallet_type`
      DestinationWalletType.validateJsonElement(jsonObj.get("destination_wallet_type"));
      if (!jsonObj.get("self_custody_wallet_challenge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self_custody_wallet_challenge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self_custody_wallet_challenge").toString()));
      }
      if (!jsonObj.get("self_custody_wallet_address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self_custody_wallet_address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self_custody_wallet_address").toString()));
      }
      if (!jsonObj.get("self_custody_wallet_sign").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self_custody_wallet_sign` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self_custody_wallet_sign").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SelfCustodyWallet.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SelfCustodyWallet' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SelfCustodyWallet> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SelfCustodyWallet.class));

       return (TypeAdapter<T>) new TypeAdapter<SelfCustodyWallet>() {
           @Override
           public void write(JsonWriter out, SelfCustodyWallet value) throws IOException {
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
           public SelfCustodyWallet read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             SelfCustodyWallet instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SelfCustodyWallet given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SelfCustodyWallet
  * @throws IOException if the JSON string is invalid with respect to SelfCustodyWallet
  */
  public static SelfCustodyWallet fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SelfCustodyWallet.class);
  }

 /**
  * Convert an instance of SelfCustodyWallet to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

