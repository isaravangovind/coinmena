package com.coinmena.pages;


import com.coinmena.basepage.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends BasePage {


    @FindBy(css = "input#id_gender1")
    public WebElement genderSelectMr;

    @FindBy(id = "id_gender2")
    public WebElement genderSelectMrs;

    @FindBy(css = "input#customer_firstname")
    public WebElement firstNameTxtBox;

    @FindBy(css = "input#customer_lastname")
    public WebElement lastNameTxtBox;

    @FindBy(css = "input#email")
    public WebElement emailTextBox;

    @FindBy(css = "input#passwd")
    public WebElement pwdTextBox;

    @FindBy(css = "select#days")
    public WebElement dobDay;

    @FindBy(css = "select#months")
    public WebElement dobMon;

    @FindBy(css = "select#years")
    public WebElement dobYear;


    @FindBy(css = "input#firstname")
    public WebElement firstName;

    @FindBy(css = "input#lastname")
    public WebElement lastName;

    @FindBy(css = "input#address1")
    public WebElement addressLine1;

    @FindBy(css = "input#city")
    public WebElement city;

    @FindBy(css = "select#id_state")
    public WebElement stateDropdown;



    @FindBy(css = "input#postcode")
    public WebElement postCode;

    @FindBy(css = "input#phone_mobile")
    public WebElement mobile;

    @FindBy(css = "input#alias")
    public WebElement addressAlias;


    @FindBy(css = "button#submitAccount")
    public WebElement registerBtn;



    public SignupPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public BasePage selectDOB(String day, String month, String year){

        dropDownSelectByValue(dobDay, day);
        dropDownSelectByValue(dobMon, month);
        dropDownSelectByValue(dobYear, year);

        return SignupPage.this;
    }


}
