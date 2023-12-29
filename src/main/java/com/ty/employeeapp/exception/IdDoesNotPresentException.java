package com.ty.employeeapp.exception;

public class IdDoesNotPresentException extends RuntimeException {
	
	
	private String message;
	
	public IdDoesNotPresentException()
	{
		
	}
	
	public IdDoesNotPresentException(String message)
	{
		this.message=message;
	}
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
	

}
