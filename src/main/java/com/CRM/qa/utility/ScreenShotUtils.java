package com.CRM.qa.utility;

import com.CRM.qa.testbase.BaseClass;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShotUtils extends BaseClass {
    // method to take screenshot and attached to extent report
    public static String getScreenshot(WebDriver driver, String screenshotName) {
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        TakesScreenshot ts = (TakesScreenshot) driver;
        String source = ts.getScreenshotAs(OutputType.BASE64);
        return "data:image/jpg;base64, " + source;
    }

    public static void takeScreenshotAtEndOfTest() throws IOException {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String currentDir = System.getProperty("user.dir");
        FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
    }
}









/* after execution, you could see a folder "FailedTestsScreenshots"
        // under ExtentReports folder
        String destination = "..\\FailedTestsScreenshots\\" + screenshotName + dateName
                + ".png";
        File finalDestination = new File("..\\FailedTestsScreenshots\\" + screenshotName + dateName
                + ".png");
        FileUtils.copyFile(source, finalDestination);
        return destination;*/