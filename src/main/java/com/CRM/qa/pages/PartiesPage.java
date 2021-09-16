package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class PartiesPage extends BaseClass {

	com.CRM.qa.pages.HomePage hp = new com.CRM.qa.pages.HomePage();
	
	@FindBy(xpath = "//a[@class ='btn-secondary btn-small ember-view'][1]")
	WebElement addPersonbtn;
	
	@FindBy(xpath = "//select[@name = 'party:j_id108:j_id116']")
	WebElement title;
	
	@FindBy(xpath = "//input[@id = 'party:fnDecorate:fn']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@id = 'party:lnDecorate:ln']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@id = 'party:roleDecorate:jobTitle']")
	WebElement jobtitle;
	
	@FindBy(xpath = "//input[@id = 'party:orgDecorate:org']")
	WebElement Organisation;
	
	@FindBy(id = "party:j_id325:0:phnDecorate:number")
	WebElement phonenumber;
	
	@FindBy(id = "party:j_id342:0:emlDecorate:nmbr")
	WebElement email;
	
	@FindBy(id = "party:save")
	WebElement savebtn;
	
	@FindBy(xpath = "//input[@id = 'party:tagsDecorate:tagComboBox']")
	WebElement tags;
	
	@FindBy(id = "party:tagsDecorate:j_id187")
	WebElement addtag;
	
	// Constructor to initialize Web elements
	public PartiesPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	// Method to create new user 
	public com.CRM.qa.pages.UserPage new_user(String title1, String first_name, String last_name, String job_title, String Organization, String tag, String ph_no, String e_id )
	{
		hp.clickOnPeopleBtn();
		addPersonbtn.click();
		Select select = new Select(title);
		select.selectByVisibleText(title1);
		firstname.sendKeys(first_name);
		lastname.sendKeys(last_name);
		jobtitle.sendKeys(job_title);
		Organisation.sendKeys(Organization);
		tags.sendKeys(tag);
		addtag.click();
		phonenumber.sendKeys(ph_no);
		email.sendKeys(e_id);
		savebtn.click();
		return new com.CRM.qa.pages.UserPage();
	}
	
	
	
	
	
	
	
}
