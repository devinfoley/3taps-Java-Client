package com.threetaps.dto.search;

import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.threetaps.util.Constants;
import com.threetaps.util.Utils;
import com.windriver.gson.extension.GeneralObjectDeserializer;

public class SearchRequest implements QueryRequest {

	private Integer rpp;
	private Integer page;
	private String source;
	private String category;
	private String location;
	private String heading;
	private String body;
	private String text;
	private String externalID;
	private Date start;
	private Date end;
	private Map<String, String> annotations;
	private Map<String, String> trustedAnnotations;
	private List<String> retvals = new ArrayList<String>();

	public Integer getRpp() {
		return rpp;
	}

	public void setRpp(Integer rpp) {
		this.rpp = rpp;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}	

	public String getExternalID() {
		return externalID;
	}

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Map<String, String> getAnnotations() {
		return annotations;
	}

	public void setAnnotations(Map<String, String> annotations) {
		this.annotations = annotations;
	}

	public Map<String, String> getTrustedAnnotations() {
		return trustedAnnotations;
	}

	public void setTrustedAnnotations(Map<String, String> trustedAnnotations) {
		this.trustedAnnotations = trustedAnnotations;
	}

	public List<String> getRetvals() {
		return retvals;
	}

	public void setRetvals(List<String> retvals) {
		this.retvals = retvals;
	}
	
	public void addRetval(String retval) {
		this.retvals.add(retval);
	}

	public Map<String, String> getQueryParams() {
		final Map<String, String> queryParams = new HashMap<String, String>();

		if (rpp != null)
			queryParams.put("rpp", rpp.toString());
		if (page != null)
			queryParams.put("page", page.toString());
		if (source != null)
			queryParams.put("source", source);
		if (category != null)
			queryParams.put("category", category);
		if (location != null)
			queryParams.put("location", location);
		if (heading != null)
			queryParams.put("heading", heading);
		if (body != null)
			queryParams.put("body", body);
		if (text != null)
			queryParams.put("text", text);		
		if (externalID != null)
			queryParams.put("externalID", externalID);

		DateFormat df = new SimpleDateFormat(Constants.DATE_FORMAT);

		if (start != null)
			queryParams.put("start", df.format(start));
		if (end != null)
			queryParams.put("end", df.format(end));

		final Type annotationType = new TypeToken<Map<String, String>>() {}.getType();
		final Gson gson = new GsonBuilder()
			.registerTypeAdapter(Map.class, new GeneralObjectDeserializer())
			.create();

		if (annotations != null && annotations.size() > 0)
			queryParams.put("annotations", gson.toJson(annotations, annotationType));

		if (trustedAnnotations != null && trustedAnnotations.size() > 0)
			queryParams.put("trustedAnnotations", gson.toJson(trustedAnnotations, annotationType));
		
		queryParams.put("retvals", Utils.join(retvals));

		return queryParams;
	}
}