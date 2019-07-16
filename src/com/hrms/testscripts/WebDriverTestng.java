package com.hrms.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverTestng {
	
	public WebDriver driver;
	
	@BeforeClass
	
	public void startup() {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Student_SW\\Drivers\\geckodriver.exe");
		driver= new FirefoxDriver();
	}
	
	@Test(description="OrangeHRM login")
	
	public void login() throws Exception {
		
		driver.navigate().to("http://localhost/orangehrm/login.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(3000);
	}
	
	@Test(description="logout")
	
	public void logout() {
		
		driver.findElement(By.xpath("//ul[@id='option-menu']/li[3]/a")).click();
		
		
	}

	@AfterClass
	
	public void teardown() {
		
		driver.quit();
	}
}
