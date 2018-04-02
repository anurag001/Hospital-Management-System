package com;

public class DuplicateDoctorException extends Exception{
	private static final long serialVersionUID=1L;
	
	DuplicateDoctorException(String msg)
	{
		super(msg);
	}
	
	public String getMessage()
	{
		return super.getMessage();
	}

}
