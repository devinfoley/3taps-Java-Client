package com.threetaps.dto.search;

import java.util.Map;

public class SummaryRequest implements QueryRequest {
	private SearchRequest searchRequest;
	private String dimension;
	
	public SearchRequest getSearchRequest() {
		return searchRequest;
	}
	
	public void setSearchRequest(SearchRequest searchRequest) {
		this.searchRequest = searchRequest;
	}
	
	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public Map<String, String> getQueryParams() {
		
		final Map<String, String> queryParams = searchRequest.getQueryParams();
		if (dimension != null) queryParams.put("dimension", dimension);
		
		return queryParams;
	}
}
