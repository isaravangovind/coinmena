package com.coinmena.pages;

import com.coinmena.basepage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    @FindBy(css="input#email_create")
    public WebElement createAccount_EmailTexBox;

    @FindBy(css="input#email")
    public WebElement signInEmailTextBox;

    @FindBy(css="input#passwd")
    public WebElement signInPwdTextBox;

    @FindBy(css="button#SubmitLogin")
    public WebElement signUpBtn;

    @FindBy(css="button#SubmitCreate")
    public WebElement createBtn;


    public LoginPage(WebDriver driver){

       super(driver);
        PageFactory.initElements(driver, this);

    }





}
