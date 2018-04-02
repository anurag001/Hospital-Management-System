package com;

public interface IHospitalMgmt {
	public int registerDoctor(Doctor d);
	public int hospitalizePatient(String regNo,Patient p);
	public int releasePatient(int patientId);
	public Doctor retrieveDoctorInfo(int patientId);
	public int patientCountPerCity(String city);
}
