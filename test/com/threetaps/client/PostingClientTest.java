package com.threetaps.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import com.threetaps.dto.posting.CreateResponse;
import com.threetaps.dto.posting.DeleteResponse;
import com.threetaps.dto.posting.UpdateResponse;
import com.threetaps.model.Posting;


public class PostingClientTest extends TestCase {
	
	protected PostingClient postingClient;
	
	protected void setUp() {
		postingClient = ThreetapsClient.getInstance().getPostingClient();
	}
	
	@Test
	public void testGet() throws IOException {
		final Posting posting = postingClient.get("BDY6869");
		assert posting != null;
	}
	
	@Test
	public void testCreate() throws IOException {
		final Posting posting1 = new Posting();
		posting1.setSource("3TAPS");
		posting1.setCategory("VAUT");		
		posting1.setHeading("This is a Test Posting");
		posting1.setLocation("LAX");
		posting1.setTimestamp(new Date());

		final Posting posting2 = new Posting();
		posting2.setSource("3TAPS");
		posting2.setCategory("VAUT");		
		posting2.setHeading("This is a Test Posting");
		posting2.setLocation("LAX");
		
		final List<Posting> postingsToCreate = new ArrayList<Posting>();
		postingsToCreate.add(posting1);
		postingsToCreate.add(posting2);
		
		final List<CreateResponse> responses = postingClient.create(postingsToCreate);
		
		assert responses.size() == 2;
		assert responses.get(0).getPostKey() != null;
		assert responses.get(0).getError() == null;
		assert responses.get(1).getPostKey() == null;
		assert responses.get(1).getError() != null;
	}
	
	@Test
	public void testUpdate() throws IOException {
		final Posting posting1 = new Posting();
		posting1.setPostKey("BEKSWA8");
		posting1.setHeading("Updated Heading");
		
		final List<Posting> postingsToUpdate = new ArrayList<Posting>();
		postingsToUpdate.add(posting1);
		
		final UpdateResponse response = postingClient.update(postingsToUpdate);
		assert response.getSuccess().booleanValue() == true;
	}	
	
	@Test
	public void testDelete() throws IOException {
		final List<String> postKeysToDelete = new ArrayList<String>();
		postKeysToDelete.add("NOTAPOSTING");
		
		final DeleteResponse response = postingClient.delete(postKeysToDelete);
		assert response.getSuccess().booleanValue() == true;
	}
	
	@Test
	public void testExists() throws IOException {
		final Posting postingToCheck1 = new Posting();
		postingToCheck1.setSource("E_BAY");
		postingToCheck1.setExternalID("180634157546");
		
		final Posting postingToCheck2 = new Posting();
		postingToCheck1.setSource("E_BAY");
		postingToCheck1.setExternalID("DONTEXIST");
		
		final List<Posting> postingsToCheck = new ArrayList<Posting>();
		postingsToCheck.add(postingToCheck1);
		postingsToCheck.add(postingToCheck2);
		
		@SuppressWarnings("deprecation")
		final List<Posting> checkedPostings = postingClient.exists(postingsToCheck);
		assert checkedPostings.size() == postingsToCheck.size();
		
		assert checkedPostings.get(0).getExternalID().equals("180634157546");
		assert checkedPostings.get(0).getExists() == true;
		
		assert checkedPostings.get(1).getExternalID().equals("DONTEXIST");
		assert checkedPostings.get(0).getExists() == false;
	}
}
