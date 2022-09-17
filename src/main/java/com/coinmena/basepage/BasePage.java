package com.coinmena.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);


    }


    public BasePage clickOn(WebElement element){
        element.click();
        return BasePage.this;
    }

    public BasePage enterText(WebElement element, String text) {
        element.sendKeys(text);
        return BasePage.this;
    }

    public BasePage verifyText(WebElement element, String text, String message) {
        element.getText();
        Assert.assertEquals(element.getText(), text, message);
        return BasePage.this;
    }

    public BasePage verifyAttributeText(WebElement element, String attrib, String verifyText, String message) {

        Assert.assertEquals(element.getAttribute(attrib), verifyText, message);
        return BasePage.this;
    }

    public BasePage dropDownSelectByValue(WebElement element, String value){
        Select dropDown = new Select(element);
        dropDown.selectByValue(value);
        return BasePage.this;

    }

    public BasePage dropDownSelectByText(WebElement element, String text){

        Select dropDown = new Select(element);
//        element.click();
        dropDown.selectByVisibleText(text);
        return BasePage.this;

    }
}
