package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MailDropBoxPage extends BaseClass {
	
	@FindBy(xpath = "//h2[@class='sp-page__title']")
	WebElement mailDropBoxTitle;
	
	// Constructor to initialize Web elements
	public MailDropBoxPage()
	{
		PageFactory.initElements(driver, this);
	}

	// To get mailDropBox page title
	public String mailDropBoxTitle()
	{
		return mailDropBoxTitle.getText();
		
		
	}
	
}
