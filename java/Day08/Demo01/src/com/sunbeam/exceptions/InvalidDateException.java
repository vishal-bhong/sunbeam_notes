package com.sunbeam.exceptions;

//uncheked Exception
public class InvalidDateException extends RuntimeException {
	public InvalidDateException() {
	}

	public InvalidDateException(String message) {
		super(message);
	}

}
