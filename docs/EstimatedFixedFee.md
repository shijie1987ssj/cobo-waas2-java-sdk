

# EstimatedFixedFee

In the fixed fee model, the transaction fee is a fixed amount within a certain amount of period regardless of the transaction size or network congestion, which can vary between different chains.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**feeAmount** | **String** | The fee that you need to pay for the transaction. |  |
|**feeType** | **FeeType** |  |  |
|**tokenId** | **String** | The token ID of the transaction fee. |  |
|**isLoop** | **Boolean** | Whether the transaction can be executed as a Loop transfer. For more information about Loop, see [Loop&#39;s website](https://loop.top/). - &#x60;true&#x60;: The transaction is a Loop transfer. - &#x60;false&#x60;: The transaction is not a Loop transfer.  |  [optional] |



