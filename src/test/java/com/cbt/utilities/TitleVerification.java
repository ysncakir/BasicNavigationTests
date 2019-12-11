package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/", "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        WebDriver chrome = BrowserFactory.getDriver("chrome");

        chrome.navigate().to(urls.get(0));
        String title1 = chrome.getTitle();
        String url1 = chrome.getCurrentUrl();
        StringUtility.wait(2);


        chrome.navigate().to(urls.get(1));
        String title2 = chrome.getTitle();
        String url2 = chrome.getCurrentUrl();
        StringUtility.wait(2);

        chrome.navigate().to(urls.get(2));
        String title3 = chrome.getTitle();
        String url3 = chrome.getCurrentUrl();
        StringUtility.wait(2);

        if(title1.equals(title2) && title1.equals(title3)){
            System.out.println("All titles are same");

        } else{
            System.out.println("Titles are not same");
            System.out.print(title1 +" "+ title2+" "+ title3);
        }

        String start = "http://practice.cybertekschool.com/";

        boolean x = (url1.startsWith(start));
        boolean y = (url2.startsWith(start));
        boolean z = (url3.startsWith(start));
            System.out.println("URLs of all pages start with "+ start);

        chrome.quit();

        }



    }


