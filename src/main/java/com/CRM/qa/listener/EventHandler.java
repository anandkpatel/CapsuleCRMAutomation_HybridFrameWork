package com.CRM.qa.listener;

import com.CRM.qa.reports.LogStatus;
import com.CRM.qa.utility.ScreenShotUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.IOException;

public class EventHandler implements WebDriverEventListener {
    public EventHandler() {

    }

    public void beforeAlertAccept(WebDriver driver) {
        // TODO Auto-generated method stub

    }


    public void afterAlertAccept(WebDriver driver) {
        // TODO Auto-generated method stub
        LogStatus.pass("Alert Accepted");

    }


    public void afterAlertDismiss(WebDriver driver) {
        // TODO Auto-generated method stub
        LogStatus.pass("Alert Dissmissed");

    }


    public void beforeAlertDismiss(WebDriver driver) {


    }


    public void beforeNavigateTo(String url, WebDriver driver) {
        // TODO Auto-generated method stub

    }


    public void afterNavigateTo(String url, WebDriver driver) {
        // TODO Auto-generated method stub
        LogStatus.pass("Navigated to url: "+url);

    }


    public void beforeNavigateBack(WebDriver driver) {
        // TODO Auto-generated method stub

    }


    public void afterNavigateBack(WebDriver driver) {
        // TODO Auto-generated method stub
        LogStatus.pass("Navigated back to page: "+driver.getTitle());

    }


    public void beforeNavigateForward(WebDriver driver) {
        // TODO Auto-generated method stub

    }


    public void afterNavigateForward(WebDriver driver) {
        // TODO Auto-generated method stub
        LogStatus.pass("Navigated forward to page: "+driver.getTitle());

    }


    public void beforeNavigateRefresh(WebDriver driver) {
        // TODO Auto-generated method stub

    }


    public void afterNavigateRefresh(WebDriver driver) {
        // TODO Auto-generated method stub
        LogStatus.pass("page Refreshed: "+driver.getTitle());

    }


    public void beforeFindBy(By by, WebElement element, WebDriver driver) {
        // TODO Auto-generated method stub

    }


    public void afterFindBy(By by, WebElement element, WebDriver driver) {
        // TODO Auto-generated method stub
        if (element != null) {
            LogStatus.pass("Element found : "+element.toString());

        } else {
            LogStatus.pass("Element found : "+by.toString());

        }
    }


    public void beforeClickOn(WebElement element, WebDriver driver) {
        // TODO Auto-generated method stub

    }


    public void afterClickOn(WebElement element, WebDriver driver) {
        // TODO Auto-generated method stub
        LogStatus.pass("Clicked on element : "+element.toString());

    }


    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        // TODO Auto-generated method stub

    }


    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        // TODO Auto-generated method stub
       /* if(keysToSend!=null && keysToSend.length>0)
        {
            LogStatus.pass("Entered value : "+String.valueOf(keysToSend[0])+"+ into element "+element.toString());

        }*/

    }


    public void beforeScript(String script, WebDriver driver) {
        // TODO Auto-generated method stub

    }


    public void afterScript(String script, WebDriver driver) {
        // TODO Auto-generated method stub

    }


    public void beforeSwitchToWindow(String windowName, WebDriver driver) {
        // TODO Auto-generated method stub

    }


    public void afterSwitchToWindow(String windowName, WebDriver driver) {
        // TODO Auto-generated method stub
        //LogStatus.pass("Switched to new window with name: "+windowName);

    }


    public void onException(Throwable throwable, WebDriver driver) {
        LogStatus.error("Exception occured: " + throwable);
        try {
            ScreenShotUtils.takeScreenshotAtEndOfTest();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public <X> void beforeGetScreenshotAs(OutputType<X> target) {
        // TODO Auto-generated method stub

    }


    public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
        // TODO Auto-generated method stub

    }


    public void beforeGetText(WebElement element, WebDriver driver) {
        // TODO Auto-generated method stub

    }


    public void afterGetText(WebElement element, WebDriver driver, String text) {
        // TODO Auto-generated method stub
        // LogStatus.pass("Text retrieved: "+text+" From element "+element.toString());

    }
}
