

# Pagination

The pagination information of the returned data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**before** | **String** | An object ID that serves as a starting point for retrieving data in reverse chronological order for the next request.   If this property is empty, it means that you have reached the start of the data records.  |  |
|**after** | **String** | An object ID that acts as a starting point for retrieving data in chronological order for the next request.  If this property is empty, it means that you have reached the end of the data records.  |  |
|**totalCount** | **Integer** | The total number of records that match the query criteria, unaffected by the pagination parameters (&#x60;before&#x60; , &#x60;after&#x60;, and &#x60;limit&#x60;). |  |



