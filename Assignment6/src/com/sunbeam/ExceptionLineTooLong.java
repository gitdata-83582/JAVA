package com.sunbeam; 

public class ExceptionLineTooLong extends RuntimeException{
	private String message;
	
	public ExceptionLineTooLong() {
		message="";
	}

	public ExceptionLineTooLong(String message) {
		this.message = message;
	}

	@Override
	public void printStackTrace() {
		System.out.println("Exception: ");
		System.out.println("Message: "+message);
	}
	
}
