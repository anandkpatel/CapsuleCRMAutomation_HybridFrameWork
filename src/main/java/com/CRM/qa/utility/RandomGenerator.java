package com.CRM.qa.utility;

import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class RandomGenerator {

    static Random random = new Random();

    public static WebElement randomElmSelect(List<WebElement> elm) {

        int randomIndex = random.nextInt(elm.size());
        WebElement element = elm.get(randomIndex);
        return element;
    }
}
