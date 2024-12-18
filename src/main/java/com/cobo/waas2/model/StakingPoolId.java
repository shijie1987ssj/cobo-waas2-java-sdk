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
 * The ID of the staking pool. A staking pool is a pairing of a staking protocol and a specific type of token. Currently, only &#x60;babylon_btc_signet&#x60; and &#x60;babylon_btc&#x60; are supported.
 */
@JsonAdapter(StakingPoolId.Adapter.class)
public enum StakingPoolId {
  UNKNOWN(null),
  
  BABYLON_BTC_SIGNET("babylon_btc_signet"),
  
  BABYLON_BTC("babylon_btc"),
  
  BEACON_ETH("beacon_eth"),
  
  BEACON_ETH_HOLESKY("beacon_eth_holesky"),
  
  CORE_BTC("core_btc"),
  
  CORE_XTN("core_xtn");

  private String value;

  StakingPoolId(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static StakingPoolId fromValue(String value) {
    for (StakingPoolId b : StakingPoolId.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<StakingPoolId> {
    @Override
    public void write(final JsonWriter jsonWriter, final StakingPoolId enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public StakingPoolId read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return StakingPoolId.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    StakingPoolId.fromValue(value);
  }
}
