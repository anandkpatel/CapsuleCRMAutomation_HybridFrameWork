package com.CRM.testcases;

import com.CRM.qa.pages.CasePage;
import com.CRM.qa.pages.LoginPage;
import com.CRM.qa.pages.PartiesPage;
import com.CRM.qa.pages.UserPage;
import com.CRM.qa.reports.LogStatus;
import com.CRM.qa.testbase.BaseClass;
import com.CRM.qa.utility.XlUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class PartiesPageTest extends BaseClass {
	
	@BeforeClass
	public void setup()
	{	loginpage = new LoginPage();
		partiespage = new PartiesPage();
		userpage = new UserPage();
		casepage = new CasePage();
		loginpage.login();
		LogStatus.pass("Logging Succesfully");
	}
	
	
	// Test case for New User Creation
	@Test(priority = 1,  dataProvider= "create_user", enabled = true)
	public void verifying_new_user_creation(String title1, String first_name, String last_name, String job_title, String Organization, String tag,String ph_no, String e_id )
	{
		partiespage.new_user(title1, first_name, last_name, job_title, Organization, tag, ph_no, e_id);
		String actual_title = userpage.userPage_title();
		String expected_title = "Prof" + " " + first_name + " " + last_name ;
		System.out.println("expected title" + expected_title);
		Assert.assertEquals(actual_title, expected_title);
		LogStatus.pass("User created Succesfully with name" + first_name +" " + last_name);
	}
	
	
	// Test case to verify new CASE creation
	@Test(priority = 2, enabled = true)
	public void verifying_new_case_creation()
	{
		userpage.clickOnCaseBtn();
		String actual_casename = casepage.newCase();
		String expected_casename = "test car lost";
		Assert.assertEquals(actual_casename, expected_casename);
		LogStatus.pass("Case created with name --> test car lost" );
	}
	
	
	// Test case to verify new case is created for particular user
	@Test(priority = 3, enabled = true)
	public void verifying_case_creation_for_user()
	{
		String actual_case_created_for = casepage.caseCreatedFor();
		String expected_case_created_for = "Tom eric";
		Assert.assertEquals(actual_case_created_for, expected_case_created_for);
		LogStatus.pass("Verified that Case created Succesfully for Tom eric" );
	}
	
	
	// Test case to verify case status
	@Test(priority = 4, enabled = true)
	public void verifying_case_status()
	{
		String actual_case_status = casepage.caseStatusVerification();
		String expected_case_status = "Open";
		Assert.assertEquals(actual_case_status, expected_case_status);
		LogStatus.pass("Verified that Case status is Open" );
	}
	
	
	// Data provider to create new user
	@DataProvider(name = "create_user")
	public static Object [][] getUserData() throws Exception
	{
		String path = System.getProperty("user.dir") + "\\src\\main\\java\\com\\CRM\\qa\\testdata\\create_user.xlsx";
		Object[][] userData = XlUtils.getData(path, "data1");
		return userData;
	}
	
}
