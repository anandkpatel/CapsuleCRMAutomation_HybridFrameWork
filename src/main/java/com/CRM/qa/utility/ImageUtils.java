package com.CRM.qa.utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImageUtils {

    JavascriptExecutor js;

    public static String imageVerification(WebDriver driver, WebElement ImageFile) {
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent) {
            return "Image not displayed.";
        } else {
            return "Image displayed.";
        }

    }

}
