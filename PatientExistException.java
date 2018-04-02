package com;

public class PatientExistException extends Exception{
	private static final long serialVersionUID=1L;
	
	PatientExistException(String msg)
	{
		super(msg);
	}
	
	public String getMessage()
	{
		return super.getMessage();
	}

}
