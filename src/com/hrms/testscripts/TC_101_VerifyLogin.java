package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import com.utility.Log;
import org.testng.annotations.Test;


import com.hrms.lib.General;

public class TC_101_VerifyLogin {
	public static void main(String args[]) throws Exception {
	}
	
	   @Test
	   public void tc101() throws Exception{
		   
		  // DOMConfigurator.configure("log4j.xml");
		
		General g=new General();
		g.openApplication();
		g.waitstmt();
		g.title();
		g.login();
		g.text();
		g.logout();
		g.closeApplication();
		
	}

}
