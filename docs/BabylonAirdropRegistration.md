

# BabylonAirdropRegistration

The details of a Babylon airdrop registration.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | The registration ID, a unique identifier for tracking the airdrop registration. |  [optional] |
|**status** | **BabylonRegistrationRequestStatus** |  |  [optional] |
|**btcAddress** | [**StakingSource**](StakingSource.md) |  |  [optional] |
|**babylonAddress** | [**StakingSource**](StakingSource.md) |  |  [optional] |
|**airdropAmount** | **String** | The actual airdrop amount allocated for this BTC address. |  [optional] |
|**errorMessage** | **String** | The detailed error message if the registration failed. |  [optional] |
|**createdTimestamp** | **Long** | The time when the registration was created, in Unix timestamp format, measured in milliseconds. |  [optional] |
|**updatedTimestamp** | **Long** | The time when the registration was updated, in Unix timestamp format, measured in milliseconds. |  [optional] |



