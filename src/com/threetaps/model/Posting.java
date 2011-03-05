package com.threetaps.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Posting {
	
	private String postKey;
	private String heading;
	private String body;
	private String category;
	private String source;
	private String location;
	
	private Float longitude;
	private Float latitude;
	
	private String language;
	
	private Float price;
	private String currency;
	
	private String externalURL;
	private String externalID;
	private String accountName;
	private String accountID;
	
	private Date timestamp;
	private Date expires;
	private Date indexed;

	private List<Map<String, String>> errors;
	
	private Map<String, Object> annotations;
	
	private Boolean exists;
	private List<PostingHistory> history;
	private String status;

	public String getPostKey() {
		return postKey;
	}

	public void setPostKey(String postKey) {
		this.postKey = postKey;
	}

	public String getHeading() {
		return heading;
	}

	public void setHeading(String heading) {
		this.heading = heading;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getExternalURL() {
		return externalURL;
	}

	public void setExternalURL(String externalURL) {
		this.externalURL = externalURL;
	}

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Date getExpires() {
		return expires;
	}

	public void setExpires(Date expires) {
		this.expires = expires;
	}

	public Map<String, Object> getAnnotations() {
		return annotations;
	}

	public void setAnnotations(Map<String, Object> annotations) {
		this.annotations = annotations;
	}

	public void setErrors(List<Map<String, String>> errors) {
		this.errors = errors;
	}

	public List<Map<String, String>> getErrors() {
		return errors;
	}

	public void setIndexed(Date indexed) {
		this.indexed = indexed;
	}

	public Date getIndexed() {
		return indexed;
	}
	
	public Boolean getExists() {
		return exists;
	}

	public void setExists(Boolean exists) {
		this.exists = exists;
	}

	public List<PostingHistory> getHistory() {
		return history;
	}

	public void setHistory(List<PostingHistory> history) {
		this.history = history;
	}

	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public void setPrice(Float price) {
		this.price = price;
	}	
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}