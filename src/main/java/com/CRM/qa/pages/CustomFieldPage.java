package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CustomFieldPage extends BaseClass{

	@FindBy(xpath = "//h1[@class='sp-page__title']")
	WebElement customfieldtitle;
	
	// Constructor to initialize Web elements
	public CustomFieldPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// To get customField page title
	public String  customFieldPageTitle()
	{
		return customfieldtitle.getText();
	}
	
	
}
