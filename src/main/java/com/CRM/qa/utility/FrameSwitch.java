package com.CRM.qa.utility;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.WebElement;

import java.util.Set;

public class FrameSwitch extends BaseClass {

    public static void switchToFrame(String frame1, String frame2) {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(frame1);
        driver.switchTo().frame(frame2);

    }

    public static void switchToFrame(String frame1, WebElement frame2) {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(frame1);
        driver.switchTo().frame(frame2);

    }

    public static void switchToFrameWithLoad(String frame1, String frame2) {
        driver.switchTo().defaultContent();
        Wait.frameToBeLoad(frame1, frame2);

    }

    public static void switchToFrameWithLoad3Frame(String frame1, String frame2, String frame3) {
        driver.switchTo().defaultContent();
        Wait.frameToBeLoad3Frame(frame1, frame2, frame3);

    }

    public static void switchToFrameWithLoad3FrameWithWebElem(String frame1, WebElement frame2, String frame3) {
        driver.switchTo().defaultContent();
        Wait.frameToBeLoad3FramewithWebElem(frame1, frame2, frame3);

    }


    public void navigateThroughMultipleIframes() {
        String parentWindow = driver.getWindowHandle();

        Set<String> handles = driver.getWindowHandles();
        for (String currentWindow : handles) {
            driver.switchTo().frame(currentWindow);
        }
    }

    public static void singleFrameSwitch(String frm)
    {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(frm);
        Sleep.sleepWithTime(500);
    }

    public static void singleFrameSwitch(WebElement frm)
    {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(frm);
        Sleep.sleepWithTime(500);
    }

}
