package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TrackPage extends BaseClass {

	
	@FindBy(xpath = "//h1[@class='sp-page__title']")
	WebElement trackTitle;
	
	// Constructor to initialize Web elements
	public TrackPage() {
		PageFactory.initElements(driver, this);		
	}
	
	// To get track page title
	public String trackPageTitle()
	{
		return trackTitle.getText();
	}
	
	
	
}
