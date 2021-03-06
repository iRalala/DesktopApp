package com.rssaggregator.desktop.model;

/**
 * Error class from the API.
 * 
 * @author Irina
 *
 */
public class ApiError {

	private String error;
	private int error_code;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public int getError_code() {
		return error_code;
	}

	public void setError_code(int error_code) {
		this.error_code = error_code;
	}
}
