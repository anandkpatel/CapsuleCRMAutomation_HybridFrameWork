package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccSettingUserPage extends BaseClass 
{

	@FindBy(xpath = "//h1[@class='sp-page__title']")
	WebElement accSetUserTitle;
	
	
	@FindBy(xpath = "//a[normalize-space()='Add User']")
	WebElement addNewUserBtn;
	
	
	@FindBy(xpath = "//input[@name='register:firstnameDecorate:firstName']")
	WebElement f_name;
	

	@FindBy(xpath = "//input[@name='register:lastNameDecorate:lastName']")
	WebElement l_name;
	

	@FindBy(xpath = "//input[@name='register:emailDecorate:email']")
	WebElement e_mail;
	

	@FindBy(xpath = "//input[@name='register:usernameDecorate:username']")
	WebElement u_name;
	

	@FindBy(xpath = "//input[@id = 'register:save']")
	WebElement inviteUserBtn;
	
	@FindBy(xpath = "//table[@class = 'chunky-table']//tr[2]//td[2]")
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
