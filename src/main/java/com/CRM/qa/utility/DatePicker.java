package com.CRM.qa.utility;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DatePicker extends BaseClass
{

    static WebElement month_ele = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
    static WebElement year_ele = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
    static List<WebElement> elements = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//a"));
    static WebElement hour_ele = driver.findElement(By.xpath("//dd[@class='ui_tpicker_hour']//select"));
    static WebElement minute_ele =   driver.findElement(By.xpath("//dd[@class='ui_tpicker_minute']//select"));
    //static WebElement doneBtn =  driver.findElement(By.xpath("//div[@class='ui-datepicker-buttonpane ui-widget-content']//button[2]"));


    public static void easyDatePicker(WebElement elm_hour, WebElement elm_min,String time)
    {

        String[] t_split = time.split("-");

        String hour = t_split[0];
        String minute = t_split[1];

        /*String[] split = date.split("-");
        String date1 = split[0];
        String month = split[1];
        String year = split[2];




        Select select = new Select(month_ele);
        select.selectByVisibleText(month);

        SelectOptions.SelectFromDirectPopUp(year_ele, year);


        for(WebElement element:elements)
        {
            if (element.getText().equals(date))
            {
                System.out.println(element.getText());
                element.click();
                System.out.println("clicked");
                break;
            }
        }*/


        SelectOptions.SelectFromDirectPopUp(elm_hour, hour);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SelectOptions.SelectFromDirectPopUp(elm_min, minute);
        //SelectOptions.SelectFromDirectPopUp(driver.findElement(By.xpath("//dd[@class='ui_tpicker_timezone_name']//select")), timezone1);
        //doneBtn.click();
    }






}
