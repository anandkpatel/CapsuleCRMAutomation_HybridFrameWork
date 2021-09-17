package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountSettingPage extends BaseClass{

	
	@FindBy(xpath = "//h1[@class='sp-portal__title sp-page__title']")
	WebElement accountpagetitle;
	
	@FindBy(xpath = "//a[@href = '/settings/plan']")
	WebElement accountlink;

	@FindBy(xpath = "//a[@href = '/settings/users']")
	WebElement userlink;

	@FindBy(xpath = "//a[@href = '/settings/integrations']")
	WebElement Integrationlink;

	@FindBy(xpath = "//a[@href = '/settings/dropbox']")
	WebElement mailDropBoxlink;

	@FindBy(xpath = "//a[@href = '/settings/opportunities']")
	WebElement salesPipeline;

	@FindBy(xpath = "//a[@href = '/settings/tracks']")
	WebElement tracklink;

	@FindBy(xpath = "//a[@href = '/settings/categories']")
	WebElement taskcatagorylink;

	@FindBy(xpath = "//a[@href = '/settings/customfields']")
	WebElement customFieldlink;


	// Constructor to initialize Web elements
	public AccountSettingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// To get account setting page title
	public String accountSettingPageTitle()
	{
		return accountpagetitle.getText();
	}
	
	// To click on account link
	public AccountPage clickOnAccount()
	{
		accountlink.click();
		return new AccountPage();
	}

	// To click on MailDropBox link
	public MailDropBoxPage clickOnMailDropBox() 
	{
		mailDropBoxlink.click();
		return new MailDropBoxPage();
	}
	
	// To click on User link
	public AccSettingUserPage clickOnAccSetUser() 
	{
		userlink.click();
		return new AccSettingUserPage();
	}
	
	// To click on Opportunity link
	public OppurtunityPage clickOnsalesPipeline()
	{
		salesPipeline.click();
		return new OppurtunityPage();
	}
	
	// To click on Tracks link
	public TrackPage clickOnTracksLink() 
	{
		tracklink.click();
		return new TrackPage();
	
	}
	
	// To click on Task category link
	public TaskCatagoryPage clickOnTaskcatagoryLink() 
	{
		taskcatagorylink.click();
		return new TaskCatagoryPage();
	}
	
	// To click on CustomField link
	public CustomFieldPage clickOnCustomFieldLink() 
	{
		customFieldlink.click();
		return new CustomFieldPage();
	}

	
	// To click on Integration link
	public IntegrationPage clickOnIntegrationlink() 
	{
		Integrationlink.click();
		return new IntegrationPage();
	}

}
