package com.CRM.qa.utility;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;

public class JavaScriptUtils extends BaseClass {


    public static void Toclick(WebElement element)
    {
        //Wait.elementToBeClickble(element);
        Sleep.sleepWithTime(1500);
        js.executeScript("arguments[0].click();", element);
    }

    public static void scrollByPixl() {
        js.executeScript("window.scrollBy(0,1000)");

    }

    public static void scrollIntoView(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();",element );

    }







}
