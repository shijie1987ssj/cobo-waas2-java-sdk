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
import com.cobo.waas2.model.EstimateFeeRequestType;
import com.cobo.waas2.model.SafeWalletDelegatesContractCall;
import com.cobo.waas2.model.SafeWalletDelegatesTransfer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;



import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonParseException;

import com.cobo.waas2.JSON;

@javax.annotation.Generated(
    value = "org.openapitools.codegen.languages.JavaClientCodegen", 
    comments = "Generator version: 7.6.0"
)
public class SafeWalletDelegates extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(SafeWalletDelegates.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SafeWalletDelegates.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SafeWalletDelegates' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SafeWalletDelegatesContractCall> adapterSafeWalletDelegatesContractCall = gson.getDelegateAdapter(this, TypeToken.get(SafeWalletDelegatesContractCall.class));
            final TypeAdapter<SafeWalletDelegatesTransfer> adapterSafeWalletDelegatesTransfer = gson.getDelegateAdapter(this, TypeToken.get(SafeWalletDelegatesTransfer.class));

            return (TypeAdapter<T>) new TypeAdapter<SafeWalletDelegates>() {
                @Override
                public void write(JsonWriter out, SafeWalletDelegates value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `SafeWalletDelegatesContractCall`
                    if (value.getActualInstance() instanceof SafeWalletDelegatesContractCall) {
                        JsonElement element = adapterSafeWalletDelegatesContractCall.toJsonTree((SafeWalletDelegatesContractCall)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `SafeWalletDelegatesTransfer`
                    if (value.getActualInstance() instanceof SafeWalletDelegatesTransfer) {
                        JsonElement element = adapterSafeWalletDelegatesTransfer.toJsonTree((SafeWalletDelegatesTransfer)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: SafeWalletDelegatesContractCall, SafeWalletDelegatesTransfer");
                }

                @Override
                public SafeWalletDelegates read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    SafeWalletDelegates newSafeWalletDelegates = new SafeWalletDelegates();
                    if (jsonObject.get("request_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for SafeWalletDelegates as `request_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `request_type`
                        switch (jsonObject.get("request_type").getAsString()) {
                            case "ContractCall":
                                deserialized = adapterSafeWalletDelegatesContractCall.fromJsonTree(jsonObject);
                                newSafeWalletDelegates.setActualInstance(deserialized);
                                return newSafeWalletDelegates;
                            case "Transfer":
                                deserialized = adapterSafeWalletDelegatesTransfer.fromJsonTree(jsonObject);
                                newSafeWalletDelegates.setActualInstance(deserialized);
                                return newSafeWalletDelegates;
                            case "SafeWalletDelegatesContractCall":
                                deserialized = adapterSafeWalletDelegatesContractCall.fromJsonTree(jsonObject);
                                newSafeWalletDelegates.setActualInstance(deserialized);
                                return newSafeWalletDelegates;
                            case "SafeWalletDelegatesTransfer":
                                deserialized = adapterSafeWalletDelegatesTransfer.fromJsonTree(jsonObject);
                                newSafeWalletDelegates.setActualInstance(deserialized);
                                return newSafeWalletDelegates;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for SafeWalletDelegates. Possible values: ContractCall Transfer SafeWalletDelegatesContractCall SafeWalletDelegatesTransfer", jsonObject.get("request_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize SafeWalletDelegatesContractCall
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SafeWalletDelegatesContractCall.validateJsonElement(jsonElement);
                        actualAdapter = adapterSafeWalletDelegatesContractCall;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SafeWalletDelegatesContractCall'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SafeWalletDelegatesContractCall failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SafeWalletDelegatesContractCall'", e);
                    }
                    // deserialize SafeWalletDelegatesTransfer
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SafeWalletDelegatesTransfer.validateJsonElement(jsonElement);
                        actualAdapter = adapterSafeWalletDelegatesTransfer;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SafeWalletDelegatesTransfer'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SafeWalletDelegatesTransfer failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SafeWalletDelegatesTransfer'", e);
                    }

                    if (match == 1) {
                        SafeWalletDelegates ret = new SafeWalletDelegates();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for SafeWalletDelegates: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public SafeWalletDelegates() {
        super("oneOf", Boolean.FALSE);
    }

    public SafeWalletDelegates(SafeWalletDelegatesContractCall o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public SafeWalletDelegates(SafeWalletDelegatesTransfer o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("SafeWalletDelegatesContractCall", SafeWalletDelegatesContractCall.class);
        schemas.put("SafeWalletDelegatesTransfer", SafeWalletDelegatesTransfer.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return SafeWalletDelegates.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * SafeWalletDelegatesContractCall, SafeWalletDelegatesTransfer
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof SafeWalletDelegatesContractCall) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SafeWalletDelegatesTransfer) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be SafeWalletDelegatesContractCall, SafeWalletDelegatesTransfer");
    }

    /**
     * Get the actual instance, which can be the following:
     * SafeWalletDelegatesContractCall, SafeWalletDelegatesTransfer
     *
     * @return The actual instance (SafeWalletDelegatesContractCall, SafeWalletDelegatesTransfer)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `SafeWalletDelegatesContractCall`. If the actual instance is not `SafeWalletDelegatesContractCall`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SafeWalletDelegatesContractCall`
     * @throws ClassCastException if the instance is not `SafeWalletDelegatesContractCall`
     */
    public SafeWalletDelegatesContractCall getSafeWalletDelegatesContractCall() throws ClassCastException {
        return (SafeWalletDelegatesContractCall)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SafeWalletDelegatesTransfer`. If the actual instance is not `SafeWalletDelegatesTransfer`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SafeWalletDelegatesTransfer`
     * @throws ClassCastException if the instance is not `SafeWalletDelegatesTransfer`
     */
    public SafeWalletDelegatesTransfer getSafeWalletDelegatesTransfer() throws ClassCastException {
        return (SafeWalletDelegatesTransfer)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SafeWalletDelegates
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with SafeWalletDelegatesContractCall
        try {
            SafeWalletDelegatesContractCall.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for SafeWalletDelegatesContractCall failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with SafeWalletDelegatesTransfer
        try {
            SafeWalletDelegatesTransfer.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for SafeWalletDelegatesTransfer failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            // throw new IOException(String.format("The JSON string is invalid for SafeWalletDelegates with oneOf schemas: SafeWalletDelegatesContractCall, SafeWalletDelegatesTransfer. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of SafeWalletDelegates given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SafeWalletDelegates
     * @throws IOException if the JSON string is invalid with respect to SafeWalletDelegates
     */
    public static SafeWalletDelegates fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SafeWalletDelegates.class);
    }

    /**
     * Convert an instance of SafeWalletDelegates to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
