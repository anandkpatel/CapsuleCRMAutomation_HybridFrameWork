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
		driver.navigate().back();
	}

	
	// Test case to verify mail Drop Box page
	@Test(priority = 3, enabled= true)
	public void verifying_mailDropBox_page()
	{
		acctsettingpage.clickOnMailDropBox();
		String actual_title = mailbox.mailDropBoxTitle();
		String expected_title = "Mail Drop Box";
		Assert.assertEquals(actual_title, expected_title);
		driver.navigate().back();
	}

	// Test case to verify Track page
	@Test(priority = 4, enabled = true)
	public void verifying_Track_page()
	{
		acctsettingpage.clickOnTracksLink();
		String actual_title = trackpage.trackPageTitle();
		String expected_title = "Tracks";
		Assert.assertEquals(actual_title, expected_title);
		driver.navigate().back();
	}
	
	
	// Test case to verify Task Category page
	@Test(priority = 5, enabled = true)
	public void verifying_Task_Catagory_page()
	{
		acctsettingpage.clickOnTaskcatagoryLink();
		String actual_title = taskcatagorypage.taskCatagoryPageTitle();
		String expected_title = "Task Categories";
		Assert.assertEquals(actual_title, expected_title);
		driver.navigate().back();
	}
	
	
	// Test case to verify Custom Field page
	@Test(priority = 6, enabled = true)
	public void verifying_Custom_Field_page()
	{
		acctsettingpage.clickOnCustomFieldLink();
		String actual_title = customfieldpage.customFieldPageTitle();
		String expected_title = "Custom Fields";
		Assert.assertEquals(actual_title, expected_title);
		driver.navigate().back();
	}

	// Test case to verify Integration page
	@Test(priority = 7, enabled = true)
	public void verifying_Integration_page()
	{
		acctsettingpage.clickOnIntegrationlink();
		String actual_title = integrationpage.integrationPageTitle();
		String expected_title = "Integrations";
		Assert.assertEquals(actual_title, expected_title);
		System.out.println(integrationpage.configureButtons() + " number of configure buttons available in Integration Page");
		LogStatus.info(integrationpage.configureButtons() + " number of configure buttons available in Integration Page");
		driver.navigate().back();
	}

	// Test case to verify User page
	@Test(priority = 8, enabled= true)
	public void verifying_AcctSettingUser_page()
	{
		acctsettingpage.clickOnAccSetUser();
		String actual_title = userpageInaccSetting.AccountSettingUserPageTitle();
		String expected_title = "Users and Teams";
		Assert.assertEquals(actual_title, expected_title);

	}


	// Test case to verify User creation in user page
	@Test(priority = 9, dataProvider = "user_creation", enabled= false)
	public void verifying_UserCreation_InAccSettingUserpage(String fi_name, String la_name, String e_address, String user_name)
	{
		String actual_result = userpageInaccSetting.createNewUser(fi_name, la_name, e_address, user_name);
		String expected_result = "kartik Dave · k_artik45\n" + "din@yahoo.com";
		Assert.assertEquals(actual_result, expected_result);
		homepage.goToAccountSettingPage();
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
