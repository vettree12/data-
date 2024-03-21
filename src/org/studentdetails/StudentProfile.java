package org.studentdetails;

import org.vetri.CompanyDetails;

public class StudentProfile {

	public void stuName() {

	System.out.println("stuname:vetri");
	
	
	}
	public void stuMob() {
System.out.println("7667973013");	}
	
	
	public  void stuId() {
		System.out.println("13702");
	}
	
	public static void main(String[] args) {
		StudentProfile f=new StudentProfile();
		CompanyDetails s=new CompanyDetails();

		
		s.compName();
		s.complocation();
		s.compGst();
	
	f.stuName();
	f.stuMob();
	f.stuId();
	
	
	}
	
	
	
	
	
	
}
