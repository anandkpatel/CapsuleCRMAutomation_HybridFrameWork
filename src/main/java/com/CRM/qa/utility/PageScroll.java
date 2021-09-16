package com.CRM.qa.utility;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class PageScroll extends BaseClass {

    //Scrolls till the bottom of page
    public static void toBottomOfPage() {
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    //Scrolls to top of page
    public static void toUP() {

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(document.body.scrollHeight,0);");

    }

    //Scrolls till element view
    public static void toElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    //Scrolls to horizontally
    public static void toHorizontal() {

        ((JavascriptExecutor) driver).executeScript("window.scrollBy(5000,0)", "");

    }


}
