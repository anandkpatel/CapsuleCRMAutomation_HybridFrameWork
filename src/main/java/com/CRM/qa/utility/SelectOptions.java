package com.CRM.qa.utility;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectOptions extends BaseClass {

    public static void SelectFromPopUp(WebElement elm, String prop_name) {
        Select select = new Select(elm);
        select.selectByVisibleText(PropertyReader.getProp(prop_name));
    }

    public static void SelectFromDirectPopUp(WebElement elm, String prop_name) {
        Select select = new Select(elm);
        select.selectByVisibleText(prop_name);
    }

    public static void SelectFromPopUpByIndex(WebElement elm, int index) {
       // Wait.toBevisible(elm);
        Sleep.sleepWithTime(3000);
        Select select = new Select(elm);
        select.selectByIndex(index);
    }

    public static void SelectFromPopUpByValue(WebElement elm, String value) {
        Select select = new Select(elm);
        select.selectByValue(value);
    }

    public static String getTextFromSelectedOption(WebElement elm) {
        Select select = new Select(elm);
        return select.getFirstSelectedOption().getText();
    }

    public static void SelectAllOption(WebElement elm) {
        int i = 0;
        Select select = new Select(elm);
        while(i < 12){
            select.selectByIndex(i);
            i++;
        }
    }



}
