package com.CRM.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    static Properties prop;
    static String value;

    public static String getProp(String propName) {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//config.properties");
            prop.load(fis);
            value = prop.getProperty(propName);


        } catch (Exception e) {
            e.printStackTrace();
        }

        return value;

    }
}


