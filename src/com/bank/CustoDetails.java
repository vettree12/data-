package com.bank;

import org.studentdetails.StudentProfile;
import org.vetri.CompanyDetails;

public class  CustoDetails {

	private void cusAcc() {
		System.out.println("1234567890");	}
	

	private void cusIfsc() {
	System.out.println("SBIN0001411");
	

	}
	private void cusAccType() {
		System.out.println("savings");
	}
	
private void cusBank() {
	System.out.println("SBI");

}	
	public static void main(String[] args) {
		StudentProfile f=new StudentProfile();
		CompanyDetails s=new CompanyDetails();
		CustoDetails g=new CustoDetails();
		g.cusBank();
		g.cusAcc();
		g.cusAccType();
		g.cusIfsc();
		s.compName();
		s.complocation();
		s.compGst();
		f.stuName();
		f.stuMob();
		f.stuId();
		
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
