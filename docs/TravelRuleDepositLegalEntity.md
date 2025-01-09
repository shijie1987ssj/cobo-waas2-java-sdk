

# TravelRuleDepositLegalEntity

Required fields for LEGAL entities.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**selectedEntityType** | [**SelectedEntityTypeEnum**](#SelectedEntityTypeEnum) | Specifies the type of entity associated with the transaction. |  |
|**legalName** | **String** | The legal name of the entity. |  |
|**dateOfIncorporation** | **LocalDate** | The incorporation date of the entity. This field is required when: - **Calling**: &#x60;travel_rule/transaction/limitation&#x60; API returns &#x60;is_threshold_reached &#x3D; true&#x60;. - **Entity Type**: LEGAL. Otherwise, this field can be omitted.  |  [optional] |
|**placeOfIncorporation** | **String** | The place of incorporation of the entity. This field is required when: - **Calling**: &#x60;travel_rule/transaction/limitation&#x60; API returns &#x60;is_threshold_reached &#x3D; true&#x60;. - **Entity Type**: LEGAL. Otherwise, this field can be omitted.  |  [optional] |



## Enum: SelectedEntityTypeEnum

| Name | Value |
|---- | -----|
| LEGAL | &quot;LEGAL&quot; |
| NATURAL | &quot;NATURAL&quot; |



