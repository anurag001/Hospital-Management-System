package com;
import java.util.ArrayList;
import java.util.Iterator;

public class Doctor {
	private String regNo;
	private String docName;
	private ArrayList<Patient> patientList;
	public Doctor(String regNo,String docName)
	{
		this.regNo = regNo;
		this.docName = docName;
	}
	public Doctor()
	{
		this.regNo = "DM01";
		this.docName = "Dr. Abc";
	}
	public String getRegNo()
	{
		return regNo;
	}
	public void setRegNo(String regNo)
	{
		this.regNo = regNo;
	}
	public String getDocName()
	{
		return docName;
	}
	public void setDocName(String docName)
	{
		this.docName = docName;
	}
	public ArrayList getPatientList()
	{
		return patientList;
	}
	public void setPatientList(ArrayList<Patient> patientList)
	{
		this.patientList = patientList;
	}
	public int addPatient(Patient p)
	{
		patientList.add(p);
		return patientList.size();
	}
	public int releasePatient(Patient p)
	{
		Iterator<Patient> it1 = patientList.iterator();
		
		while(it1.hasNext())
		{
			
			if(it1.next().getPatientId()== p.getPatientId())
			{
				patientList.remove(it1.next());
			}
				
		}
	
		return patientList.size();
	}
}
