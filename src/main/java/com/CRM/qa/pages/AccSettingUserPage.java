package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccSettingUserPage extends BaseClass 
{

	@FindBy(xpath = "//h2[@class= 'settings-page-header']")
	WebElement accSetUserTitle;
	
	
	@FindBy(xpath = "//a[@class= 'action btn-primary btn-primary-clear']")
	WebElement addNewUserBtn;
	
	
	@FindBy(xpath = "//input[@id = 'register:firstnameDecorate:firstName']")
	WebElement f_name;
	

	@FindBy(xpath = "//input[@id = 'register:lastNameDecorate:lastName']")
	WebElement l_name;
	

	@FindBy(xpath = "//input[@id = 'register:emailDecorate:email']")
	WebElement e_mail;
	

	@FindBy(xpath = "//input[@id = 'register:usernameDecorate:username']")
	WebElement u_name;
	

	@FindBy(xpath = "//input[@id = 'register:save']")
	WebElement inviteUserBtn;
	
	@FindBy(xpath = "//tr[@class = 'even-row']//td[2]")
	WebElement created_user_uname;
	
	
	
	// Constructor to initialize Web elements
	public AccSettingUserPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// To get User Page title
	public String AccountSettingUserPageTitle()
	{
		return accSetUserTitle.getText();
	}
	
	// Method to create new User in user page
	public String createNewUser(String fi_name, String la_name, String e_address, String user_name) 
	{
		addNewUserBtn.click();
		f_name.sendKeys(fi_name);
		l_name.sendKeys(la_name);
		e_mail.sendKeys(e_address);
		u_name.sendKeys(user_name);
		inviteUserBtn.click();
		return created_user_uname.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
