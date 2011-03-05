package com.threetaps.dto.search;

import java.util.List;

import com.threetaps.model.Posting;

public class SearchResponse {
	
	private Boolean success;
	private Integer numResults;
	private Integer execTimeMs;
	private List<Posting> results;
	
	public Boolean getSuccess() {
		return success;
	}
	
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	public Integer getNumResults() {
		return numResults;
	}
	
	public void setNumResults(Integer numResults) {
		this.numResults = numResults;
	}
	
	public Integer getExecTimeMs() {
		return execTimeMs;
	}
	
	public void setExecTimeMs(Integer execTimeMs) {
		this.execTimeMs = execTimeMs;
	}
	
	public List<Posting> getResults() {
		return results;
	}
	
	public void setResults(List<Posting> results) {
		this.results = results;
	}
}
