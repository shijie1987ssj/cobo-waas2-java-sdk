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
 * The status of key share holder&#39;s TSS Node. Possible values include: - &#x60;Valid&#x60;: The TSS Node is configured and activated.  - &#x60;NotConfigured&#x60;: The TSS Node has not been configured. This status is only applicable to [mobile co-signer](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/back-up-key-share-groups#mobile-co-signer) using the [Cobo Guard](https://manuals.cobo.com/en/guard/introduction).  - &#x60;NotActivated&#x60;: The TSS Node has not been activated. This status is only applicable to [mobile co-signer](https://manuals.cobo.com/en/portal/mpc-wallets/ocw/back-up-key-share-groups#mobile-co-signer) using the [Cobo Guard](https://manuals.cobo.com/en/guard/introduction).  - &#x60;Changed&#x60;: The TSS Node has been changed. This happens when the key share holder sets up their [Cobo Guard](https://manuals.cobo.com/en/guard/introduction) on a new phone. This &#x60;Changed&#x60; status serves as a reminder for you to call [Create TSS request](/api-references/v2/wallets--mpc-wallet/create-a-tss-request-to-generate-key-secrets-for-a-tss-group) with the &#x60;KeyGenFromKeyGroup&#x60; and &#x60;Recovery&#x60; action &#x60;type&#x60; to finalize the setup of the key share holder&#39;s new phone. Once all set, the old TSS Node with the &#x60;Changed&#x60; status will be deleted. 
 */
@JsonAdapter(KeyShareHolderStatus.Adapter.class)
public enum KeyShareHolderStatus {
  UNKNOWN(null),
  
  VALID("Valid"),
  
  NOTCONFIGURED("NotConfigured"),
  
  NOTACTIVATED("NotActivated"),
  
  CHANGED("Changed");

  private String value;

  KeyShareHolderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static KeyShareHolderStatus fromValue(String value) {
    for (KeyShareHolderStatus b : KeyShareHolderStatus.values()) {
      if (b == UNKNOWN) continue;
      if (b.value.equals(value)) {
        return b;
      }
    }
    return UNKNOWN;
    // throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<KeyShareHolderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final KeyShareHolderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public KeyShareHolderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return KeyShareHolderStatus.fromValue(value);
    }
  }

  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
    String value = jsonElement.getAsString();
    KeyShareHolderStatus.fromValue(value);
  }
}

