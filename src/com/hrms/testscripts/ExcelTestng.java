package com.hrms.testscripts;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class ExcelTestng {
	
public WebDriver driver;

@BeforeClass

public void startup() {
	
	System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Student_SW\\Drivers\\geckodriver.exe");
	driver= new FirefoxDriver();
}

@AfterClass

public void teardown() {
	
	driver.quit();
	
}
@Test(description="Login with Excel")
public void login() throws Exception {
	
	//Reading username and password from excel file and assigning  variables
	
	FileInputStream fis= new FileInputStream("D:\\Selenium_Student_SW\\LoginExcel.xls");
	Workbook w=Workbook.getWorkbook(fis);
	Sheet s= w.getSheet(0);
	String un= s.getCell(0,1).getContents();
	String pw=s.getCell(1,1).getContents();
	
	//typing user name and password from Excel file
	
	driver.navigate().to("http://localhost/orangehrm/login.php");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(un);
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(pw);
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	Thread.sleep(2000);
	Reporter.log("Login completed");
	driver.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a")).click();
	Reporter.log("Logout Completed");
			
	
}



}
