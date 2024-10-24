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
 * The type of the source. Refer to [Transaction sources and destinations](/v2/guides/transactions/sources-and-destinations) for a detailed introduction about the supported sources and destinations for each transaction type.  Each source type requires a different set of properties. Switch between the above tabs for details. 
 */
@JsonAdapter(ContractCallSourceType.Adapter.class)
public enum ContractCallSourceType {
  UNKNOWN(null),
  
  ORG_CONTROLLED("Org-Controlled"),
  
  USER_CONTROLLED("User-Controlled"),
  
  SAFE_WALLET_("Safe{Wallet}");

  private String value;

  ContractCallSourceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ContractCallSourceType fromValue(String value) {
    for (ContractCallSourceType b : ContractCallSourceType.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ContractCallSourceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ContractCallSourceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ContractCallSourceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ContractCallSourceType.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    ContractCallSourceType.fromValue(value);
  }
}

