package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TaskCatagoryPage extends BaseClass{
	
	@FindBy(xpath = "//h1[@class='sp-page__title']")
	WebElement taskcatagoryTitle;
	
	// Constructor to initialize Web elements
	public TaskCatagoryPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// To get task Category page title
	public String taskCatagoryPageTitle()
	{
		return taskcatagoryTitle.getText();
	}
	
	
}
