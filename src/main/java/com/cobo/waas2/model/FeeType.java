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
 * The fee model. Possible values include: - &#x60;Fixed&#x60;: The fixed fee model.  - &#x60;EVM_EIP_1559&#x60;: The EIP-1559 fee model. - &#x60;EVM_Legacy&#x60;: The legacy fee model. - &#x60;UTXO&#x60;: The fee model used in UTXO-based blockchains, such as Bitcoin.  Each fee model requires a different set of properties. Switch between the above tabs for details. 
 */
@JsonAdapter(FeeType.Adapter.class)
public enum FeeType {
  UNKNOWN(null),
  
  FIXED("Fixed"),
  
  EVM_EIP_1559("EVM_EIP_1559"),
  
  EVM_LEGACY("EVM_Legacy"),
  
  UTXO("UTXO");

  private String value;

  FeeType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FeeType fromValue(String value) {
    for (FeeType b : FeeType.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FeeType> {
    @Override
    public void write(final JsonWriter jsonWriter, final FeeType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FeeType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FeeType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    FeeType.fromValue(value);
  }
}

