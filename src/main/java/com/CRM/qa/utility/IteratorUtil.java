package com.CRM.qa.utility;

import com.CRM.qa.testbase.BaseClass;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorUtil extends BaseClass
{

    static LinkedList<WebElement> myLinkedList;

    public static Boolean iterator_VarifyFromList(List<WebElement> elm1, String string)
    {
        Boolean flag = false;
        Iterator<WebElement> it = elm1.iterator();
        while (it.hasNext())
        {
            WebElement elm = it.next();
            String value = elm.getText();
            if (value.contains(string)) {
                System.out.println("element found with name -->" + value);
                flag = true;
                break;
            }

        }
        return flag;
    }

    public static Boolean iterator_VarifyFromListAndClick(List<WebElement> elm1, String string)
    {
        Boolean flag = false;
        Iterator<WebElement> it = elm1.iterator();
        while (it.hasNext())
        {
            WebElement elm = it.next();
            String value = elm.getText();
            if (value.contains(string)) {
                elm.click();
                System.out.println("element found with name -->" + value);
                flag = true;
                break;
            }

        }
        return flag;
    }

    public static Boolean iterator_VarifyStringFromListAndClick_Strict(List<WebElement> elm1, String string)
    {
        Boolean flag = false;
        Iterator<WebElement> it = elm1.iterator();
        while (it.hasNext())
        {
            WebElement elm = it.next();
            String value = elm.getText();
            if (value.equalsIgnoreCase(string)) {
                elm.click();
                System.out.println("element found with name -->" + value);
                flag = true;
                break;
            }

        }
        return flag;
    }

    // This Method will click on first element from the list
    public static void clickOnFirstElementFromList(List<WebElement> elm1)
    {

        myLinkedList = new LinkedList<WebElement>(elm1);
        //Iterator<WebElement> it = elm1.iterator();
        //Sleep.sleepWithTime(1000);
        //it.next().click();
        myLinkedList.getFirst().click();


       }

    // This Method will return first element from the list
    public static WebElement returnFirstElementFromList(List<WebElement> elm1)
    {

        /*Iterator<WebElement> it = elm1.iterator();
        Sleep.sleepWithTime(1000);
        return it.next();*/

        //Update
        myLinkedList = new LinkedList<WebElement>(elm1);
        return myLinkedList.getFirst();

       }

       // This method will iterate through all the web elements and click on the last elements ( specially used when we search from
      // drop down and it has multiple results --> then help to select last value from it )
    public static WebElement clickOnLastElementFromList(List<WebElement> elm1) {

        WebElement element;

        /*if (elm1.size() <= 1) {
            element = elm1.get(0);
            element.click();
            return element;
        } else {
            element = elm1.get(elm1.size() - 1);
            element.click();
            return element;
        }*/

        // Update
        myLinkedList = new LinkedList<WebElement>(elm1);
        myLinkedList.getLast().click();
        return myLinkedList.getLast();
    }

    public static WebElement getTheLastElementFromList(List<WebElement> elm1) {



        /*if (elm1.size() <= 1) {
            element = elm1.get(0);
            return element;
        } else {
            element = elm1.get(elm1.size() - 1);
            return element;
        }*/

        // Update
        myLinkedList = new LinkedList<WebElement>(elm1);
        return myLinkedList.getLast();
    }

    public static WebElement clickOnLastElementFromListOnly(List<WebElement> elm1) {

        WebElement element;
        element = elm1.get(elm1.size() - 1);
        JavaScriptUtils.Toclick(element);
        return element;

    }


    public static void clickOnLastElementFromListIterate(List<WebElement> elm1, String property[], List<WebElement> elm2)
    {
        WebElement element = null;
        boolean flag;
        int i = 0;
        int j= 0;
        int size = property.length;
        System.out.println(size);
        System.out.println(elm1.size());
        if(property[0].isEmpty())
        {
            IteratorUtil.clickOnLastElementFromList(elm2);
        }
        else {
            while (i <= elm1.size() - 1) {
                try {
                    element = elm1.get(elm1.size() - (i + 1));
                    flag = true;
                    element.clear();
                    element.sendKeys(property[i]);

                } catch (ElementNotInteractableException e) {
                    flag = false;
                    i++;
                }
                if (flag == true) {
                    while (j < size) {
                        element.clear();
                        element.sendKeys(property[j]);
                        Sleep.sleepWithTime(200);
                        if (!property[j].isEmpty()) {
                            IteratorUtil.clickOnLastElementFromList(elm2);
                            Sleep.sleepWithTime(200);
                        }
                        j++;
                    }
                    break;
                }

            }
        }


    }

    public static void clickOnLastElementFromListIterateReason(List<WebElement> elm1, String reason, List<WebElement> elm2)
    {
        WebElement element = null;
        boolean flag;
        int i = 0;
        int j= 0;

        System.out.println(elm1.size());

            while (i <= elm1.size() - 1) {
                try {
                    element = elm1.get(elm1.size() - (i + 1));
                    flag = true;
                    element.clear();
                    element.sendKeys(reason);

                } catch (ElementNotInteractableException e) {
                    flag = false;
                    i++;
                }
                if (flag == true) {
                    Sleep.sleepWithTime(2000);
                    IteratorUtil.clickOnLastElementFromList(elm2);
                    break;
                }

            }
        }




    //this method is used to enter value in text box (i.e. in after clicking on add modality it opens dd where we can search
    // modality )
    public static void clickOnLastElementFromListIterateSingle(List<WebElement> elm1, String property)
    {
        WebElement element = null;
        boolean flag;
        int i = 0;
        System.out.println("element size from clickOnLastElementFromListIterateSingle method --> " + elm1.size());

            while (i <= elm1.size() - 1) {
                try {
                    element = elm1.get(elm1.size() - (i + 1));
                    flag = true;
                    element.clear();
                    element.sendKeys(property);

                } catch (ElementNotInteractableException e) {
                    flag = false;
                    i++;
                }
                if (flag == true) {


                    break;
                }

            }
        }


    // Method to create first few elements from the list
    public static void selectFirstFewElements(List<WebElement> elm,  int how_many)
    {
        for(int i=0; i<=how_many; i++)
        {
            elm.get(i).click();
        }
    }


    // Method to click each element in the given list ( use for reports criteria selection)
      public static void iterateAndClickEachElement(List<WebElement> el) {
        Iterator<WebElement> it = el.iterator();
        while (it.hasNext()) {
            it.next().click();
        }

    }

}
