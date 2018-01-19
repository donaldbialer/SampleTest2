package com.technosoft.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SampleTestScenario {

    public static void main(String[] args) {
        //Set chromedrive
        System.setProperty("webdriver.chrome.driver", "/Users/donaldbialer/BrowserDrivers/chromedriver0");

        //Initialize webdriver interface
        WebDriver driver = new ChromeDriver();

        String url = "https://www.facebook.com/";

        //Goto Url www.facebook.com
        driver.navigate().to(url);

        //Get current url
        String currentURL = driver.getCurrentUrl();

        //Set expected URL
        //String expectedUrl = url;

        //Verify if url is correct
        Assert.assertEquals(currentURL,"www.yahoo.com","Invalid URL");

        //quit the selenium driver
        driver.quit();



    }
}

