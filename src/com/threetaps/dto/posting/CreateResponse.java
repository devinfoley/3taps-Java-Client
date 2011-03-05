package com.threetaps.dto.posting;

import com.threetaps.model.Message;

public class CreateResponse {
	private String postKey;
	private Message error;

	public String getPostKey() {
		return postKey;
	}

	public void setPostKey(String postKey) {
		this.postKey = postKey;
	}

	public Message getError() {
		return error;
	}

	public void setError(Message error) {
		this.error = error;
	}
}
