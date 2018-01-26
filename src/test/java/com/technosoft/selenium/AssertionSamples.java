package com.technosoft.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

//
public class AssertionSamples extends DriverWrapper {



    //By Id, This is for https://www.samsung.com/us/ to open page from link_name:SHOP GALAXY S8.
    @Test
    public void findElementUsingId() {
        getDriver().findElement(By.id("homepage_FBfullBleedImg _SHOP GALAXY S8")).click();
    }

    //By name.  This is for https://www.samsung.com/us/ to open page from link_name:SHOP GALAXY S8.
    @Test
    public void findElemenUsingName() {
        getDriver().findElement(By.name("SHOP GALAXY S8")).click();
    }

    //By css.  This is for http://www.larchmontlibrary.org/ to activate search a book
    @Test
    public void findElemenbyCSS() {
        getDriver().findElement(By.cssSelector("#searchButton")).click();
    }

    //By linktext.  This is for https://www.westlibs.org/client/en_US/wls_catalog/ to find pin for account
    @Test
    public void findElemenbyLinkText() throws InterruptedException {
        getDriver().findElement(By.linkText("Forgot your PIN?")).click();
    }

    //By partiallinktext.  This is for https://www.westlibs.org/client/en_US/wls_catalog/ to find pin for account
    @Test
    public void findElemenbyPartialText() {
        getDriver().findElement(By.partialLinkText("Forgot your")).click();
    }

    //By xpath.  This is for https://www.samsung.com/us/computing/windows-laptops/ to open Notebook 5 pages
    @Test
    public void findElemenbyXPath() {
        getDriver().findElement(By.xpath("//*[@id=\"inner-wrap\"]/div[3]/div[1]/section[5]/div[3]/div/div[2]/div[3]/a")).click();
    }

    //By class.  This is for https://www.samsung.com/us/computing/windows-laptops/ for New Yorker Sign In page
    @Test
    public void findElemenbyClass() {
        getDriver().findElement(By.className("nyr-blue-button")).click();
    }

    //By tagname.  This is for http://www.larchmontlibrary.org/ to fine a book
    public void findElemenUsingTagName() {
        getDriver().findElement(By.tagName("q")).sendKeys("The Grapes of Wrath");
        }

    //By xpath.  This is for http://www.google.com for the rotating CTA with descendant
    public void findElemenxPathWithDescendant() {
        getDriver().findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/descendant::input[5]")).click();
    }

    //By list.  This is to check a box for a filter for https://www.samsung.com/us/computing/windows-laptops/all-windows-laptops/s/notebook_5/_/n-10+11+hv22t+zq2kh/
    public void findElemenByList()throws InterruptedException {
        List<WebElement> listOfLinks = getDriver().findElements(By.className("fa-btn-checkbox CheckBoxItem-checkbox-420037447"));
        for(WebElement element : listOfLinks) {
            if (element.getText().equals("500 GB (HDD) + 256 GB (SSD)"));
            element.click();
            break;
        }




    }




}


