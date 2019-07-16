package com.hrms.testscripts;

import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC_101 {
	
	@Test
	public void login() throws Exception {
		General g= new General();
		g.openApplication();
		g.login();
		g.logout();
		
	}

}
