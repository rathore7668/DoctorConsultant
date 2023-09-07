package com.me.exception;

public class DoctorNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1631823366296521859L;

	public DoctorNotFoundException() {
	}

	public DoctorNotFoundException(String message) {
		super(message);
	}
}