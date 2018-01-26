package com.technosoft.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;

/**
 * Created by Mujab on 1/17/18.
 */
public class BasePage {

    public void clickOn(By locator) {
        DriverWrapper.getDriver().findElement(locator).click();
    }

    public void setValueToInputField(String value, By locator) {
        try {
            DriverWrapper.getDriver().findElement(locator).sendKeys(value);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Screenshot taken");
            Assert.fail("Element is not found with this locator " + locator.toString());
        }

//        public void verifyRadioButton(By locator) {
//            DriverWrapper.getDriver().findElement(locator).click();
//        }


    }

    public String getTextFromElement(By locator) {

        return DriverWrapper.getDriver().findElement(locator).getText();
    }

    //isSelected command
    public void getIsSelected(By locator) {
        DriverWrapper.getDriver().findElement(locator).isSelected();
    }

    //isEnabled command
    public void getIsEnabled(By locator) {
        DriverWrapper.getDriver().findElement(locator).isEnabled();
    }


    //isDisplayed command
    public void getIsDisplayed(By locator) {
        DriverWrapper.getDriver().findElement(locator).isDisplayed();
    }
}

