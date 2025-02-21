

# SolContractCallInstruction

sol contract instruction

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accounts** | [**List&lt;SolContractCallAccount&gt;**](SolContractCallAccount.md) |  |  |
|**data** | **String** | data used for calling Solana contract.  |  |
|**programId** | **String** | contract address. when calling a Solana contract, the to_address parameter needs to match the program_id parameter. If multiple contracts are being called, then the to_address parameter should match the program_id parameter of the first instruction.  |  |



