package com;

public class Patient {
	private String uId;
	private int patientId;
	private String patientName;
	private String city;
	
	public Patient(String uId,String patientName,String city)
	{
		this.uId = uId;
		this.patientName = patientName;
		this.city = city;
		this.patientId = IDGenerator.id++;
	}
	
	public int getPatientId()
	{
		return patientId;
	}
	
	public String getPatientName()
	{
		return patientName;
	}
	
	public void setPatientName(String patientName)
	{
		this.patientName = patientName;
	}
	
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	
	public String getuId()
	{
		return uId;
	}
	public void setuId(String uId)
	{
		this.uId = uId;
	}
}
