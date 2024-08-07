

# KeyShareHolderGroup

The data for key share holder group information.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**keyShareHolderGroupId** | **String** | The key share holder group ID. |  [optional] |
|**type** | **KeyShareHolderGroupType** |  |  [optional] |
|**tssKeyShareGroups** | [**List&lt;TSSGroups&gt;**](TSSGroups.md) |  |  [optional] |
|**keyShareHolders** | [**List&lt;KeyShareHolder&gt;**](KeyShareHolder.md) |  |  [optional] |
|**participants** | **Integer** | The number of key share holders in this key share holder group. |  [optional] |
|**threshold** | **Integer** | The number of key share holders required to approve each operation in this key share holder group. |  [optional] |
|**status** | **KeyShareHolderGroupStatus** |  |  [optional] |
|**createdTimestamp** | **Long** | The key share holder group&#39;s creation time in Unix timestamp format, measured in milliseconds. |  [optional] |



