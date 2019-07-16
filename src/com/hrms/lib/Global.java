package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	
	public WebDriver driver;
	public String url= "http://localhost/orangehrm/login.php";
	public String un="admin";
	public String pw="admin";//input[@id='txtEmpLastName']
	public String ln="Manjeera";
	public String fn="Johnson";
	public String txt_loginname= "//input[@name='txtUserName']";
	public String txt_password= "//input[@name='txtPassword']";
	public String btn_login= "//input[@name='Submit']";
	public String link_logout= "//ul[@id='option-menu']/li[3]/a";
	public String btn_add= "//*[@id=\"standardView\"]/div[3]/div[1]/input[1]";
	public String label_file= "//input[@id='photofile']";
	public String txt_lastname= "//*[@id=\"txtEmpLastName\"]";
	public String txt_firstname= "//input[@id='txtEmpFirstName']";
	public String btn_save= "//input[@id='btnEdit']";
	public String btn_back= "/html/body/div[5]/input";
	public String checkbox= "//*[@id=\"standardView\"]/table/tbody/tr/td[1]/input";
	public String btn_del= "//*[@id=\"standardView\"]/div[3]/div[1]/input[2]";
	public String photo_upload= "C:\\Users\\Johnson K\\OneDrive\\My Pictures\\result_1548157046602.jpg";
	public String title="OrangeHRM-New Level of HR Management";
	public String text= "Welcome admin";
	public String link_text= "//div[@id='option-menu-bar']/ul/li";
	public String btn_pim= "//*[@id=\"pim\"]/a/span";
	public String btn_addemp= "//*[@id=\"pim\"]/ul/li[2]/a/span";
	public String btn_emplist= "//*[@id=\"pim\"]/ul/li[1]/a/span";
	public String empid="//select[@id='loc_code']";
	public String search_empid= "//*[@id=\"loc_name\"]";
	public String search="//*[@id=\"standardView\"]/div[2]/input[2]";
	
	
	
}
