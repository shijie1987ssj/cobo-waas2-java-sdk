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
import com.cobo.waas2.model.EvmEip1559FeeRate;
import com.cobo.waas2.model.EvmLegacyFeeRate;
import com.cobo.waas2.model.FeeType;
import com.cobo.waas2.model.FixedFeeRate;
import com.cobo.waas2.model.UtxoFeeBasePrice;
import com.cobo.waas2.model.UtxoFeeRate;
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
public class FeeRate extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(FeeRate.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FeeRate.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'FeeRate' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FixedFeeRate> adapterFixedFeeRate = gson.getDelegateAdapter(this, TypeToken.get(FixedFeeRate.class));
            final TypeAdapter<EvmEip1559FeeRate> adapterEvmEip1559FeeRate = gson.getDelegateAdapter(this, TypeToken.get(EvmEip1559FeeRate.class));
            final TypeAdapter<EvmLegacyFeeRate> adapterEvmLegacyFeeRate = gson.getDelegateAdapter(this, TypeToken.get(EvmLegacyFeeRate.class));
            final TypeAdapter<UtxoFeeRate> adapterUtxoFeeRate = gson.getDelegateAdapter(this, TypeToken.get(UtxoFeeRate.class));

            return (TypeAdapter<T>) new TypeAdapter<FeeRate>() {
                @Override
                public void write(JsonWriter out, FeeRate value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `FixedFeeRate`
                    if (value.getActualInstance() instanceof FixedFeeRate) {
                        JsonElement element = adapterFixedFeeRate.toJsonTree((FixedFeeRate)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `EvmEip1559FeeRate`
                    if (value.getActualInstance() instanceof EvmEip1559FeeRate) {
                        JsonElement element = adapterEvmEip1559FeeRate.toJsonTree((EvmEip1559FeeRate)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `EvmLegacyFeeRate`
                    if (value.getActualInstance() instanceof EvmLegacyFeeRate) {
                        JsonElement element = adapterEvmLegacyFeeRate.toJsonTree((EvmLegacyFeeRate)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `UtxoFeeRate`
                    if (value.getActualInstance() instanceof UtxoFeeRate) {
                        JsonElement element = adapterUtxoFeeRate.toJsonTree((UtxoFeeRate)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: EvmEip1559FeeRate, EvmLegacyFeeRate, FixedFeeRate, UtxoFeeRate");
                }

                @Override
                public FeeRate read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    FeeRate newFeeRate = new FeeRate();
                    if (jsonObject.get("fee_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for FeeRate as `fee_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `fee_type`
                        switch (jsonObject.get("fee_type").getAsString()) {
                            case "EVM_EIP_1559":
                                deserialized = adapterEvmEip1559FeeRate.fromJsonTree(jsonObject);
                                newFeeRate.setActualInstance(deserialized);
                                return newFeeRate;
                            case "EVM_Legacy":
                                deserialized = adapterEvmLegacyFeeRate.fromJsonTree(jsonObject);
                                newFeeRate.setActualInstance(deserialized);
                                return newFeeRate;
                            case "Fixed":
                                deserialized = adapterFixedFeeRate.fromJsonTree(jsonObject);
                                newFeeRate.setActualInstance(deserialized);
                                return newFeeRate;
                            case "UTXO":
                                deserialized = adapterUtxoFeeRate.fromJsonTree(jsonObject);
                                newFeeRate.setActualInstance(deserialized);
                                return newFeeRate;
                            case "EvmEip1559FeeRate":
                                deserialized = adapterEvmEip1559FeeRate.fromJsonTree(jsonObject);
                                newFeeRate.setActualInstance(deserialized);
                                return newFeeRate;
                            case "EvmLegacyFeeRate":
                                deserialized = adapterEvmLegacyFeeRate.fromJsonTree(jsonObject);
                                newFeeRate.setActualInstance(deserialized);
                                return newFeeRate;
                            case "FixedFeeRate":
                                deserialized = adapterFixedFeeRate.fromJsonTree(jsonObject);
                                newFeeRate.setActualInstance(deserialized);
                                return newFeeRate;
                            case "UtxoFeeRate":
                                deserialized = adapterUtxoFeeRate.fromJsonTree(jsonObject);
                                newFeeRate.setActualInstance(deserialized);
                                return newFeeRate;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for FeeRate. Possible values: EVM_EIP_1559 EVM_Legacy Fixed UTXO EvmEip1559FeeRate EvmLegacyFeeRate FixedFeeRate UtxoFeeRate", jsonObject.get("fee_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize FixedFeeRate
                    try {
                        // validate the JSON object to see if any exception is thrown
                        FixedFeeRate.validateJsonElement(jsonElement);
                        actualAdapter = adapterFixedFeeRate;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'FixedFeeRate'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for FixedFeeRate failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'FixedFeeRate'", e);
                    }
                    // deserialize EvmEip1559FeeRate
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EvmEip1559FeeRate.validateJsonElement(jsonElement);
                        actualAdapter = adapterEvmEip1559FeeRate;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EvmEip1559FeeRate'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EvmEip1559FeeRate failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EvmEip1559FeeRate'", e);
                    }
                    // deserialize EvmLegacyFeeRate
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EvmLegacyFeeRate.validateJsonElement(jsonElement);
                        actualAdapter = adapterEvmLegacyFeeRate;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EvmLegacyFeeRate'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EvmLegacyFeeRate failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EvmLegacyFeeRate'", e);
                    }
                    // deserialize UtxoFeeRate
                    try {
                        // validate the JSON object to see if any exception is thrown
                        UtxoFeeRate.validateJsonElement(jsonElement);
                        actualAdapter = adapterUtxoFeeRate;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'UtxoFeeRate'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for UtxoFeeRate failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'UtxoFeeRate'", e);
                    }

                    if (match == 1) {
                        FeeRate ret = new FeeRate();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for FeeRate: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public FeeRate() {
        super("oneOf", Boolean.FALSE);
    }

    public FeeRate(EvmEip1559FeeRate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FeeRate(EvmLegacyFeeRate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FeeRate(FixedFeeRate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public FeeRate(UtxoFeeRate o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("FixedFeeRate", FixedFeeRate.class);
        schemas.put("EvmEip1559FeeRate", EvmEip1559FeeRate.class);
        schemas.put("EvmLegacyFeeRate", EvmLegacyFeeRate.class);
        schemas.put("UtxoFeeRate", UtxoFeeRate.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return FeeRate.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * EvmEip1559FeeRate, EvmLegacyFeeRate, FixedFeeRate, UtxoFeeRate
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof FixedFeeRate) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EvmEip1559FeeRate) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EvmLegacyFeeRate) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof UtxoFeeRate) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be EvmEip1559FeeRate, EvmLegacyFeeRate, FixedFeeRate, UtxoFeeRate");
    }

    /**
     * Get the actual instance, which can be the following:
     * EvmEip1559FeeRate, EvmLegacyFeeRate, FixedFeeRate, UtxoFeeRate
     *
     * @return The actual instance (EvmEip1559FeeRate, EvmLegacyFeeRate, FixedFeeRate, UtxoFeeRate)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `FixedFeeRate`. If the actual instance is not `FixedFeeRate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `FixedFeeRate`
     * @throws ClassCastException if the instance is not `FixedFeeRate`
     */
    public FixedFeeRate getFixedFeeRate() throws ClassCastException {
        return (FixedFeeRate)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EvmEip1559FeeRate`. If the actual instance is not `EvmEip1559FeeRate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EvmEip1559FeeRate`
     * @throws ClassCastException if the instance is not `EvmEip1559FeeRate`
     */
    public EvmEip1559FeeRate getEvmEip1559FeeRate() throws ClassCastException {
        return (EvmEip1559FeeRate)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EvmLegacyFeeRate`. If the actual instance is not `EvmLegacyFeeRate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EvmLegacyFeeRate`
     * @throws ClassCastException if the instance is not `EvmLegacyFeeRate`
     */
    public EvmLegacyFeeRate getEvmLegacyFeeRate() throws ClassCastException {
        return (EvmLegacyFeeRate)super.getActualInstance();
    }
    /**
     * Get the actual instance of `UtxoFeeRate`. If the actual instance is not `UtxoFeeRate`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `UtxoFeeRate`
     * @throws ClassCastException if the instance is not `UtxoFeeRate`
     */
    public UtxoFeeRate getUtxoFeeRate() throws ClassCastException {
        return (UtxoFeeRate)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to FeeRate
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with FixedFeeRate
        try {
            FixedFeeRate.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for FixedFeeRate failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with EvmEip1559FeeRate
        try {
            EvmEip1559FeeRate.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for EvmEip1559FeeRate failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with EvmLegacyFeeRate
        try {
            EvmLegacyFeeRate.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for EvmLegacyFeeRate failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with UtxoFeeRate
        try {
            UtxoFeeRate.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for UtxoFeeRate failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            // throw new IOException(String.format("The JSON string is invalid for FeeRate with oneOf schemas: EvmEip1559FeeRate, EvmLegacyFeeRate, FixedFeeRate, UtxoFeeRate. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of FeeRate given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FeeRate
     * @throws IOException if the JSON string is invalid with respect to FeeRate
     */
    public static FeeRate fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, FeeRate.class);
    }

    /**
     * Convert an instance of FeeRate to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

