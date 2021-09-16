package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class OppurtunityPage extends BaseClass {
	

	@FindBy(xpath = "//header[@class = 'page-box-header']")
	WebElement oppurtunityTitle;
	
	@FindBy(xpath = "//button[@class= 'btn-primary']")
	WebElement addMilestoneBtn;
	
	@FindBy(xpath = "//input[@class = 'form-input-text milestone-modal-name']")
	WebElement name;
	
	@FindBy(xpath = "//textarea[@class = 'form-input-text milestone-modal-description']")
	WebElement description;
	
	@FindBy(xpath = "//input[@class = 'form-input-text milestone-modal-probability']")
	WebElement probabilityBox;
	
	@FindBy(xpath = "//button[@class = 'async-button ember-view btn-primary']")
	WebElement saveBtn;

	@FindAll(@FindBy(xpath = "//tbody//td[1]//button"))
	public List<WebElement> milestone_names;
	
	// Constructor to initialize Web elements
	public OppurtunityPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// To get opportunity page title
	public String oppurtunityPageTitle()
	{
		return oppurtunityTitle.getText();
	}
	
	// Method to create new Milestone in opportunity page
	public String createNewMileStone(String mname, String desc, String probability)
	{
	
		String s = "";
		
		// Steps to Create New MileStone Inside Opportunity Page
		addMilestoneBtn.click();
		name.sendKeys(mname);
		description.sendKeys(desc);
		probabilityBox.sendKeys(probability);
		saveBtn.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		// Verifying Opportunity is Created or not
		for(WebElement e : milestone_names)
		{
			if(e.getText().equals(mname))
			{
				s = "milestone created";
				break;
			}
			else
			{
				s = "milestone not created";
			}
		
		}
		return s;
	}
}