package com.ty.employeeapp.dto;

public class ResponseStucture<T> {

	private int statusCode;
	
	private String message;
	
	private T Data;

	public int getStatusCode() {
		return statusCode;
	}
	
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return Data;
	}

	public void setData(T data) {
		Data = data;
	}
	
	
	
}
