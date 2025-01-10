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
import com.cobo.waas2.model.TransactionApprovalResult;
import com.cobo.waas2.model.TransactionUserApprovalDetail;
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
 * The role approval data for transaction.
 */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.6.0"
)
public class TransactionRoleApprovalDetail {
    public static final String SERIALIZED_NAME_RESULT = "result";
    @SerializedName(SERIALIZED_NAME_RESULT)
    private TransactionApprovalResult result;

    public static final String SERIALIZED_NAME_REVIEW_THRESHOLD = "review_threshold";
    @SerializedName(SERIALIZED_NAME_REVIEW_THRESHOLD)
    private Integer reviewThreshold;

    public static final String SERIALIZED_NAME_INITIATOR = "initiator";
    @SerializedName(SERIALIZED_NAME_INITIATOR)
    private String initiator;

    public static final String SERIALIZED_NAME_COMPLETE_TIME = "complete_time";
    @SerializedName(SERIALIZED_NAME_COMPLETE_TIME)
    private String completeTime;

    public static final String SERIALIZED_NAME_USER_DETAILS = "user_details";
    @SerializedName(SERIALIZED_NAME_USER_DETAILS)
    private List<TransactionUserApprovalDetail> userDetails = new ArrayList<>();

    public TransactionRoleApprovalDetail() {
    }

    public TransactionRoleApprovalDetail result(TransactionApprovalResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get result
     * @return result
     **/
    @javax.annotation.Nullable
    public TransactionApprovalResult getResult() {
        return result;
    }

    public void setResult(TransactionApprovalResult result) {
        this.result = result;
    }


    public TransactionRoleApprovalDetail reviewThreshold(Integer reviewThreshold) {
        this.reviewThreshold = reviewThreshold;
        return this;
    }

    /**
     * The threshold for passing the review of this role.
     * @return reviewThreshold
     **/
    @javax.annotation.Nullable
    public Integer getReviewThreshold() {
        return reviewThreshold;
    }

    public void setReviewThreshold(Integer reviewThreshold) {
        this.reviewThreshold = reviewThreshold;
    }


    public TransactionRoleApprovalDetail initiator(String initiator) {
        this.initiator = initiator;
        return this;
    }

    /**
     * The initiator of the transaction.
     * @return initiator
     **/
    @javax.annotation.Nullable
    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }


    public TransactionRoleApprovalDetail completeTime(String completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    /**
     * Time to complete the review.
     * @return completeTime
     **/
    @javax.annotation.Nullable
    public String getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(String completeTime) {
        this.completeTime = completeTime;
    }


    public TransactionRoleApprovalDetail userDetails(List<TransactionUserApprovalDetail> userDetails) {
        this.userDetails = userDetails;
        return this;
    }

    public TransactionRoleApprovalDetail addUserDetailsItem(TransactionUserApprovalDetail userDetailsItem) {
        if (this.userDetails == null) {
            this.userDetails = new ArrayList<>();
        }
        this.userDetails.add(userDetailsItem);
        return this;
    }

    /**
     * Get userDetails
     * @return userDetails
     **/
    @javax.annotation.Nullable
    public List<TransactionUserApprovalDetail> getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(List<TransactionUserApprovalDetail> userDetails) {
        this.userDetails = userDetails;
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
     * @return the TransactionRoleApprovalDetail instance itself
     */
    public TransactionRoleApprovalDetail putAdditionalProperty(String key, Object value) {
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
        TransactionRoleApprovalDetail transactionRoleApprovalDetail = (TransactionRoleApprovalDetail) o;
        return Objects.equals(this.result, transactionRoleApprovalDetail.result) &&
                Objects.equals(this.reviewThreshold, transactionRoleApprovalDetail.reviewThreshold) &&
                Objects.equals(this.initiator, transactionRoleApprovalDetail.initiator) &&
                Objects.equals(this.completeTime, transactionRoleApprovalDetail.completeTime) &&
                Objects.equals(this.userDetails, transactionRoleApprovalDetail.userDetails)&&
                Objects.equals(this.additionalProperties, transactionRoleApprovalDetail.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, reviewThreshold, initiator, completeTime, userDetails, additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransactionRoleApprovalDetail {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    reviewThreshold: ").append(toIndentedString(reviewThreshold)).append("\n");
        sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
        sb.append("    completeTime: ").append(toIndentedString(completeTime)).append("\n");
        sb.append("    userDetails: ").append(toIndentedString(userDetails)).append("\n");
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
        openapiFields.add("result");
        openapiFields.add("review_threshold");
        openapiFields.add("initiator");
        openapiFields.add("complete_time");
        openapiFields.add("user_details");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to TransactionRoleApprovalDetail
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!TransactionRoleApprovalDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in TransactionRoleApprovalDetail is not found in the empty JSON string", TransactionRoleApprovalDetail.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `result`
        if (jsonObj.get("result") != null && !jsonObj.get("result").isJsonNull()) {
            TransactionApprovalResult.validateJsonElement(jsonObj.get("result"));
        }
        if ((jsonObj.get("initiator") != null && !jsonObj.get("initiator").isJsonNull()) && !jsonObj.get("initiator").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `initiator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initiator").toString()));
        }
        if ((jsonObj.get("complete_time") != null && !jsonObj.get("complete_time").isJsonNull()) && !jsonObj.get("complete_time").isJsonPrimitive()) {
            throw new IllegalArgumentException(String.format("Expected the field `complete_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("complete_time").toString()));
        }
        if (jsonObj.get("user_details") != null && !jsonObj.get("user_details").isJsonNull()) {
            JsonArray jsonArrayuserDetails = jsonObj.getAsJsonArray("user_details");
            if (jsonArrayuserDetails != null) {
                // ensure the json data is an array
                if (!jsonObj.get("user_details").isJsonArray()) {
                    throw new IllegalArgumentException(String.format("Expected the field `user_details` to be an array in the JSON string but got `%s`", jsonObj.get("user_details").toString()));
                }

                // validate the optional field `user_details` (array)
                for (int i = 0; i < jsonArrayuserDetails.size(); i++) {
                    TransactionUserApprovalDetail.validateJsonElement(jsonArrayuserDetails.get(i));
                };
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TransactionRoleApprovalDetail.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'TransactionRoleApprovalDetail' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TransactionRoleApprovalDetail> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(TransactionRoleApprovalDetail.class));

            return (TypeAdapter<T>) new TypeAdapter<TransactionRoleApprovalDetail>() {
                @Override
                public void write(JsonWriter out, TransactionRoleApprovalDetail value) throws IOException {
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
                public TransactionRoleApprovalDetail read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    JsonObject jsonObj = jsonElement.getAsJsonObject();
                    // store additional fields in the deserialized instance
                    TransactionRoleApprovalDetail instance = thisAdapter.fromJsonTree(jsonObj);
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
     * Create an instance of TransactionRoleApprovalDetail given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TransactionRoleApprovalDetail
     * @throws IOException if the JSON string is invalid with respect to TransactionRoleApprovalDetail
     */
    public static TransactionRoleApprovalDetail fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, TransactionRoleApprovalDetail.class);
    }

    /**
     * Convert an instance of TransactionRoleApprovalDetail to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

