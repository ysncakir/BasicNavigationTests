package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase4 {

    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/");
        StringUtility.wait(1);
        driver.findElement(By.linkText("Registration Form")).click();
        StringUtility.wait(1);
        driver.findElement(By.cssSelector("[placeholder='first name']")).sendKeys("123");
        StringUtility.wait(2);
        String message= driver.findElement(By.xpath("//small[text()='first name can only consist of alphabetical letters']")).getText();
        StringUtility.wait(2);
        String expectedMessage = "First name can only consist of alphabetical letters";

        StringUtility.verifyEquals(expectedMessage,message);
        driver.quit();
    }
}
