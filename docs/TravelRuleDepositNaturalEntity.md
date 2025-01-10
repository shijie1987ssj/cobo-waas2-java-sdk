

# TravelRuleDepositNaturalEntity

The required information of a natural person.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**selectedEntityType** | [**SelectedEntityTypeEnum**](#SelectedEntityTypeEnum) | Specifies the type of entity associated with the transaction. - &#x60;LEGAL&#x60;: Legal entity. - &#x60;NATURAL&#x60;: Natural person.  |  |
|**firstName** | **String** | The first name of the natural person. |  |
|**lastName** | **String** | The last name of the natural person. |  |
|**dateOfBirth** | **LocalDate** | The date of birth of the natural person. This field is required when either of the following conditions is met: - &#x60;is_threshold_reached&#x60; is &#x60;true&#x60; in the response of the [Retrieve transaction limitations](https://www.cobo.com/developers/v2/api-references/travelrule/retrieve-transaction-limitations) operation. - &#x60;selected_entity_type&#x60; is &#x60;NATURAL&#x60;.  |  [optional] |
|**placeOfBirth** | **String** | The place of birth of the natural person. This field is required when either of the following conditions is met: - &#x60;is_threshold_reached&#x60; is &#x60;true&#x60; in the response of the [Retrieve transaction limitations](https://www.cobo.com/developers/v2/api-references/travelrule/retrieve-transaction-limitations) operation. - &#x60;selected_entity_type&#x60; is &#x60;NATURAL&#x60;.  |  [optional] |



## Enum: SelectedEntityTypeEnum

| Name | Value |
|---- | -----|
| LEGAL | &quot;LEGAL&quot; |
| NATURAL | &quot;NATURAL&quot; |



