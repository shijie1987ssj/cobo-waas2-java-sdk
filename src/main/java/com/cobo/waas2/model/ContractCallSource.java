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
import com.cobo.waas2.model.CoboSafeDelegate;
import com.cobo.waas2.model.ContractCallSourceType;
import com.cobo.waas2.model.MpcContractCallSource;
import com.cobo.waas2.model.SafeContractCallSource;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;



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
public class ContractCallSource extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(ContractCallSource.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ContractCallSource.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ContractCallSource' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MpcContractCallSource> adapterMpcContractCallSource = gson.getDelegateAdapter(this, TypeToken.get(MpcContractCallSource.class));
            final TypeAdapter<SafeContractCallSource> adapterSafeContractCallSource = gson.getDelegateAdapter(this, TypeToken.get(SafeContractCallSource.class));

            return (TypeAdapter<T>) new TypeAdapter<ContractCallSource>() {
                @Override
                public void write(JsonWriter out, ContractCallSource value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `MpcContractCallSource`
                    if (value.getActualInstance() instanceof MpcContractCallSource) {
                        JsonElement element = adapterMpcContractCallSource.toJsonTree((MpcContractCallSource)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `SafeContractCallSource`
                    if (value.getActualInstance() instanceof SafeContractCallSource) {
                        JsonElement element = adapterSafeContractCallSource.toJsonTree((SafeContractCallSource)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: MpcContractCallSource, SafeContractCallSource");
                }

                @Override
                public ContractCallSource read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    ContractCallSource newContractCallSource = new ContractCallSource();
                    if (jsonObject.get("source_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for ContractCallSource as `source_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `source_type`
                        switch (jsonObject.get("source_type").getAsString()) {
                            case "Org-Controlled":
                                deserialized = adapterMpcContractCallSource.fromJsonTree(jsonObject);
                                newContractCallSource.setActualInstance(deserialized);
                                return newContractCallSource;
                            case "Safe{Wallet}":
                                deserialized = adapterSafeContractCallSource.fromJsonTree(jsonObject);
                                newContractCallSource.setActualInstance(deserialized);
                                return newContractCallSource;
                            case "User-Controlled":
                                deserialized = adapterMpcContractCallSource.fromJsonTree(jsonObject);
                                newContractCallSource.setActualInstance(deserialized);
                                return newContractCallSource;
                            case "MpcContractCallSource":
                                deserialized = adapterMpcContractCallSource.fromJsonTree(jsonObject);
                                newContractCallSource.setActualInstance(deserialized);
                                return newContractCallSource;
                            case "SafeContractCallSource":
                                deserialized = adapterSafeContractCallSource.fromJsonTree(jsonObject);
                                newContractCallSource.setActualInstance(deserialized);
                                return newContractCallSource;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for ContractCallSource. Possible values: Org-Controlled Safe{Wallet} User-Controlled MpcContractCallSource SafeContractCallSource", jsonObject.get("source_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize MpcContractCallSource
                    try {
                        // validate the JSON object to see if any exception is thrown
                        MpcContractCallSource.validateJsonElement(jsonElement);
                        actualAdapter = adapterMpcContractCallSource;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'MpcContractCallSource'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for MpcContractCallSource failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'MpcContractCallSource'", e);
                    }
                    // deserialize SafeContractCallSource
                    try {
                        // validate the JSON object to see if any exception is thrown
                        SafeContractCallSource.validateJsonElement(jsonElement);
                        actualAdapter = adapterSafeContractCallSource;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'SafeContractCallSource'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for SafeContractCallSource failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'SafeContractCallSource'", e);
                    }

                    if (match == 1) {
                        ContractCallSource ret = new ContractCallSource();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for ContractCallSource: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public ContractCallSource() {
        super("oneOf", Boolean.FALSE);
    }

    public ContractCallSource(MpcContractCallSource o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public ContractCallSource(SafeContractCallSource o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("MpcContractCallSource", MpcContractCallSource.class);
        schemas.put("SafeContractCallSource", SafeContractCallSource.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return ContractCallSource.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * MpcContractCallSource, SafeContractCallSource
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof MpcContractCallSource) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SafeContractCallSource) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be MpcContractCallSource, SafeContractCallSource");
    }

    /**
     * Get the actual instance, which can be the following:
     * MpcContractCallSource, SafeContractCallSource
     *
     * @return The actual instance (MpcContractCallSource, SafeContractCallSource)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `MpcContractCallSource`. If the actual instance is not `MpcContractCallSource`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `MpcContractCallSource`
     * @throws ClassCastException if the instance is not `MpcContractCallSource`
     */
    public MpcContractCallSource getMpcContractCallSource() throws ClassCastException {
        return (MpcContractCallSource)super.getActualInstance();
    }
    /**
     * Get the actual instance of `SafeContractCallSource`. If the actual instance is not `SafeContractCallSource`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `SafeContractCallSource`
     * @throws ClassCastException if the instance is not `SafeContractCallSource`
     */
    public SafeContractCallSource getSafeContractCallSource() throws ClassCastException {
        return (SafeContractCallSource)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ContractCallSource
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with MpcContractCallSource
        try {
            MpcContractCallSource.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for MpcContractCallSource failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with SafeContractCallSource
        try {
            SafeContractCallSource.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for SafeContractCallSource failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            // throw new IOException(String.format("The JSON string is invalid for ContractCallSource with oneOf schemas: MpcContractCallSource, SafeContractCallSource. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of ContractCallSource given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ContractCallSource
     * @throws IOException if the JSON string is invalid with respect to ContractCallSource
     */
    public static ContractCallSource fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ContractCallSource.class);
    }

    /**
     * Convert an instance of ContractCallSource to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

