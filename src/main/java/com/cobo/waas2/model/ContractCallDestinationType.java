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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.JsonElement;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The type of the contract format. Possible values include: - &#x60;EVM_Contract&#x60;: EVM compatible contracts. 
 */
@JsonAdapter(ContractCallDestinationType.Adapter.class)
public enum ContractCallDestinationType {
  UNKNOWN(null),
  
  EVM_CONTRACT("EVM_Contract");

  private String value;

  ContractCallDestinationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ContractCallDestinationType fromValue(String value) {
    for (ContractCallDestinationType b : ContractCallDestinationType.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ContractCallDestinationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ContractCallDestinationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ContractCallDestinationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ContractCallDestinationType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ContractCallDestinationType.fromValue(value);
  }
}

