

# TravelRuleDepositNaturalEntity

Required fields for NATURAL entities.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**selectedEntityType** | [**SelectedEntityTypeEnum**](#SelectedEntityTypeEnum) | Specifies the type of entity associated with the transaction. |  |
|**firstName** | **String** | The first name of the user. |  |
|**lastName** | **String** | The last name of the user. |  |
|**dateOfBirth** | **LocalDate** | The date of birth of the user. This field is required when: - **Calling**: &#x60;travel_rule/transaction/limitation&#x60; API returns &#x60;is_threshold_reached &#x3D; true&#x60;. - **Entity Type**: NATURAL. Otherwise, this field can be omitted.  |  [optional] |
|**placeOfBirth** | **String** | The place of birth of the user. This field is required when: - **Calling**: &#x60;travel_rule/transaction/limitation&#x60; API returns &#x60;is_threshold_reached &#x3D; true&#x60;. - **Entity Type**: NATURAL. Otherwise, this field can be omitted.  |  [optional] |



## Enum: SelectedEntityTypeEnum

| Name | Value |
|---- | -----|
| LEGAL | &quot;LEGAL&quot; |
| NATURAL | &quot;NATURAL&quot; |



