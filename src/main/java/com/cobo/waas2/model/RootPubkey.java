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
import com.cobo.waas2.model.CurveType;
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
 * The data for MPC Root Extended Public Key information.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class RootPubkey {
  public static final String SERIALIZED_NAME_ROOT_PUBKEY = "root_pubkey";
  @SerializedName(SERIALIZED_NAME_ROOT_PUBKEY)
  private String rootPubkey;

  public static final String SERIALIZED_NAME_CURVE = "curve";
  @SerializedName(SERIALIZED_NAME_CURVE)
  private CurveType curve;

  public RootPubkey() {
  }

  public RootPubkey rootPubkey(String rootPubkey) {
    this.rootPubkey = rootPubkey;
    return this;
  }

   /**
   * The vault&#39;s [root extended public key](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/tss-node-deployment#tss-node-on-cobo-portal-and-mpc-root-extended-public-key).
   * @return rootPubkey
  **/
  @javax.annotation.Nullable
  public String getRootPubkey() {
    return rootPubkey;
  }

  public void setRootPubkey(String rootPubkey) {
    this.rootPubkey = rootPubkey;
  }


  public RootPubkey curve(CurveType curve) {
    this.curve = curve;
    return this;
  }

   /**
   * Get curve
   * @return curve
  **/
  @javax.annotation.Nullable
  public CurveType getCurve() {
    return curve;
  }

  public void setCurve(CurveType curve) {
    this.curve = curve;
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
   * @return the RootPubkey instance itself
   */
  public RootPubkey putAdditionalProperty(String key, Object value) {
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
    RootPubkey rootPubkey = (RootPubkey) o;
    return Objects.equals(this.rootPubkey, rootPubkey.rootPubkey) &&
        Objects.equals(this.curve, rootPubkey.curve)&&
        Objects.equals(this.additionalProperties, rootPubkey.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootPubkey, curve, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RootPubkey {\n");
    sb.append("    rootPubkey: ").append(toIndentedString(rootPubkey)).append("\n");
    sb.append("    curve: ").append(toIndentedString(curve)).append("\n");
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
    openapiFields.add("root_pubkey");
    openapiFields.add("curve");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to RootPubkey
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!RootPubkey.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RootPubkey is not found in the empty JSON string", RootPubkey.openapiRequiredFields.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("root_pubkey") != null && !jsonObj.get("root_pubkey").isJsonNull()) && !jsonObj.get("root_pubkey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `root_pubkey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("root_pubkey").toString()));
      }
      // validate the optional field `curve`
      if (jsonObj.get("curve") != null && !jsonObj.get("curve").isJsonNull()) {
        CurveType.validateJsonElement(jsonObj.get("curve"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RootPubkey.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RootPubkey' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RootPubkey> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RootPubkey.class));

       return (TypeAdapter<T>) new TypeAdapter<RootPubkey>() {
           @Override
           public void write(JsonWriter out, RootPubkey value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
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
           public RootPubkey read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             RootPubkey instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RootPubkey given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RootPubkey
  * @throws IOException if the JSON string is invalid with respect to RootPubkey
  */
  public static RootPubkey fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RootPubkey.class);
  }

 /**
  * Convert an instance of RootPubkey to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

