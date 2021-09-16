package com.CRM.qa.utility;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Wait extends BaseClass {

    // This method is use to give wait to driver untill specific elements is visible
    public static void untilVisibilityOfElement(WebElement elm)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(elm));

    }

    // This method is use give wait to driver untill there are certain number of windows open in browser
    public static void untilNumberOfWindows(int number)
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

    }

    public static void elementToBeClickble(WebElement elm)
    {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(elm));



    }

















    //waits for element to be clickable
    public static void toBeclickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
        //wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void fluentwait() {
        FluentWait wait = new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(StaleElementReferenceException.class);
    }

    public static void toBevisible(WebElement element) {

        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.visibilityOf(element));

    }

    public static void frameToBeLoad(String frame1, String frame2)
    {
        WebDriverWait wait = new WebDriverWait(driver, 180);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame2));
    }

    public static void frameToBeLoad3Frame(String frame1, String frame2, String frame3)
    {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame2));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame3));
    }

    public static void frameToBeLoad3FramewithWebElem(String frame1, WebElement frame2, String frame3)
    {
        WebDriverWait wait = new WebDriverWait(driver, 120);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame2));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame3));
    }

    //waits for proper data to be populated
    public static void toBeclickable2(WebElement element, String data) {
        while (!element.getAttribute("innerText").toLowerCase().contains(data.toLowerCase())) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }
}
