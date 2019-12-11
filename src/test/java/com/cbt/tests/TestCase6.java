package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase6 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/");
        StringUtility.wait(1);
        driver.findElement(By.linkText("Registration Form")).click();
        StringUtility.wait(1);
        driver.findElement(By.cssSelector("[placeholder='username']")).sendKeys("user");
        StringUtility.wait(2);
        String message = driver.findElement(By.xpath("//small[text()='The username must be more than 6 and less " +
                "than 30 characters long']")).getText();

        String expectedMessage = "The username must be more than 6 and less than 30 characters long";

        StringUtility.verifyEquals( expectedMessage, message);

        driver.quit();

    }

}
