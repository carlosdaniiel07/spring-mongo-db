package com.carlos.workshop.resources.exceptions;

public class Erro {

	private long timestamp;
	private String message;
	private int httpStatus;
	private String requestUri;
	
	public Erro() {
		
	}
	
	public Erro(long timestamp, String message, int httpStatus, String requestUri) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.httpStatus = httpStatus;
		this.requestUri = requestUri;
	}

	public long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public int getHttpStatus() {
		return httpStatus;
	}
	
	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getRequestUri() {
		return requestUri;
	}

	public void setRequestUri(String requestUri) {
		this.requestUri = requestUri;
	}
}
