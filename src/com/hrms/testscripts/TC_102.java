package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC_102 {
	public static void main(String args[]) throws Exception {
	
	General g= new General();
	g.openApplication();
	g.login();
	g.addEmployee();
	g.logout();
	g.closeApplication();
	

}
}
