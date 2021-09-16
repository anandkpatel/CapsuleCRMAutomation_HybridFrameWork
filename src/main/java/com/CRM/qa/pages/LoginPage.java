package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import com.CRM.qa.utility.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass
{
	@FindBy(name =  "login:usernameDecorate:username")
	WebElement username;
	
	@FindBy(id = "login:passwordDecorate:password")
	WebElement password;
	
	@FindBy(id = "login:login")
	WebElement submit;
	
	@FindBy(xpath = "//a[normalize-space()='Log in']")
	WebElement login;
	
	@FindBy(id = "login-subdomain")
	WebElement cp_account;
	
	@FindBy(id = "login-button")
	WebElement go_to_login;
	
	// Constructor to initialize Web elements
	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	// Method to Login into account
	public PartiesPage login()
	{
		login.click();
		cp_account.sendKeys(PropertyReader.getProp("domain_name"));
		go_to_login.click();
		username.sendKeys(PropertyReader.getProp("username"));
		password.sendKeys(PropertyReader.getProp("password"));
		submit.click();
		return new PartiesPage();
	}
	
	
	
}
