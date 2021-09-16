package com.CRM.qa.pages;

import com.CRM.qa.testbase.BaseClass;
import com.CRM.qa.utility.ImageUtils;
import com.CRM.qa.utility.PropertyReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class AppearancePage extends BaseClass {
	
	@FindBy(xpath = "//h1[@class= 'settings-page-header']")
	WebElement appearanceTitle;
	
	@FindBy(xpath = "//input[@type = 'file']")
	WebElement chooseFileBtn;
	
	@FindBy(xpath = "//a[@class = 'btn-primary singlesubmit']")
	WebElement saveBtn;
	
	@FindBy(xpath = "//img[contains(@src, 'capsule-pictures-prod')]")
	WebElement img;
	
	// Constructor to initialize Web elements
	public AppearancePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	// To get appearance page title
	public String appearancePageTitle()
	{
		return appearanceTitle.getText();
	}
	
	// Method to upload Logo
	public String uploadingLogo() 
	{
		chooseFileBtn.click();
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		StringSelection str = new StringSelection(PropertyReader.getProp("path"));
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	
		saveBtn.click();
		
		return ImageUtils.imageVerification(driver, img);
		
	}
	

}
