# CapsuleCRMAutomation_HybridFrameWork

Introduction
------------
This project is a sample project for functional and UI tests wrote Selenium WebDriver and Java.

This project was written using IntelliJ IDEA Community Edition.   


Project Packages
-----
* PageObjects:  
Contains class files for each web page being tested.  Page element definitions / mappings, and functions for interacting with page elements.
 
* SeleniumExtensions:  
Contains helper function to instantiate WebDriver to the appropriate browser type.  WebDriverExtensions class contains helper functions to handle driver waits for page elements conditions. 

* TestHelper:  
    - ConfigSettings: contains helper functions for reading config.properties.  
    - IoLibrary: contains helper functions used across tests.  
    - LoggingLibrary: contains custom functions for comparing actual to expected conditions.  
    - TestAssert: Is a custom assert, used to track if a verification point has failed.  The class variable is latched, once set to false it will remain false for the remainder of the test run. 


Maven Java Project / Maven Wrapper
-----
This project is written in Java and tests can be executed using Maven commands. 

    ./mvn clean install

Page Object Model
-----
Page object model is used in this framework.  Each web page will have its own java.class and within each class contains page element mappings and functions / methods used to interact /verify a specific web page under test.  


Test web page
-----
    https://capsulecrm.com/    

 
 
Selenium WebDriver
------------
This project is configured to use Firefox & Chrome WebDriver's.  The default is set to Chrome.  The WebDriver's added to this project will only work on macos. 
