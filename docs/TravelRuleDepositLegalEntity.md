

# TravelRuleDepositLegalEntity

The required information of a legal entity.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**selectedEntityType** | [**SelectedEntityTypeEnum**](#SelectedEntityTypeEnum) | The entity type. Possible values include: - &#x60;LEGAL&#x60;: Legal entity. - &#x60;NATURAL&#x60;: Natural person.  |  |
|**legalName** | **String** | The legal name of the entity. |  |
|**dateOfIncorporation** | **LocalDate** | The date of incorporation of the entity. This field is required when either of the following conditions is met: - &#x60;is_threshold_reached&#x60; is &#x60;true&#x60; in the response of the [Retrieve transaction limitations](https://www.cobo.com/developers/v2/api-references/travelrule/retrieve-transaction-limitations) operation. - &#x60;selected_entity_type&#x60; is &#x60;LEGAL&#x60;.  |  [optional] |
|**placeOfIncorporation** | **String** | The place of incorporation of the entity. This field is required when either of the following conditions is met: - &#x60;is_threshold_reached&#x60; is &#x60;true&#x60; in the response of the [Retrieve transaction limitations](https://www.cobo.com/developers/v2/api-references/travelrule/retrieve-transaction-limitations) operation. - &#x60;selected_entity_type&#x60; is &#x60;LEGAL&#x60;.  |  [optional] |



## Enum: SelectedEntityTypeEnum

| Name | Value |
|---- | -----|
| LEGAL | &quot;LEGAL&quot; |
| NATURAL | &quot;NATURAL&quot; |



