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
import com.cobo.waas2.model.BabylonStakingExtra;
import com.cobo.waas2.model.CoreStakingExtra;
import com.cobo.waas2.model.EthStakingExtra;
import com.cobo.waas2.model.EthStakingExtraAllOfBeaconValidators;
import com.cobo.waas2.model.StakingPoolType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



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
public class StakingsExtra extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(StakingsExtra.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!StakingsExtra.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'StakingsExtra' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<BabylonStakingExtra> adapterBabylonStakingExtra = gson.getDelegateAdapter(this, TypeToken.get(BabylonStakingExtra.class));
            final TypeAdapter<EthStakingExtra> adapterEthStakingExtra = gson.getDelegateAdapter(this, TypeToken.get(EthStakingExtra.class));
            final TypeAdapter<CoreStakingExtra> adapterCoreStakingExtra = gson.getDelegateAdapter(this, TypeToken.get(CoreStakingExtra.class));

            return (TypeAdapter<T>) new TypeAdapter<StakingsExtra>() {
                @Override
                public void write(JsonWriter out, StakingsExtra value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `BabylonStakingExtra`
                    if (value.getActualInstance() instanceof BabylonStakingExtra) {
                        JsonElement element = adapterBabylonStakingExtra.toJsonTree((BabylonStakingExtra)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `EthStakingExtra`
                    if (value.getActualInstance() instanceof EthStakingExtra) {
                        JsonElement element = adapterEthStakingExtra.toJsonTree((EthStakingExtra)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    // check if the actual instance is of the type `CoreStakingExtra`
                    if (value.getActualInstance() instanceof CoreStakingExtra) {
                        JsonElement element = adapterCoreStakingExtra.toJsonTree((CoreStakingExtra)value.getActualInstance());
                        elementAdapter.write(out, element);
                        return;
                    }
                    throw new IOException("Failed to serialize as the type doesn't match oneOf schemas: BabylonStakingExtra, CoreStakingExtra, EthStakingExtra");
                }

                @Override
                public StakingsExtra read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonElement jsonElement = elementAdapter.read(in);

                    JsonObject jsonObject = jsonElement.getAsJsonObject();

                    // use discriminator value for faster oneOf lookup
                    StakingsExtra newStakingsExtra = new StakingsExtra();
                    if (jsonObject.get("pool_type") == null) {
                        log.log(Level.WARNING, "Failed to lookup discriminator value for StakingsExtra as `pool_type` was not found in the payload or the payload is empty.");
                    } else  {
                        // look up the discriminator value in the field `pool_type`
                        switch (jsonObject.get("pool_type").getAsString()) {
                            case "Babylon":
                                deserialized = adapterBabylonStakingExtra.fromJsonTree(jsonObject);
                                newStakingsExtra.setActualInstance(deserialized);
                                return newStakingsExtra;
                            case "CoreBTC":
                                deserialized = adapterCoreStakingExtra.fromJsonTree(jsonObject);
                                newStakingsExtra.setActualInstance(deserialized);
                                return newStakingsExtra;
                            case "ETHBeacon":
                                deserialized = adapterEthStakingExtra.fromJsonTree(jsonObject);
                                newStakingsExtra.setActualInstance(deserialized);
                                return newStakingsExtra;
                            case "BabylonStakingExtra":
                                deserialized = adapterBabylonStakingExtra.fromJsonTree(jsonObject);
                                newStakingsExtra.setActualInstance(deserialized);
                                return newStakingsExtra;
                            case "CoreStakingExtra":
                                deserialized = adapterCoreStakingExtra.fromJsonTree(jsonObject);
                                newStakingsExtra.setActualInstance(deserialized);
                                return newStakingsExtra;
                            case "EthStakingExtra":
                                deserialized = adapterEthStakingExtra.fromJsonTree(jsonObject);
                                newStakingsExtra.setActualInstance(deserialized);
                                return newStakingsExtra;
                            default:
                                log.log(Level.WARNING, String.format("Failed to lookup discriminator value `%s` for StakingsExtra. Possible values: Babylon CoreBTC ETHBeacon BabylonStakingExtra CoreStakingExtra EthStakingExtra", jsonObject.get("pool_type").getAsString()));
                        }
                    }

                    int match = 0;
                    ArrayList<String> errorMessages = new ArrayList<>();
                    TypeAdapter actualAdapter = elementAdapter;

                    // deserialize BabylonStakingExtra
                    try {
                        // validate the JSON object to see if any exception is thrown
                        BabylonStakingExtra.validateJsonElement(jsonElement);
                        actualAdapter = adapterBabylonStakingExtra;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'BabylonStakingExtra'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for BabylonStakingExtra failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'BabylonStakingExtra'", e);
                    }
                    // deserialize EthStakingExtra
                    try {
                        // validate the JSON object to see if any exception is thrown
                        EthStakingExtra.validateJsonElement(jsonElement);
                        actualAdapter = adapterEthStakingExtra;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'EthStakingExtra'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for EthStakingExtra failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'EthStakingExtra'", e);
                    }
                    // deserialize CoreStakingExtra
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CoreStakingExtra.validateJsonElement(jsonElement);
                        actualAdapter = adapterCoreStakingExtra;
                        match++;
                        log.log(Level.FINER, "Input data matches schema 'CoreStakingExtra'");
                    } catch (Exception e) {
                        // deserialization failed, continue
                        errorMessages.add(String.format("Deserialization for CoreStakingExtra failed with `%s`.", e.getMessage()));
                        log.log(Level.FINER, "Input data does not match schema 'CoreStakingExtra'", e);
                    }

                    if (match == 1) {
                        StakingsExtra ret = new StakingsExtra();
                        ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                        return ret;
                    }

                    throw new IOException(String.format("Failed deserialization for StakingsExtra: %d classes match result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", match, errorMessages, jsonElement.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in oneOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public StakingsExtra() {
        super("oneOf", Boolean.FALSE);
    }

    public StakingsExtra(BabylonStakingExtra o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public StakingsExtra(CoreStakingExtra o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public StakingsExtra(EthStakingExtra o) {
        super("oneOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("BabylonStakingExtra", BabylonStakingExtra.class);
        schemas.put("EthStakingExtra", EthStakingExtra.class);
        schemas.put("CoreStakingExtra", CoreStakingExtra.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return StakingsExtra.schemas;
    }

    /**
     * Set the instance that matches the oneOf child schema, check
     * the instance parameter is valid against the oneOf child schemas:
     * BabylonStakingExtra, CoreStakingExtra, EthStakingExtra
     *
     * It could be an instance of the 'oneOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof BabylonStakingExtra) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof EthStakingExtra) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CoreStakingExtra) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be BabylonStakingExtra, CoreStakingExtra, EthStakingExtra");
    }

    /**
     * Get the actual instance, which can be the following:
     * BabylonStakingExtra, CoreStakingExtra, EthStakingExtra
     *
     * @return The actual instance (BabylonStakingExtra, CoreStakingExtra, EthStakingExtra)
     */
    @SuppressWarnings("unchecked")
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `BabylonStakingExtra`. If the actual instance is not `BabylonStakingExtra`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `BabylonStakingExtra`
     * @throws ClassCastException if the instance is not `BabylonStakingExtra`
     */
    public BabylonStakingExtra getBabylonStakingExtra() throws ClassCastException {
        return (BabylonStakingExtra)super.getActualInstance();
    }
    /**
     * Get the actual instance of `EthStakingExtra`. If the actual instance is not `EthStakingExtra`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `EthStakingExtra`
     * @throws ClassCastException if the instance is not `EthStakingExtra`
     */
    public EthStakingExtra getEthStakingExtra() throws ClassCastException {
        return (EthStakingExtra)super.getActualInstance();
    }
    /**
     * Get the actual instance of `CoreStakingExtra`. If the actual instance is not `CoreStakingExtra`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CoreStakingExtra`
     * @throws ClassCastException if the instance is not `CoreStakingExtra`
     */
    public CoreStakingExtra getCoreStakingExtra() throws ClassCastException {
        return (CoreStakingExtra)super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to StakingsExtra
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate oneOf schemas one by one
        int validCount = 0;
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with BabylonStakingExtra
        try {
            BabylonStakingExtra.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for BabylonStakingExtra failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with EthStakingExtra
        try {
            EthStakingExtra.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for EthStakingExtra failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        // validate the json string with CoreStakingExtra
        try {
            CoreStakingExtra.validateJsonElement(jsonElement);
            validCount++;
        } catch (Exception e) {
            errorMessages.add(String.format("Deserialization for CoreStakingExtra failed with `%s`.", e.getMessage()));
            // continue to the next one
        }
        if (validCount != 1) {
            // throw new IOException(String.format("The JSON string is invalid for StakingsExtra with oneOf schemas: BabylonStakingExtra, CoreStakingExtra, EthStakingExtra. %d class(es) match the result, expected 1. Detailed failure message for oneOf schemas: %s. JSON: %s", validCount, errorMessages, jsonElement.toString()));
        }
    }

    /**
     * Create an instance of StakingsExtra given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of StakingsExtra
     * @throws IOException if the JSON string is invalid with respect to StakingsExtra
     */
    public static StakingsExtra fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, StakingsExtra.class);
    }

    /**
     * Convert an instance of StakingsExtra to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

