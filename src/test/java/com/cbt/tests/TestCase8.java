package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase8 {

    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/");
        StringUtility.wait(1);
        driver.findElement(By.linkText("Registration Form")).click();
        StringUtility.wait(1);
        driver.findElement(By.cssSelector("[placeholder='571-000-0000']")).sendKeys("5711234354");
        StringUtility.wait(2);
        String message =driver.findElement(By.xpath("//small[(text()='Phone format is not correct')]")).getText();
        String expectedMessage ="Phone format is not correct";

        StringUtility.verifyEquals(message, expectedMessage );

        

        driver.quit();
    }
}
