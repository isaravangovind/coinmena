package com.coinmena.pages;

import com.coinmena.basepage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {


    @FindBy(css="a.login")
    public  WebElement signInLink;


    @FindBy(css="input.search_query")
    public WebElement search;

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);

    }







}
