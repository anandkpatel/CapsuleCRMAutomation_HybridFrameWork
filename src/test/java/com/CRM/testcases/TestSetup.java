package com.CRM.testcases;

import com.CRM.qa.reports.ExtentReport;
import com.CRM.qa.testbase.BaseClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;


public class TestSetup extends BaseClass {

	//Initializes browser and reports
	@BeforeSuite
	public void beforeSuite() 
	{
		ExtentReport.initialize();
	}
  
	@BeforeTest
	public void beforeTest() throws MalformedURLException {
		browserInitialization();
	}
  
	
	//closed browser and report object
	@AfterTest
	public void afterTest()
	{
		BaseClass.close();
	}
	
	@AfterSuite
	public void afterSuite() 
	{
		ExtentReport.report.flush();
		ExtentReport.report.close();
	}
  
}
