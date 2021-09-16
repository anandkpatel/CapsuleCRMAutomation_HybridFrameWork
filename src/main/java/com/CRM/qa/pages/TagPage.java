package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TagPage extends BaseClass {
	
	
	@FindBy(xpath = "//h2[@class= 'settings-page-header']")
	WebElement tagTitle;
	
	// Constructor to initialize Web elements
	public TagPage()
	{
		PageFactory.initElements(driver, this);
	}

	// To get account setting page title
	public String tagPageTitle()
	{
		return tagTitle.getText();
	}
}
