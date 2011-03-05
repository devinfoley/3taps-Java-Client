package com.threetaps.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.threetaps.model.Message;
import com.threetaps.model.Posting;

public class StatusClientTest extends TestCase {
	
	protected StatusClient statusClient;
	
	protected void setUp() {
		statusClient = ThreetapsClient.getInstance().getStatusClient();		
	}	

	@Test
	public void testSystem() throws IOException {
		
		final Message message = statusClient.system();
		assert message.getCode() != null;
	}
	
	@Test
	public void testUpdate() throws IOException {
		
		final Posting posting = new Posting();
		posting.setExternalID("NOTANIDAGAIN");
		posting.setSource("E_BAY");
		posting.setStatus("test");
		
		final List<Posting> postingsToUpdate = new ArrayList<Posting>();
		postingsToUpdate.add(posting);
		
		final Message result = statusClient.update(postingsToUpdate);
		assert result.getCode().equals("200");
	}
	
	@Test
	public void testGet() throws IOException {
		
		final Posting posting = new Posting();
		posting.setExternalID("NOTANID");
		posting.setSource("E_BAY");
		
		final List<Posting> postingsToCheck = new ArrayList<Posting>();
		postingsToCheck.add(posting);
		
		final List<Posting> checkedPostings = statusClient.get(postingsToCheck);
		
		assert checkedPostings.size() == 1;
		assert checkedPostings.get(0).getExists().booleanValue() == false;
	}
}
