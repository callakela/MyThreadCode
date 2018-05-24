package com;

public class EmployeeNotFoundException extends Exception{
	
	String message="";
	
	EmployeeNotFoundException(String message){
		
		this.message=message;
	}
	
	public String getMessage() {
		
		return message;
	}

}
