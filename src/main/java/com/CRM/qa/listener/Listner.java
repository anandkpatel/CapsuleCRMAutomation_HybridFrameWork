package com.CRM.qa.listener;

import com.relevantcodes.extentreports.LogStatus;
import com.CRM.qa.reports.ExtentReport;
import com.CRM.qa.testbase.BaseClass;
import com.CRM.qa.utility.ScreenShotUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listner extends BaseClass implements ITestListener {


    public void onFinish(ITestContext result) {
        System.out.println(("Presagia Sports Automation Test Suite is ending!"));
        ExtentReport.report.endTest(ExtentReport.logger);
    }


    public void onStart(ITestContext result) {
        System.out.println("Presagia Sports Automation Test Suite started!");
        ExtentReport.logger = ExtentReport.report.startTest(result.getName());
    }


    public void onTestFailedButWithinSupsessPercentage(ITestResult result) {
        // TODO Auto-generated method stub
        ExtentReport.logger = ExtentReport.report.startTest(result.getName());
    }


    public void onTestFailure(ITestResult result) {
        System.out.println((result.getMethod().getMethodName() + " Test Case failed!"));
        System.out.println(result.getThrowable());
        com.CRM.qa.reports.LogStatus.fail(result.getName() + " Test case failed");
        ExtentReport.logger.log(LogStatus.FAIL, "Test case Failed because of --> " + result.getThrowable());
        String path = "";
        try {
            path = ScreenShotUtils.getScreenshot(driver, result.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        ExtentReport.logger.log(LogStatus.FAIL, ExtentReport.logger.addScreenCapture(path));
        com.CRM.qa.reports.LogStatus.fail(result.getName() + " Test Case failed");

    }


    public void onTestSkipped(ITestResult result) {
        System.out.println((result.getMethod().getMethodName() + " Test Case skipped!"));

        String path1 = "";
        try {
            path1 = ScreenShotUtils.getScreenshot(driver, result.getMethod().getMethodName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        ExtentReport.logger.log(LogStatus.ERROR, ExtentReport.logger.addScreenCapture(path1));
        com.CRM.qa.reports.LogStatus.skip(result.getName() + " Test case Skiped");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }


    public void onTestStart(ITestResult result) {
        System.out.println((result.getMethod().getMethodName() + " Test Case started!"));
        com.CRM.qa.reports.LogStatus.info("Test Case method " + result.getMethod().getMethodName() + " started");
    }


    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println((iTestResult.getMethod().getMethodName() + " Test Case passed!"));
        com.CRM.qa.reports.LogStatus.pass(iTestResult.getName() + " Test Case successfully Passed");


    }


    public void onTestSupsess(ITestResult result) {
        System.out.println((result.getMethod().getMethodName() + " Test Case passed!"));
        com.CRM.qa.reports.LogStatus.pass(result.getName() + " Test Case successfully Passed");
        com.CRM.qa.reports.LogStatus.info(result.getName() + " Test Case successfully Passed");
    }
}
