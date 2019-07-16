package com.hrms.lib;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.utility.Log;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.testng.Assert.assertTrue;

public class General extends Global{

	public void openApplication() {
		Log.info("***Started Execution****");
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium_Student_SW\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		Log.info("Application opened Succesfully");
	}
	
	public void waitstmt() {
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
	
	public void title() {
		
		if(driver.getTitle().matches("title")) {
			System.out.println("Title is matched");
		}
		else {
			System.out.println("Title is not matched but the title is "+driver.getTitle());
		}
	}
	
	public void text() {
		
		assertTrue(driver.findElement(By.xpath(link_text)).getText().matches(text));
		System.out.println("Welcome text is matched");
	}

	public void login() throws Exception {
		driver.findElement(By.xpath(txt_loginname)).sendKeys(un);
		driver.findElement(By.xpath(txt_password)).sendKeys(pw);
		driver.findElement(By.xpath(btn_login)).click();
		Thread.sleep(3000);
		System.out.println("Logged in successfully");

	}
	
	public void entryFrame() {
		driver.switchTo().frame("rightMenu");
	}
	
	public void exitFrame() {
		driver.switchTo().defaultContent();
	}
	
	

	public void addEmployee() throws Exception {
		driver.findElement(By.xpath(btn_add)).click();
		driver.findElement(By.xpath(txt_lastname)).sendKeys(ln);
		driver.findElement(By.xpath(txt_firstname)).sendKeys(fn);
		driver.findElement(By.xpath(label_file)).sendKeys(photo_upload);
		driver.findElement(By.xpath(btn_save)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(btn_back)).click();
		Thread.sleep(3000);
		System.out.println("Employee added");

	}

	public void deleEmployee() throws Exception {

		driver.findElement(By.xpath(checkbox)).click();
		driver.findElement(By.xpath(btn_del)).click();
		Thread.sleep(2000);
		System.out.println("Employee deleted");
		

	}
	
	public void navigatePIM() throws Exception {
		WebElement ele= driver.findElement(By.xpath(btn_pim));
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		Thread.sleep(2000);
	}
	public void addEmp() {
		driver.findElement(By.xpath(btn_addemp)).click();
		System.out.println("add emp button working fine");
	}
	public void empdetails() {
		driver.findElement(By.xpath(txt_lastname)).sendKeys(ln);
		driver.findElement(By.xpath(txt_firstname)).sendKeys(fn);
		driver.findElement(By.xpath(btn_save)).click();
		
	}
	
	public void emplist() throws Exception {
		driver.findElement(By.xpath(btn_emplist)).click();
		System.out.println("Emp list button working fine");
	}
	
	public void selectEmpid() throws Exception{
		Select s= new Select(driver.findElement(By.xpath(empid)));
		s.selectByVisibleText("Emp. ID");
		Thread.sleep(2000);
	}
	
	public void enter_empid() {
		driver.findElement(By.xpath(search_empid)).sendKeys("0026");
	}
	
	public void searchEmp() {
		driver.findElement(By.xpath(search)).click();
	}
	
	

	public void logout() {
		driver.findElement(By.xpath(link_logout)).click();
		System.out.println("Loggedout successfully");

	}

	public void closeApplication() {
		driver.close();
		Log.info("Application closed succesfully");
	}


}
