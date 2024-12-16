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
 * The information about an API log.
 */
@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class ApiLogSummary {
  public static final String SERIALIZED_NAME_LOG_ID = "log_id";
  @SerializedName(SERIALIZED_NAME_LOG_ID)
  private String logId;

  public static final String SERIALIZED_NAME_API_METHOD = "api_method";
  @SerializedName(SERIALIZED_NAME_API_METHOD)
  private String apiMethod;

  public static final String SERIALIZED_NAME_API_ENDPOINT = "api_endpoint";
  @SerializedName(SERIALIZED_NAME_API_ENDPOINT)
  private String apiEndpoint;

  public static final String SERIALIZED_NAME_REQUEST_TIMESTAMP = "request_timestamp";
  @SerializedName(SERIALIZED_NAME_REQUEST_TIMESTAMP)
  private Long requestTimestamp;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public ApiLogSummary() {
  }

  public ApiLogSummary logId(String logId) {
    this.logId = logId;
    return this;
  }

   /**
   * A unique identifier for the API log, used for tracking.
   * @return logId
  **/
  @javax.annotation.Nullable
  public String getLogId() {
    return logId;
  }

  public void setLogId(String logId) {
    this.logId = logId;
  }


  public ApiLogSummary apiMethod(String apiMethod) {
    this.apiMethod = apiMethod;
    return this;
  }

   /**
   * The HTTP method used for the API request.
   * @return apiMethod
  **/
  @javax.annotation.Nonnull
  public String getApiMethod() {
    return apiMethod;
  }

  public void setApiMethod(String apiMethod) {
    this.apiMethod = apiMethod;
  }


  public ApiLogSummary apiEndpoint(String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
    return this;
  }

   /**
   * The endpoint of the API request.
   * @return apiEndpoint
  **/
  @javax.annotation.Nonnull
  public String getApiEndpoint() {
    return apiEndpoint;
  }

  public void setApiEndpoint(String apiEndpoint) {
    this.apiEndpoint = apiEndpoint;
  }


  public ApiLogSummary requestTimestamp(Long requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
    return this;
  }

   /**
   * The time when the API request was created, in Unix timestamp format, measured in milliseconds.
   * @return requestTimestamp
  **/
  @javax.annotation.Nonnull
  public Long getRequestTimestamp() {
    return requestTimestamp;
  }

  public void setRequestTimestamp(Long requestTimestamp) {
    this.requestTimestamp = requestTimestamp;
  }


  public ApiLogSummary statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * The HTTP status code returned by the API request.
   * @return statusCode
  **/
  @javax.annotation.Nonnull
  public Integer getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
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
   * @return the ApiLogSummary instance itself
   */
  public ApiLogSummary putAdditionalProperty(String key, Object value) {
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
    ApiLogSummary apiLogSummary = (ApiLogSummary) o;
    return Objects.equals(this.logId, apiLogSummary.logId) &&
        Objects.equals(this.apiMethod, apiLogSummary.apiMethod) &&
        Objects.equals(this.apiEndpoint, apiLogSummary.apiEndpoint) &&
        Objects.equals(this.requestTimestamp, apiLogSummary.requestTimestamp) &&
        Objects.equals(this.statusCode, apiLogSummary.statusCode)&&
        Objects.equals(this.additionalProperties, apiLogSummary.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logId, apiMethod, apiEndpoint, requestTimestamp, statusCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiLogSummary {\n");
    sb.append("    logId: ").append(toIndentedString(logId)).append("\n");
    sb.append("    apiMethod: ").append(toIndentedString(apiMethod)).append("\n");
    sb.append("    apiEndpoint: ").append(toIndentedString(apiEndpoint)).append("\n");
    sb.append("    requestTimestamp: ").append(toIndentedString(requestTimestamp)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
    openapiFields.add("log_id");
    openapiFields.add("api_method");
    openapiFields.add("api_endpoint");
    openapiFields.add("request_timestamp");
    openapiFields.add("status_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("api_method");
    openapiRequiredFields.add("api_endpoint");
    openapiRequiredFields.add("request_timestamp");
    openapiRequiredFields.add("status_code");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ApiLogSummary
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ApiLogSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ApiLogSummary is not found in the empty JSON string", ApiLogSummary.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ApiLogSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("log_id") != null && !jsonObj.get("log_id").isJsonNull()) && !jsonObj.get("log_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `log_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("log_id").toString()));
      }
      if (!jsonObj.get("api_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_method").toString()));
      }
      if (!jsonObj.get("api_endpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_endpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_endpoint").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ApiLogSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ApiLogSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ApiLogSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ApiLogSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ApiLogSummary>() {
           @Override
           public void write(JsonWriter out, ApiLogSummary value) throws IOException {
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
           public ApiLogSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             ApiLogSummary instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ApiLogSummary given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ApiLogSummary
  * @throws IOException if the JSON string is invalid with respect to ApiLogSummary
  */
  public static ApiLogSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ApiLogSummary.class);
  }

 /**
  * Convert an instance of ApiLogSummary to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

