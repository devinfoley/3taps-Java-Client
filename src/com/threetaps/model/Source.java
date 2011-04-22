package com.threetaps.model;

public class Source {

	private String name;
	private String code;
	private String logo_url;
	private String logo_sm_url;
	private Boolean hidden;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLogoURL() {
		return logo_url;
	}

	public void setLogoURL(String logoURL) {
		this.logo_url = logoURL;
	}

	public String getLogoSmallURL() {
		return logo_sm_url;
	}

	public void setLogoSmallURL(String logoSmallURL) {
		this.logo_sm_url = logoSmallURL;
	}
	
	public Boolean getHidden() {
		return hidden;
	}
	
	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}
}