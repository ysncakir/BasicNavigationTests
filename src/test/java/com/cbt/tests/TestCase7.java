package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase7 {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/");
        StringUtility.wait(1);
        driver.findElement(By.linkText("Registration Form")).click();
        StringUtility.wait(1);
        driver.findElement(By.cssSelector("[placeholder='email@email.com']")).sendKeys("testers@email");
        StringUtility.wait(2);
        String str1 = driver.findElement(By.xpath("//small[text()='email address is not a valid']")).getText();
        String str2 = driver.findElement(By.xpath("//small[text()='Email format is not correct']")).getText();
        String message = str1 + "\n" + str2;
        String expectedMessage = "email address is not a valid" + "\n" +
                "Email format is not correct";

        StringUtility.verifyEquals(expectedMessage, message);

        driver.quit();
    }
}