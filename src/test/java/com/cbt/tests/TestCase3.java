package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.navigate().to("http://practice.cybertekschool.com/");
        StringUtility.wait(1);
        driver.findElement(By.linkText("Multiple Buttons")).click();
        StringUtility.wait(2);
        driver.findElement(By.cssSelector("[onclick='button1()']")).click();
        StringUtility.wait(1);



        String message = driver.findElement(By.cssSelector("[id='result']")).getText();
        String expected = "Clicked on button one!";

        StringUtility.verifyEquals(expected,message);

        driver.quit();
    }
}
