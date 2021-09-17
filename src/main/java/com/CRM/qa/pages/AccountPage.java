package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BaseClass {

	
	@FindBy(xpath = "//h1[@class = 'sp-page__title']")
	WebElement accounttitle;
	
	// Constructor to initialize Web elements
	public AccountPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// To get Account Page Title
	public String accountPageTitle() {
		return accounttitle.getText();
		
	}
	
}
