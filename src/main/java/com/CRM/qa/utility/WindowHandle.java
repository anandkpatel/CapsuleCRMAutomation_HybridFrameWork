package com.CRM.qa.utility;

import com.CRM.qa.testbase.BaseClass;

import java.util.Iterator;
import java.util.Set;

public class WindowHandle extends BaseClass
{

    static String currentWindow;
    static String nextWindow;

    static String currentWindow1;
    static String nextWindow1;
    static String nextWindow2;

    public static void switchToNewWindow()
    {
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();
        currentWindow = it.next();
        nextWindow = it.next();
        driver.switchTo().window(nextWindow);
        System.out.println(driver.getTitle());

    }

    public static void switchTo3rdWindow()
    {
        Set<String> windowHandles = driver.getWindowHandles();
        Iterator<String> it = windowHandles.iterator();
        currentWindow = it.next();
        nextWindow1 = it.next();
        nextWindow2 = it.next();

        driver.switchTo().window(nextWindow2);
        System.out.println(driver.getTitle());

    }

    public static void switchBack2ndWindow()
    {
        driver.switchTo().window(nextWindow1);
    }

    public static void switchBackCurrentWindow()
    {
        driver.switchTo().window(currentWindow);
    }



}
