package com.CRM.qa.utility;

import com.CRM.qa.testbase.BaseClass;
import org.jsoup.Connection;

import java.util.Random;

public class RandomNum extends BaseClass
{

    public static int randomNum(int min, int max) {

        Random rand = new Random();
        // nextInt as provided by Random is exclusive of the top value so you need to add 1
        int randomNum = rand.nextInt((max - min) + 1) + min;
        System.out.println("random no --> " + randomNum);
        return randomNum;

    }




}
