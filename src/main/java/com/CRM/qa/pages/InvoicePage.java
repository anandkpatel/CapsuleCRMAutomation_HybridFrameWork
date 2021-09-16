package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InvoicePage extends BaseClass {

	
	@FindBy(xpath = "//header[@class= 'page-box-header']")
	WebElement invoiceTitle;
	
	// Constructor to initialize Web elements
	public InvoicePage()
	{
		PageFactory.initElements(driver, this);
	}

	// To get account invoice page title
	public String invoicePageTitle()
	{
		return invoiceTitle.getText();
	}



}



