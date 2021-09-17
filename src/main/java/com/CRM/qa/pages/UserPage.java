package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UserPage  extends BaseClass{

	
	@FindBy(xpath = "//span[@class = 'party-details__title']")
	WebElement up_title;
	
	@FindBy(xpath = "//a[@aria-label = 'Cases']")
	WebElement casebtn;

	// Constructor to initialize Web elements
	public UserPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// To get user page title
	public String userPage_title()
	{
		return up_title.getText();
	}
	
	// Method to click on case button
	public CasePage clickOnCaseBtn()
	{
		casebtn.click();
		return new CasePage();
	}
	
}
