package com;

import java.util.ArrayList;
import java.util.Iterator;

public class HospitalMgmtImpl {
	private ArrayList<Doctor> doctorList=null;
	
	public int registerDoctor(Doctor d)
	{
		int docFlag=0;
		if(doctorList.isEmpty())
		{
			doctorList.add(d);

		}
		Iterator<Doctor> it = doctorList.iterator();
		while(it.hasNext())
		{
			try {
			if(it.next().getRegNo()==d.getRegNo())
			{
				docFlag=1;
				throw new DuplicateDoctorException("Doctor with same Reg No Exist in System");
			}
			}
			catch(DuplicateDoctorException e)
			{
				System.out.println(e.getMessage());
			}
		}
		if(docFlag==0)
		{
			doctorList.add(d);
			return doctorList.size();
		}
		else
		{
			return -1;
		}
	}
	
	public int hospitalizePatient(String regNo,Patient p)
	{
		int patFlag=0;
		ArrayList<Patient> ptList;
		String docRegNo;
		Iterator<Doctor> it = doctorList.iterator();

		while(it.hasNext())
		{
			if(it.next().getRegNo()== regNo)
			{
				ptList = it.next().getPatientList();
				Iterator<Patient> it1 = ptList.iterator();
				while(it1.hasNext())
				{
					try {
					if(it1.next().getuId()== p.getuId())
					{
						patFlag=1;
						throw new PatientExistException("Patient with given PAN already hospitalized");
					}
					}
					catch(PatientExistException e)
					{
						System.out.println(e.getMessage());
					}
				}
				if(patFlag==0)
				{
					ptList.add(p);
					return ptList.size();
				}
						
			}
		}
		return -1;
		
	}
	
	public int releasePatient(int patientId)
	{
		ArrayList<Patient> ptList;
		Iterator<Doctor> it = doctorList.iterator();

		while(it.hasNext())
		{
				ptList = it.next().getPatientList();
				Iterator<Patient> it1 = ptList.iterator();
				while(it1.hasNext())
				{
					if(it1.next().getPatientId()== patientId)
					{
						ptList.remove(it1.next());
						return ptList.size();
					}
					
				}
		}
		return -1;
	}
	
	public Doctor retrieveDoctorInfo(int patientId)
	{
		ArrayList<Patient> ptList;
		Iterator<Doctor> it = doctorList.iterator();
		Doctor obj;
		while(it.hasNext())
		{
				ptList = it.next().getPatientList();
				Iterator<Patient> it1 = ptList.iterator();
				while(it1.hasNext())
				{
					if(it1.next().getPatientId()== patientId)
					{
						obj = it.next();
						return obj;
					}
					
				}
		}
		//return empty doctor
		return new Doctor();
	}
	
	
	public int patientCountPerCity(String city)
	{
		ArrayList<Patient> ptList;
		Iterator<Doctor> it = doctorList.iterator();
		int ptCount=0;
		while(it.hasNext())
		{
				ptList = it.next().getPatientList();
				Iterator<Patient> it1 = ptList.iterator();
				while(it1.hasNext())
				{
					if(it1.next().getCity()== city)
					{
						ptCount++;
					}
					
				}
		}
		return ptCount;
	}


}
