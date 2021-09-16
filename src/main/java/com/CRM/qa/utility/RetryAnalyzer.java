package com.CRM.qa.utility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int count = 0;

    private int maxCount = 1;

    @Override

    public boolean retry(ITestResult result) {

        if(count < maxCount) {

            count++;

            return true;

        }

        return false;

    }


}

// to run write this in test() -- >  retryAnalyzer = RetryAnalyzer.class
