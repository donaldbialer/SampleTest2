package com.technosoft.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.openqa.selenium.safari.SafariDriver;

public class SampleTestScenario {

    public static void main(String[] args) {
        //Set chromedrive
        //System.setProperty("webdriver.chrome.driver", "/Users/donaldbialer/BrowserDrivers/chromedriver0");
        System.setProperty("webdriver.gecko.driver", "/Users/donaldbialer/BrowserDrivers/geckodriver");

        //Initialize webdriver interface
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new SafariDriver();

        String url = "https://www.facebook.com/";
        //Goto Url www.facebook.com
        driver.navigate().to(url);
        //Get current url
        String currentURL = driver.getCurrentUrl();
        //Verify if url is correct
        Assert.assertEquals(currentURL,"https://www.facebook.com/","Invalid URL");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up7";
        Assert.assertEquals(actualTitle,expectedTitle,"Titles do not match");

        //quit the selenium driver
        driver.quit();



    }
}

