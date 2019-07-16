package com.hrms.testscripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationExmp {
	
	@BeforeClass
	
	public void login() {
		
		System.out.println("Login completed");
		
		
	}
	
	@Test(priority=1)
	
	public void addEmp() {
		
		System.out.println("Employeee added");
	}
	
	@Test(priority=2)
	
	public void delEmp() {
		
		System.out.println("Employee Deleted");
	}
	
	@AfterClass
	
	public void logout() {
		
		System.out.println("Logout completed");
	}

}
