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
 * The babylon validator information.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class BabylonValidator {
  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  public static final String SERIALIZED_NAME_PUBLIC_KEY = "public_key";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY)
  private String publicKey;

  public static final String SERIALIZED_NAME_COMMISSION_RATE = "commission_rate";
  @SerializedName(SERIALIZED_NAME_COMMISSION_RATE)
  private Float commissionRate;

  /**
   * Gets or Sets supportedPosChains
   */
  @JsonAdapter(SupportedPosChainsEnum.Adapter.class)
  public enum SupportedPosChainsEnum {
    BABYLON("Babylon"),
    
    COSMOS("Cosmos");

    private String value;

    SupportedPosChainsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SupportedPosChainsEnum fromValue(String value) {
      for (SupportedPosChainsEnum b : SupportedPosChainsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SupportedPosChainsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SupportedPosChainsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SupportedPosChainsEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SupportedPosChainsEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      SupportedPosChainsEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_SUPPORTED_POS_CHAINS = "supported_pos_chains";
  @SerializedName(SERIALIZED_NAME_SUPPORTED_POS_CHAINS)
  private List<SupportedPosChainsEnum> supportedPosChains = new ArrayList<>();

  public BabylonValidator() {
  }

  public BabylonValidator iconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * The URL of the validator&#39;s icon.
   * @return iconUrl
  **/
  @javax.annotation.Nonnull
  public String getIconUrl() {
    return iconUrl;
  }

  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public BabylonValidator name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of validator.
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public BabylonValidator priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * The priority of validator.
   * @return priority
  **/
  @javax.annotation.Nullable
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public BabylonValidator publicKey(String publicKey) {
    this.publicKey = publicKey;
    return this;
  }

   /**
   * The public key of validator.
   * @return publicKey
  **/
  @javax.annotation.Nonnull
  public String getPublicKey() {
    return publicKey;
  }

  public void setPublicKey(String publicKey) {
    this.publicKey = publicKey;
  }


  public BabylonValidator commissionRate(Float commissionRate) {
    this.commissionRate = commissionRate;
    return this;
  }

   /**
   * The commission rate of validator.
   * @return commissionRate
  **/
  @javax.annotation.Nonnull
  public Float getCommissionRate() {
    return commissionRate;
  }

  public void setCommissionRate(Float commissionRate) {
    this.commissionRate = commissionRate;
  }


  public BabylonValidator supportedPosChains(List<SupportedPosChainsEnum> supportedPosChains) {
    this.supportedPosChains = supportedPosChains;
    return this;
  }

  public BabylonValidator addSupportedPosChainsItem(SupportedPosChainsEnum supportedPosChainsItem) {
    if (this.supportedPosChains == null) {
      this.supportedPosChains = new ArrayList<>();
    }
    this.supportedPosChains.add(supportedPosChainsItem);
    return this;
  }

   /**
   * The list of supported pos chains.
   * @return supportedPosChains
  **/
  @javax.annotation.Nonnull
  public List<SupportedPosChainsEnum> getSupportedPosChains() {
    return supportedPosChains;
  }

  public void setSupportedPosChains(List<SupportedPosChainsEnum> supportedPosChains) {
    this.supportedPosChains = supportedPosChains;
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
   * @return the BabylonValidator instance itself
   */
  public BabylonValidator putAdditionalProperty(String key, Object value) {
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
    BabylonValidator babylonValidator = (BabylonValidator) o;
    return Objects.equals(this.iconUrl, babylonValidator.iconUrl) &&
        Objects.equals(this.name, babylonValidator.name) &&
        Objects.equals(this.priority, babylonValidator.priority) &&
        Objects.equals(this.publicKey, babylonValidator.publicKey) &&
        Objects.equals(this.commissionRate, babylonValidator.commissionRate) &&
        Objects.equals(this.supportedPosChains, babylonValidator.supportedPosChains)&&
        Objects.equals(this.additionalProperties, babylonValidator.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iconUrl, name, priority, publicKey, commissionRate, supportedPosChains, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BabylonValidator {\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    publicKey: ").append(toIndentedString(publicKey)).append("\n");
    sb.append("    commissionRate: ").append(toIndentedString(commissionRate)).append("\n");
    sb.append("    supportedPosChains: ").append(toIndentedString(supportedPosChains)).append("\n");
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
    openapiFields.add("icon_url");
    openapiFields.add("name");
    openapiFields.add("priority");
    openapiFields.add("public_key");
    openapiFields.add("commission_rate");
    openapiFields.add("supported_pos_chains");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("icon_url");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("public_key");
    openapiRequiredFields.add("commission_rate");
    openapiRequiredFields.add("supported_pos_chains");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BabylonValidator
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BabylonValidator.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BabylonValidator is not found in the empty JSON string", BabylonValidator.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BabylonValidator.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("icon_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon_url").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("public_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `public_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("public_key").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("supported_pos_chains") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("supported_pos_chains").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supported_pos_chains` to be an array in the JSON string but got `%s`", jsonObj.get("supported_pos_chains").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BabylonValidator.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BabylonValidator' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BabylonValidator> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BabylonValidator.class));

       return (TypeAdapter<T>) new TypeAdapter<BabylonValidator>() {
           @Override
           public void write(JsonWriter out, BabylonValidator value) throws IOException {
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
           public BabylonValidator read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             BabylonValidator instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of BabylonValidator given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BabylonValidator
  * @throws IOException if the JSON string is invalid with respect to BabylonValidator
  */
  public static BabylonValidator fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BabylonValidator.class);
  }

 /**
  * Convert an instance of BabylonValidator to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

