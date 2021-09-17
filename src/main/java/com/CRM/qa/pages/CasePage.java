package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import com.CRM.qa.utility.IteratorUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class CasePage extends BaseClass {
	
	
	@FindBy(xpath = "//a[normalize-space()='Add Case']")
	WebElement add_casebtn;
		
	@FindBy(xpath = "//input[@placeholder='Find a person or organisation']")
	WebElement case_relates_to;
	
	@FindAll(@FindBy(xpath = "//span[@class = 'search-select__option-text']"))
	List<WebElement> case_relates_toResult;

	@FindBy(xpath = "//input[@class='ember-text-field ember-view form-input-text']")
	WebElement name;
	
	@FindBy(xpath = "//textarea[@class='ember-text-area ember-view form-input-text']")
	WebElement description;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savebtn_in_case;
	
	@FindBy(xpath = "//div[@class = 'searchresult']//ul//li[contains(text(), 'Tom eric' )]")
	WebElement case_relates_to_entry;
	
	@FindBy(xpath = "//div[@class='entity-details__title']")
	WebElement created_case_name;
	
	@FindBy(xpath = "//a[@class = 'ember-view']")
	WebElement created_case_name_for;
	
	@FindBy(xpath = "//span[@class='kase-summary__status-blob kase-summary__status-blob--open']")
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
		IteratorUtil.clickOnFirstElementFromList(case_relates_toResult);
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
