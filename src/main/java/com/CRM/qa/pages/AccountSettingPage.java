package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountSettingPage extends BaseClass{

	
	@FindBy(xpath = "//span[@class= 'settings-content-menu-title']")
	WebElement accountpagetitle;
	
	@FindBy(xpath = "//a[@href = '/settings/account']")
	WebElement accountlink;
	
	@FindBy(xpath = "//a[@href = '/settings/account/invoices']")
	WebElement invoicelink;
	
	@FindBy(xpath = "//a[@href = '/settings/account/export']")
	WebElement exportlink;
	
	@FindBy(xpath = "//a[@href = '/settings/account/appearance']")
	WebElement appearancelink;
	
	@FindBy(xpath = "//a[@href = '/settings/dropbox']")
	WebElement mailDropBoxlink;
	
	@FindBy(xpath = "//li//a[@href = '/settings/users']")
	WebElement userlink;
	
	@FindBy(xpath = "//a[@href = '/settings/opportunities']")
	WebElement oppurtunitylink;
	
	@FindBy(xpath = "//a[@href = '/settings/tracks/opportunities']")
	WebElement tracklink;
	
	@FindBy(xpath = "//a[@href = '/settings/categories']")
	WebElement taskcatagorylink;
	
	@FindBy(xpath = "//a[@href = '/settings/customfields/party']")
	WebElement customFieldlink;
	
	@FindBy(xpath = "//a[@href = '/settings/tags/party']")
	WebElement tagslink;
	
	@FindBy(xpath = "//a[@href = '/settings/integrations']")
	WebElement Integrationlink;
	
	@FindBy(xpath = "//a[@href = '/settings/trash']")
	WebElement trashlink;
	
	
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
	public com.CRM.qa.pages.AccountPage clickOnAccount()
	{
		accountlink.click();
		return new com.CRM.qa.pages.AccountPage();
	}
	
	// To click on account link
	public InvoicePage clickOnInvoice()
	{
		invoicelink.click();
		return new InvoicePage();
	}
	
	// To click on Export link
	public ExportPage clickOnExport() 
	{
		exportlink.click();
		return new ExportPage();
	}
	
	// To click on Appearance link
	public AppearancePage clickOnAppearance() 
	{
		appearancelink.click();
		return new AppearancePage();
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
	public OppurtunityPage clickOnOppurtunity() 
	{
		oppurtunitylink.click();
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
	
	// To click on Tags link
	public TagPage clickOnTagslink() 
	{
		tagslink.click();
		return new TagPage();
	}
	
	// To click on Integration link
	public IntegrationPage clickOnIntegrationlink() 
	{
		Integrationlink.click();
		return new IntegrationPage();
	}
	
	// To click on Trash link
	public TrashPage clickOnTrashLink() 
	{
		trashlink.click();
		return new TrashPage();
	}
	
}
