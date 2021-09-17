package com.CRM.qa.reports;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.CRM.qa.testbase.BaseClass;
import com.CRM.qa.utility.PropertyReader;

import java.io.File;

public class ExtentReport extends BaseClass {
    public static ExtentReports report = null;
    public static ExtentTest logger = null;

    //private constructor to limit initialization to one
    public ExtentReport() {

        report = new ExtentReports(".//ExtentReports//Test Report_" + currentdate + ".html");
        report.loadConfig(new File(".//src//main//resources//extentreport.xml"));
        report.addSystemInfo("Server", PropertyReader.getProp("server"));
        report.addSystemInfo("Browser", PropertyReader.getProp("browser"));

    }

    //Initializes Report
    public static void initialize() {
        ExtentReport report = new ExtentReport();

    }
}
