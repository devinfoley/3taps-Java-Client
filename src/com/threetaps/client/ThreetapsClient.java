package com.threetaps.client;

/**
 * Wrapper class holding instances of all APIs.
 * 
 * @author devin
 *
 */
public class ThreetapsClient {
  
	private static ThreetapsClient instance;
	
	public final static String AUTH_ID_KEY = "authID";
	private String authID;
	
	private ReferenceClient referenceClient;
	private PostingClient postingClient;
	private SearchClient searchClient;
	private GeocoderClient geocoderClient;
	private StatusClient statusClient;
	
	private ThreetapsClient() {
		referenceClient = ReferenceClient.getInstance();
		postingClient = PostingClient.getInstance();
		searchClient = SearchClient.getInstance();
		geocoderClient = GeocoderClient.getInstance();
		statusClient = StatusClient.getInstance();
	}
	
	public synchronized static ThreetapsClient getInstance() {
		if (instance == null) instance = new ThreetapsClient();
		return instance;
	}
	
	public String getAuthID() {
		return authID;
	}
	
	public ThreetapsClient setAuthID(String authID) {
		this.authID = authID;
		return this;
	}	
	
	public ReferenceClient getReferenceClient() {
		return referenceClient;
	}
	
	public PostingClient getPostingClient() {
		return postingClient;
	}
	
	public SearchClient getSearchClient() {
		return searchClient;
	}
	
	public GeocoderClient getGeocoderClient() {
		return geocoderClient;
	}
	
	public StatusClient getStatusClient() {
		return statusClient;
	}
}