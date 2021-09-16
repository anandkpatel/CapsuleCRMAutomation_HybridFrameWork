package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ExportPage extends BaseClass {
	
	@FindBy(xpath = "//h1[@class = 'settings-page-header']")
	WebElement exportTitle;
	
	// Constructor to initialize Web elements
	public ExportPage()
	{
		PageFactory.initElements(driver, this);
	}

	// To get export page title
	public String exportPageTitle()
	{
		return exportTitle.getText();
		
	}
	
}
