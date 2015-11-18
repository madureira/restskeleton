package com.example.restskeleton.models;

import com.google.gson.annotations.SerializedName;

/**
 * Used to represents a JSON success message.
 * 
 * @author madureira
 *
 */
public class SuccessMessage {

	@SerializedName("success")
	private String message;

	public SuccessMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
