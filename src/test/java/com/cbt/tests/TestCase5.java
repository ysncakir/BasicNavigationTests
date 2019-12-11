package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase5 {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/");
        StringUtility.wait(1);
        driver.findElement(By.linkText("Registration Form")).click();
        StringUtility.wait(1);
        driver.findElement(By.cssSelector("[placeholder='last name']")).sendKeys("123");
        StringUtility.wait(2);
        String message = driver.findElement(By.xpath("//small[text()='The last name can only consist of alphabetical letters and dash']")).getText();
        String expectedMessage = "The last name can only consist of alphabetical letters and dash";

        StringUtility.verifyEquals(expectedMessage, message);

        driver.quit();

    }

}
