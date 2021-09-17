package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import com.CRM.qa.utility.IteratorUtil;
import com.CRM.qa.utility.SelectOptions;
import com.CRM.qa.utility.Sleep;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class PartiesPage extends BaseClass {

	com.CRM.qa.pages.HomePage hp = new com.CRM.qa.pages.HomePage();
	
	@FindBy(xpath = "//a[normalize-space()='Add Person']")
	WebElement addPersonbtn;
	
	@FindBy(xpath = "//div[@class='select-box single-select chunky party-form-title']")
	WebElement title;
	
	@FindAll(@FindBy(xpath = "//div[@class = 'select-box__option']"))
	List<WebElement> titleResults;

	@FindBy(xpath = "//input[@class='form-input-text party-form-first-name']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@class='form-input-text party-form-last-name']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@class='ember-text-field ember-view form-input-text party-form-job-title']")
	WebElement jobtitle;
	
	@FindBy(xpath = "//input[@placeholder='Find an organisation']")
	WebElement Organisation;
	
	@FindBy(xpath = "//input[@class='form-input-text party-form-phone-number']")
	WebElement phonenumber;
	
	@FindBy(xpath = "//input[@class='form-input-text party-form-email-address']")
	WebElement email;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement savebtn;
	
	@FindBy(xpath = "//div[@class='filter-select__input-container']//input[@role='searchbox']")
	WebElement tags;

	@FindAll(@FindBy(xpath = "//div[@role='option']"))
	List<WebElement> addtagResults;
	
	@FindAll(@FindBy(xpath = "//div[@role='option']"))
	List<WebElement> organizationResults;

	// Constructor to initialize Web elements
	public PartiesPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	// Method to create new user 
	public UserPage new_user(String title1, String first_name, String last_name, String job_title, String Organization, String tag, String ph_no, String e_id )
	{
		hp.clickOnPeopleBtn();
		addPersonbtn.click();
		title.click();
		IteratorUtil.clickOnLastElementFromList(titleResults);
		firstname.sendKeys(first_name);
		lastname.sendKeys(last_name);
		jobtitle.sendKeys(job_title);
		Organisation.sendKeys(Organization);
		Sleep.sleepWithTime(500);
		IteratorUtil.clickOnLastElementFromList(organizationResults);
		tags.sendKeys(tag);
		IteratorUtil.clickOnLastElementFromList(addtagResults);
		phonenumber.sendKeys(ph_no);
		email.sendKeys(e_id);
		savebtn.click();
		return new UserPage();
	}
	
	
	
	
	
	
	
}
