package com.CRM.testcases;

import com.CRM.qa.pages.*;
import com.CRM.qa.reports.LogStatus;
import com.CRM.qa.testbase.BaseClass;
import com.CRM.qa.utility.XlUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AccountSettingPageTest extends BaseClass {

	@BeforeClass
	public void setUp()
	{
		loginpage = new LoginPage();
		loginpage.login();
		homepage = new HomePage();
		acctsettingpage = new AccountSettingPage();
		accountpage = new AccountPage();
		invoicepage = new InvoicePage();
		exportpage = new ExportPage();
		appearancepage = new AppearancePage();
		mailbox = new MailDropBoxPage();
		userpageInaccSetting = new AccSettingUserPage();
		oppurtunitypage = new OppurtunityPage();
		trackpage = new TrackPage();
		taskcatagorypage = new TaskCatagoryPage();
		customfieldpage = new CustomFieldPage();
		tagpage = new TagPage();
		integrationpage = new IntegrationPage();
		trashpage = new TrashPage();
	}
	
	// Test case to verify setting page
	@Test(priority = 1)
	public void Verifying_setting_page()
	{	
		homepage.goToAccountSettingPage();
		String actual_title = acctsettingpage.accountSettingPageTitle();
		String expected_title = "Account Settings";
		Assert.assertEquals(actual_title, expected_title);
	}
	
	
	// Test case to verify account page
	@Test(priority = 2, enabled= true)
	public void verifying_account_page()
	{
		acctsettingpage.clickOnAccount();
		String actual_title = accountpage.accountPageTitle();
		String expected_title = "Account";
		Assert.assertEquals(actual_title, expected_title);
	}
	
	
	// Test case to verify invoice page
	@Test(priority = 3, enabled= true)
	public void verifying_invoice_page()
	{
		acctsettingpage.clickOnInvoice();
		String actual_title = invoicepage.invoicePageTitle();
		String expected_title = "Invoices";
		Assert.assertEquals(actual_title, expected_title);
	}
	
	
	// Test case to verify export page
	@Test(priority = 4, enabled= true)
	public void veryfing_export_page()
	{
		acctsettingpage.clickOnExport();
		String actual_title = exportpage.exportPageTitle();
		String expected_title = "Export";
		Assert.assertEquals(actual_title, expected_title);
	}
	
	
	// Test case to verify appearance page and logo uploading 
	@Test(priority = 5, enabled = true)
	public void verifying_appearancePage_and_logoUploading() 
	{
		acctsettingpage.clickOnAppearance();
		String actual_title = appearancepage.appearancePageTitle();
		String expected_title = "Appearance";
		Assert.assertEquals(actual_title, expected_title);
		String actual_imgText = appearancepage.uploadingLogo();
		String expected_imgText = "Image displayed.";
		Assert.assertEquals(actual_imgText, expected_imgText);
	}

	
	// Test case to verify mail Drop Box page
	@Test(priority = 6, enabled= true)
	public void verifying_mailDropBox_page()
	{
		acctsettingpage.clickOnMailDropBox();
		String actual_title = mailbox.mailDropBoxTitle();
		String expected_title = "Mail Drop Box";
		Assert.assertEquals(actual_title, expected_title);
	}
	
	
	// Test case to verify User page
	@Test(priority = 7, enabled= true)
	public void verifying_AcctSettingUser_page()
	{
		acctsettingpage.clickOnAccSetUser();
		String actual_title = userpageInaccSetting.AccountSettingUserPageTitle();
		String expected_title = "Users";
		Assert.assertEquals(actual_title, expected_title);
	}
	
	
	// Test case to verify User creation in user page
	@Test(priority = 8, dataProvider = "user_creation", enabled= true)
	public void verifying_UserCreation_InAccSettingUserpage(String fi_name, String la_name, String e_address, String user_name) 
	{
		String actual_result = userpageInaccSetting.createNewUser(fi_name, la_name, e_address, user_name);
		String expected_result = "k_artik45";
		Assert.assertEquals(actual_result, expected_result);
	}
	
	
	// Test case to verify Milestone creation in opportunity page
	@Test(priority = 9, dataProvider = "milestone_creation", enabled= false)
	public void verifying_milestoneCreation_InOppurtunity_Page(String mname, String desc, String probability)
	{
		// Clicking on Opportunity Page Link
		acctsettingpage.clickOnOppurtunity();

		// Verifying Opportunity Page Title
		String actual_title = oppurtunitypage.oppurtunityPageTitle();
		String expected_title = "Opportunities";
		Assert.assertEquals(actual_title, expected_title);

		// Verifying Milestone Creation Inside Opportunity Page
		String actual_result = oppurtunitypage.createNewMileStone(mname, desc, probability);
		String expected_result = "milestone created";
		Assert.assertEquals(actual_result, expected_result);
	}
	
	
	// Test case to verify Track page
	@Test(priority = 10)
	public void verifying_Track_page()
	{
		acctsettingpage.clickOnTracksLink();
		String actual_title = trackpage.trackPageTitle();
		String expected_title = "Tracks";
		Assert.assertEquals(actual_title, expected_title);
	}
	
	
	// Test case to verify Task Catagory page
	@Test(priority = 11)
	public void verifying_Task_Catagory_page()
	{
		acctsettingpage.clickOnTaskcatagoryLink();
		String actual_title = taskcatagorypage.taskCatagoryPageTitle();
		String expected_title = "Task Categories";
		Assert.assertEquals(actual_title, expected_title);	
	}
	
	
	// Test case to verify Custom Field page
	@Test(priority = 12)
	public void verifying_Custom_Field_page()
	{
		acctsettingpage.clickOnCustomFieldLink();
		String actual_title = customfieldpage.customFieldPageTitle();
		String expected_title = "Custom Fields";
		Assert.assertEquals(actual_title, expected_title);
	}
	
	
	// Test case to verify Tag page
	@Test(priority = 13)
	public void verifying_Tag_page()
	{
		acctsettingpage.clickOnTagslink();
		String actual_title = tagpage.tagPageTitle();
		String expected_title = "Tags and DataTags";
		Assert.assertEquals(actual_title, expected_title);
	}
	
	
	// Test case to verify Integration page
	@Test(priority = 14)
	public void verifying_Integration_page()
	{
		acctsettingpage.clickOnIntegrationlink();
		String actual_title = integrationpage.integrationPageTitle();
		String expected_title = "Integrations";
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(integrationpage.configureButtons() + " number of configure buttons available in Integration Page");
		LogStatus.info(integrationpage.configureButtons() + " number of configure buttons available in Integration Page");
	}
	
	
	// Test case to verify Trash page
	@Test(priority = 15)
	public void verifying_Trash_page()
	{
		acctsettingpage.clickOnTrashLink();
		String actual_title = trashpage.trashPageTitle();
		String expected_title = "Trash";
		Assert.assertEquals(actual_title, expected_title);
	}
	

	// Data provider to create User
	@DataProvider(name = "user_creation")
	public static Object [][] getUserData() throws Exception
	{
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\CRM\\qa\\testdata\\create_user.xlsx";
		Object[][] userData = XlUtils.getData(path, "data2");
		return userData;
	}
	
	
	// Data provider to create milestone
	@DataProvider(name = "milestone_creation")
	public static Object [][] getMilestoneData() throws Exception
	{
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\CRM\\qa\\testdata\\create_user.xlsx";
		Object[][] userData = XlUtils.getData(path, "milestone");
		return userData;
	}
	
}
