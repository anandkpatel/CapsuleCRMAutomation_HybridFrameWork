package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TrashPage extends BaseClass {

	@FindBy(xpath = "//h2[@class= 'settings-page-header']")
	WebElement trashTitle;
	
	// Constructor to initialize Web elements
	public TrashPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// To get trash page title
	public String trashPageTitle()
	{
		return trashTitle.getText();
	}
	
}
