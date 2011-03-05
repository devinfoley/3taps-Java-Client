package com.threetaps.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class PostingHistory {
	
	private Date timestamp;
	private List<Message> errors;
	private Map<String, Object> attributes;
	
	public Date getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	public List<Message> getErrors() {
		return errors;
	}
	
	public void setErrors(List<Message> errors) {
		this.errors = errors;
	}
	
	public Map<String, Object> getAttributes() {
		return attributes;
	}
	
	public void setAttributes(Map<String, Object> attributes) {
		this.attributes = attributes;
	}
}