package com.jsp.ware.exception;

public class SuperAdminAlreadyExistException extends RuntimeException {

	private String message;

	public SuperAdminAlreadyExistException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}


}
