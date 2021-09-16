package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CasePage extends BaseClass {
	
	
	@FindBy(xpath = "//a[@class= 'btn-secondary btn-small ember-view']")
	WebElement add_casebtn;
		
	@FindBy(xpath = "//input[@id = 'partySearch']")
	WebElement case_relates_to;
	
	@FindBy(xpath = "//input [@id = 'caseNameDecorate:name']")
	WebElement name;
	
	@FindBy(xpath = "//textarea[@id = 'caseDescriptionDecorate:description']")
	WebElement description;
	
	@FindBy(xpath = "//input[@id = 'save']")
	WebElement savebtn_in_case;
	
	@FindBy(xpath = "//div[@class = 'searchresult']//ul//li[contains(text(), 'Tom eric' )]")
	WebElement case_relates_to_entry;
	
	@FindBy(xpath = "//div[@class = 'entity-details-title']")
	WebElement created_case_name;
	
	@FindBy(xpath = "//a[@class = 'ember-view']")
	WebElement created_case_name_for;
	
	@FindBy(xpath = "//span[@class = 'kase-summary-status-open']")
	WebElement case_status;
	
	
	// Constructor to initialize Web elements
	public CasePage()
	{
		PageFactory.initElements(driver, this);
	}
	

	// Method to create new new case
	public String newCase()
	{
		add_casebtn.click();
		case_relates_to.sendKeys("tom");
		case_relates_to_entry.click();
		name.sendKeys("test car lost");
		description.sendKeys("about lost car");
		savebtn_in_case.click();
		return created_case_name.getText();
	}
	
	// Method to get user name for which case is created
	public String caseCreatedFor()
	{
		return created_case_name_for.getText();
	}
	
	// Method to get case status
	public String caseStatusVerification()
	{
		return case_status.getText();
	}
	
	
	
	
	

}
