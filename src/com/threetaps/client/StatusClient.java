package com.threetaps.client;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import com.google.gson.reflect.TypeToken;
import com.threetaps.model.Message;
import com.threetaps.model.Posting;

public class StatusClient extends Client {

	private static StatusClient instance;
	
	private StatusClient() {}
	
	public synchronized static StatusClient getInstance() {
		if (instance == null) instance = new StatusClient();
		return instance;
	}
	
	public Message update(List<Posting> postingsToUpdate) throws IOException {
		
		final Map<String, String> params = new HashMap<String, String>();
		params.put("postings", gson.toJson(postingsToUpdate, 
				new TypeToken<Collection<Posting>>() {}.getType()));
		
		final HttpResponse response = this.executeGet("/status/update", params);
		final String responseString = EntityUtils.toString(response.getEntity());

		return (Message)gson.fromJson(responseString, Message.class);
	}
	
	public List<Posting> get(List<Posting> postingsToCheck) throws IOException {
		final Map<String, String> params = new HashMap<String, String>();
		params.put("postings", gson.toJson(postingsToCheck, 
				new TypeToken<Collection<Posting>>() {}.getType()));
		
		final HttpResponse response = this.executeGet("/status/get", params);
		final String responseString = EntityUtils.toString(response.getEntity());
		
		@SuppressWarnings("unchecked")
		final List<Posting> statuses = (List<Posting>)gson.fromJson(responseString, 
				new TypeToken<Collection<Posting>>() {}.getType());
		return statuses;
	}
	
	public Message system() throws IOException {
		final HttpResponse response = this.executeGet("/status/system");
		final String responseString = EntityUtils.toString(response.getEntity());
		
		return (Message) gson.fromJson(responseString, Message.class);			
	}	
}
