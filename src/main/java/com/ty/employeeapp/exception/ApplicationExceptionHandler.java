package com.ty.employeeapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.ty.employeeapp.dto.ResponseStucture;

@ControllerAdvice
public class ApplicationExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(IdDoesNotPresentException.class)
	public ResponseEntity<ResponseStucture<String>> catchIdNotPresentException(IdDoesNotPresentException exception)
	{
		ResponseStucture<String> resp= new ResponseStucture<>();
		resp.setMessage("Not Found");
		resp.setStatusCode(HttpStatus.NOT_FOUND.value());
		resp.setData(exception.getMessage());
		
		return new ResponseEntity<ResponseStucture<String>>(resp,HttpStatus.NOT_FOUND);
		
	}

}
