package com.threetaps.dto.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.threetaps.util.Utils;

public class RangeRequest implements QueryRequest {
	private SearchRequest searchRequest;
	private List<String> fields = new ArrayList<String>();
	
	public SearchRequest getSearchRequest() {
		return searchRequest;
	}
	
	public void setSearchRequest(SearchRequest searchRequest) {
		this.searchRequest = searchRequest;
	}
	
	public List<String> getFields() {
		return fields;
	}
	
	public void setFields(List<String> fields) {
		this.fields = fields;
	}
	
	public void addField(String field) {
		this.fields.add(field);
	}
	
	public Map<String, String> getQueryParams() {
		
		final Map<String, String> queryParams = searchRequest.getQueryParams();
		queryParams.put("fields", Utils.join(fields));
		
		return queryParams;
	}
}
