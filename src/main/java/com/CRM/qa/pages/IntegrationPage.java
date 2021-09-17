package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class IntegrationPage  extends BaseClass{
	
	@FindBy(xpath = "//h1[@class='sp-page__title']")
	WebElement integrationTitle;
	
	@FindAll(@FindBy(xpath = "//a[@class = 'btn-primary settings-page-integration-configure']"))
	List<WebElement> configureBtns;
	
	
	// Constructor to initialize Web elements
	public IntegrationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// Method to get Integration page title
	public String integrationPageTitle()
	{
		return integrationTitle.getText();
	}
	
	// Method to count configure button in integration page
	public int configureButtons()
	{
		return configureBtns.size();
	}

}
