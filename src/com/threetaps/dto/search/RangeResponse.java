package com.threetaps.dto.search;

import java.util.Map;


public class RangeResponse {
	
	private Map<String, Range> ranges;

	public Map<String, Range> getRanges() {
		return ranges;
	}

	public void setRanges(Map<String, Range> ranges) {
		this.ranges = ranges;
	}
	
	public class Range {
		private Integer min;
		private Integer max;
		
		public Integer getMin() {
			return min;
		}
		public void setMin(Integer min) {
			this.min = min;
		}
		public Integer getMax() {
			return max;
		}
		public void setMax(Integer max) {
			this.max = max;
		}
	}
}
