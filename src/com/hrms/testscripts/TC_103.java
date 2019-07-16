package com.hrms.testscripts;

import com.hrms.lib.General;

public class TC_103 {
	public static void main(String args[]) throws Exception {
		General g= new General();
		g.openApplication();
		g.login();
		g.deleEmployee();
		g.logout();
		g.closeApplication();
		
		
	}

}
