package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_102_Add_NEWEMP {
	//public static void main(String args[]) throws Exception{
	@Test
	public void tc102() throws Exception {
		General g=new General();
		g.openApplication();
		g.waitstmt();
		g.title();
		g.login();
		g.text();
		g.navigatePIM();
		g.addEmp();
		g.entryFrame();
		g.empdetails();
		g.exitFrame();
		g.waitstmt();
		g.logout();
		g.closeApplication();
		
	}

}
