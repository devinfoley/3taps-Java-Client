package com.threetaps.dto.search;

import java.util.Map;


public class SummaryResponse {
	
	private Map<String, Integer> totals;
	private Integer execTimeMs;
	
	public Map<String, Integer> getTotals() {
		return totals;
	}
	public void setTotals(Map<String, Integer> totals) {
		this.totals = totals;
	}
	public Integer getExecTimeMs() {
		return execTimeMs;
	}
	public void setExecTimeMs(Integer execTimeMs) {
		this.execTimeMs = execTimeMs;
	}

}
