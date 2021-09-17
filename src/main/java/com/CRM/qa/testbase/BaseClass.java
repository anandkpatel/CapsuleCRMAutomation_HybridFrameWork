package com.CRM.qa.testbase;

import com.CRM.qa.listener.EventHandler;
import com.CRM.qa.pages.*;
import com.CRM.qa.utility.CurrentDate;
import com.CRM.qa.utility.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    protected static WebDriver driver;
    protected static RemoteWebDriver driver1;
    protected static JavascriptExecutor js;
    protected static String currentdate = CurrentDate.currentDate();
    protected BaseClass baseclass;
    protected  SoftAssert softAssert;
    public static Actions myAction;

    //Pages
    protected LoginPage loginpage;
    protected PartiesPage partiespage;
    protected UserPage userpage;
    protected CasePage casepage;
    protected HomePage homepage;
    protected AccountSettingPage acctsettingpage;
    protected AccountPage accountpage;
    protected InvoicePage invoicepage;
    protected ExportPage exportpage ;
    protected AppearancePage appearancepage;
    protected MailDropBoxPage mailbox;
    protected AccSettingUserPage userpageInaccSetting;
    protected OppurtunityPage oppurtunitypage;
    protected TrackPage trackpage;
    protected TaskCatagoryPage taskcatagorypage;
    protected CustomFieldPage customfieldpage;
    protected TagPage tagpage;
    protected IntegrationPage integrationpage;
    protected TrashPage trashpage;





    static File folder;




    public static void browserInitialization() throws MalformedURLException {

        String browser = PropertyReader.getProp("browser");
        String url = PropertyReader.getProp("url");
        String grid = PropertyReader.getProp("grid");
        String gridUrl = PropertyReader.getProp("grid_url");
        if (browser.equalsIgnoreCase("chrome")) {

            if (grid.equalsIgnoreCase("yes")) {
                DesiredCapabilities cap = DesiredCapabilities.chrome();
                ChromeOptions options = new ChromeOptions();
                options.merge(cap);
                driver = new RemoteWebDriver(new URL(gridUrl), cap);
            } else {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }
        } else if (browser.equalsIgnoreCase("firefox")) {
            if (grid.equalsIgnoreCase("yes")) {
                DesiredCapabilities cap = new DesiredCapabilities();
                cap.setPlatform(Platform.LINUX);
                cap.setBrowserName("firefox");
                FirefoxOptions options = new FirefoxOptions();
                options.merge(cap);
                driver = new RemoteWebDriver(new URL(gridUrl), options);
            } else {
                System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\main\\resources\\geckodriver.exe");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }


        }
        js = (JavascriptExecutor)driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //eventHandlerInit();
        driver.get(url);
        driver.manage().deleteAllCookies();

    }


    // This Method Close all instances created by WebDriver
    public static void close() {
        driver.quit();

    }

    //initializes WebDriver EventListner
    private static void eventHandlerInit() {
        EventFiringWebDriver eventHandle = new EventFiringWebDriver(driver);
        EventHandler handler = new EventHandler();
        eventHandle.register(handler);
        driver = eventHandle;
    }

}
