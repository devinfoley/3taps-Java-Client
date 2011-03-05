package com.threetaps.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.threetaps.dto.geocoder.GeocoderRequest;
import com.threetaps.dto.geocoder.GeocoderResponse;

public class GeocoderClientTest extends TestCase {
	
	protected GeocoderClient geocoderClient;
	
	protected void setUp() {
		geocoderClient = ThreetapsClient.getInstance().getGeocoderClient();		
	}	

	@Test
	public void testGeocode() throws IOException {
		
		final GeocoderRequest geocoderRequest = new GeocoderRequest();
		geocoderRequest.setText("Los Angeles, CA");
		
		final List<GeocoderRequest> geocoderRequests = new ArrayList<GeocoderRequest>();
		geocoderRequests.add(geocoderRequest);
		
		final List<GeocoderResponse> geocoderResponses = geocoderClient.geocode(geocoderRequests);
		
		assert geocoderResponses.get(0).getCode().equals("LAX");
	}
}
