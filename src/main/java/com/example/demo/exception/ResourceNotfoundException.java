package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// se wheever a record does not exist in database we will get this 
//message exception--restApi will throw this mesage


@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotfoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ResourceNotfoundException(String message) {
		super(message);
	}
}
