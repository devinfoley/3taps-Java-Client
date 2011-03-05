package com.threetaps.dto.search;


public class BestMatchResponse {
	
	private String category;
	private Integer numResults;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Integer getNumResults() {
		return numResults;
	}

	public void setNumResults(Integer numResults) {
		this.numResults = numResults;
	}
}
