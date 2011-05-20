package com.threetaps.client;

import java.io.IOException;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.threetaps.model.Category;
import com.threetaps.model.Location;
import com.threetaps.model.Source;

public class ReferenceClientTest extends TestCase {
	
	protected ReferenceClient referenceClient;
	
	protected void setUp() {
		referenceClient = ThreetapsClient.getInstance().setAuthID("jmrfhu59cnmtnzusshd62pbg").getReferenceClient();		
	}	

	@Test
	public void testGetCategories() throws IOException {
		final List<Category> categories = referenceClient.getCategories();
		assert(categories != null);
		assert(categories.size() > 0);
	}
	
	@Test
	public void testGetCategory() throws IOException {
		final Category category = referenceClient.getCategory("VAUT");
		assert(category != null);
	}

	@Test
	public void testGetLocations() throws IOException {
		final List<Location> locations = referenceClient.getLocations();
		assert(locations != null);
		assert(locations.size() > 0);
	}

	@Test
	public void testGetSources() throws IOException {
		final List<Source> sources = referenceClient.getSources();
		assert(sources != null);
		assert(sources.size() > 0);
	}
}
