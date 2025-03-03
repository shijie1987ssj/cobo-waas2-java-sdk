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
import com.cobo.waas2.model.CreateStakeActivityExtra;
import com.cobo.waas2.model.StakingPoolId;
import com.cobo.waas2.model.StakingSource;
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
 * CreateStakeActivity
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class CreateStakeActivity {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private StakingSource source;

  public static final String SERIALIZED_NAME_POOL_ID = "pool_id";
  @SerializedName(SERIALIZED_NAME_POOL_ID)
  private StakingPoolId poolId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_FEE = "fee";
  @SerializedName(SERIALIZED_NAME_FEE)
  private TransactionRequestFee fee;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private CreateStakeActivityExtra extra;

  public CreateStakeActivity() {
  }

  public CreateStakeActivity requestId(String requestId) {
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


  public CreateStakeActivity source(StakingSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public StakingSource getSource() {
    return source;
  }

  public void setSource(StakingSource source) {
    this.source = source;
  }


  public CreateStakeActivity poolId(StakingPoolId poolId) {
    this.poolId = poolId;
    return this;
  }

   /**
   * Get poolId
   * @return poolId
  **/
  @javax.annotation.Nonnull
  public StakingPoolId getPoolId() {
    return poolId;
  }

  public void setPoolId(StakingPoolId poolId) {
    this.poolId = poolId;
  }


  public CreateStakeActivity amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount to stake.
   * @return amount
  **/
  @javax.annotation.Nonnull
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }


  public CreateStakeActivity fee(TransactionRequestFee fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Get fee
   * @return fee
  **/
  @javax.annotation.Nonnull
  public TransactionRequestFee getFee() {
    return fee;
  }

  public void setFee(TransactionRequestFee fee) {
    this.fee = fee;
  }


  public CreateStakeActivity extra(CreateStakeActivityExtra extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @javax.annotation.Nullable
  public CreateStakeActivityExtra getExtra() {
    return extra;
  }

  public void setExtra(CreateStakeActivityExtra extra) {
    this.extra = extra;
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
   * @return the CreateStakeActivity instance itself
   */
  public CreateStakeActivity putAdditionalProperty(String key, Object value) {
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
    CreateStakeActivity createStakeActivity = (CreateStakeActivity) o;
    return Objects.equals(this.requestId, createStakeActivity.requestId) &&
        Objects.equals(this.source, createStakeActivity.source) &&
        Objects.equals(this.poolId, createStakeActivity.poolId) &&
        Objects.equals(this.amount, createStakeActivity.amount) &&
        Objects.equals(this.fee, createStakeActivity.fee) &&
        Objects.equals(this.extra, createStakeActivity.extra)&&
        Objects.equals(this.additionalProperties, createStakeActivity.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, source, poolId, amount, fee, extra, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateStakeActivity {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
    openapiFields.add("source");
    openapiFields.add("pool_id");
    openapiFields.add("amount");
    openapiFields.add("fee");
    openapiFields.add("extra");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("pool_id");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("fee");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateStakeActivity
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateStakeActivity.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateStakeActivity is not found in the empty JSON string", CreateStakeActivity.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateStakeActivity.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("request_id") != null && !jsonObj.get("request_id").isJsonNull()) && !jsonObj.get("request_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_id").toString()));
      }
      // validate the optional field `source`
      if (jsonObj.get("source") != null && !jsonObj.get("source").isJsonNull()) {
        StakingSource.validateJsonElement(jsonObj.get("source"));
      }
      // validate the required field `pool_id`
      StakingPoolId.validateJsonElement(jsonObj.get("pool_id"));
      if (!jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      // validate the required field `fee`
      TransactionRequestFee.validateJsonElement(jsonObj.get("fee"));
      // validate the optional field `extra`
      if (jsonObj.get("extra") != null && !jsonObj.get("extra").isJsonNull()) {
        CreateStakeActivityExtra.validateJsonElement(jsonObj.get("extra"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateStakeActivity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateStakeActivity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateStakeActivity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateStakeActivity.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateStakeActivity>() {
           @Override
           public void write(JsonWriter out, CreateStakeActivity value) throws IOException {
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
           public CreateStakeActivity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CreateStakeActivity instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CreateStakeActivity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateStakeActivity
  * @throws IOException if the JSON string is invalid with respect to CreateStakeActivity
  */
  public static CreateStakeActivity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateStakeActivity.class);
  }

 /**
  * Convert an instance of CreateStakeActivity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

