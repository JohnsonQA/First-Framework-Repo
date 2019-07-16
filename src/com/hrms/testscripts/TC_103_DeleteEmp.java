package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_103_DeleteEmp {
	//public static void main(String args[]) throws Exception{
		
	@Test
	public void tc103() throws Exception {
		General g=new General();
		g.openApplication();
		g.waitstmt();
		g.title();
		g.login();
		g.text();
		g.navigatePIM();
		g.emplist();
		g.entryFrame();
		g.selectEmpid();
		g.enter_empid();
		g.searchEmp();
		g.deleEmployee();
		g.exitFrame();
		g.logout();
		g.closeApplication();
	}

}
