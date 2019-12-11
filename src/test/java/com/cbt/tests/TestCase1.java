package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        driver.findElement(By.xpath("//input[@name='full_name']")).sendKeys("username");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("1234@cybertek.com");
        driver.findElement(By.cssSelector("[name='wooden_spoon']")).click();

        String message = driver.findElement(By.cssSelector("[name='signup_message']")).getText();
        String expected = "Thank you for signing up. Click the button below to return to the home page.";

        StringUtility.verifyEquals(expected,message);



        driver.quit();

    }






}
