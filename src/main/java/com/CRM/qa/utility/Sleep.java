package com.CRM.qa.utility;

import com.CRM.qa.testbase.BaseClass;

public class Sleep extends BaseClass
{

    public static void sleepThread()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void sleepWithTime(long time)
    {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
