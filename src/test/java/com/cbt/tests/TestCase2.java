package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCase2 {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");

        List<WebElement> list = driver.findElements(By.cssSelector("[class ='list-group-item']"));
        int Size = list.size();
        int expected =48;
        if(Size==expected){
            System.out.println("PASS. There are "+ Size+ " links in the page.");
        } else{
            System.out.println("FAILED");
        }

        driver.quit();
        }



}
