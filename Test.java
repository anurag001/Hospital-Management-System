package com;

public class Test {


	public static void main(String[] args)throws DuplicateDoctorException,PatientExistException {
		// TODO Auto-generated method stub
		HospitalMgmtImpl ob1 = new HospitalMgmtImpl();
		Doctor doc1 = new Doctor();
		Doctor doc2 = new Doctor("DO1","Dr. Tiwari");
		Doctor doc3 = new Doctor("DO2","Dr. Gulati");

		Patient pat1 = new Patient("PAN001","Mr. Pt1","HYD");
		Patient pat2 = new Patient("PAN002","Mr. Pt2","HYD");
		Patient pat3 = new Patient("PAN003","Mr. Pt3","HYD");
		Patient pat4 = new Patient("PAN004","Mr. Pt4","CHN");
		Patient pat5 = new Patient("PAN005","Mr. Pt5","DLH");

		System.out.println(ob1.registerDoctor(doc1));
        System.out.println(ob1.registerDoctor(doc2));
        System.out.println(ob1.registerDoctor(doc3));
        ob1.hospitalizePatient("DO1",pat1);
        ob1.hospitalizePatient("DO1",pat2);
        ob1.hospitalizePatient("DO2",pat3);
        ob1.hospitalizePatient("DO1",pat4);
        ob1.hospitalizePatient("DO2",pat5);
		

        System.out.println(ob1.patientCountPerCity("HYD"));
		
		

	}

}
