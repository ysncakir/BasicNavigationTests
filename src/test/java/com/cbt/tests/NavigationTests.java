package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class NavigationTests {

    public static void main(String[] args) {


        WebDriver chrome = BrowserFactory.getDriver("chrome");
        chrome.get("https://google.com");
        String Google = chrome.getCurrentUrl();

        chrome.navigate().to("https://etsy.com");
        String Etsy = chrome.getCurrentUrl();

        chrome.navigate().back();
        String googleORetsy = chrome.getCurrentUrl();

        StringUtility.verifyEquals(Google, googleORetsy);

        chrome.navigate().forward();
        String forward = chrome.getCurrentUrl();

        StringUtility.verifyEquals(Etsy, forward);

        chrome.quit();



        WebDriver firefox = BrowserFactory.getDriver("firefox");

        firefox.get("https://google.com");
        String fGoogle = firefox.getCurrentUrl();

        firefox.navigate().to("https://etsy.com");
        String FEtsy = firefox.getCurrentUrl();

        firefox.navigate().back();
        String GoogleORetsy = firefox.getCurrentUrl();

        StringUtility.verifyEquals(fGoogle, GoogleORetsy);

        firefox.navigate().forward();
        String fwd = firefox.getCurrentUrl();

        StringUtility.verifyEquals(FEtsy, fwd);

        firefox.quit();

        WebDriver safari = BrowserFactory.getDriver("safari");
        safari.get("https://google.com");
        String sGoogle = safari.getCurrentUrl();

        safari.navigate().to("https://etsy.com");
        String sEtsy = safari.getCurrentUrl();

        safari.navigate().back();
        String sGoogleOREtsy = safari.getCurrentUrl();

        StringUtility.verifyEquals(sGoogle, sGoogleOREtsy);

        safari.navigate().forward();
        String move = safari.getCurrentUrl();

        StringUtility.verifyEquals(sEtsy,move);

        safari.quit();





    }
}
