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
 * The status of the key share holder group. Possible values include: - &#x60;New&#x60;: The key share holder group has been newly created. The status will become &#x60;Valid&#x60; after you call [Create TSS request](https://www.cobo.com/developers/v2/api-references/wallets--mpc-wallet/create-a-tss-request-to-generate-key-secrets-for-a-tss-group) and specifying this key share holder group as the target key share holder group.  - &#x60;Valid&#x60;: The key share holder group is valid.  - &#x60;Unavailable&#x60;: The key share holder group is currently unavailable. This status appears when a key share holder uses [mobile co-signer](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/back-up-key-share-groups#mobile-co-signer) to change node. For example, when a key share holder changes to a new phone or loses their phone, and is in the process of setting up [Cobo Guard](https://manuals.cobo.com/en/guard/introduction) on their new phone. 
 */
@JsonAdapter(KeyShareHolderGroupStatus.Adapter.class)
public enum KeyShareHolderGroupStatus {
  UNKNOWN(null),
  
  NEW("New"),
  
  VALID("Valid"),
  
  UNAVAILABLE("Unavailable");

  private String value;

  KeyShareHolderGroupStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeyShareHolderGroupStatus fromValue(String value) {
    for (KeyShareHolderGroupStatus b : KeyShareHolderGroupStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<KeyShareHolderGroupStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeyShareHolderGroupStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeyShareHolderGroupStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeyShareHolderGroupStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    KeyShareHolderGroupStatus.fromValue(value);
  }
}

