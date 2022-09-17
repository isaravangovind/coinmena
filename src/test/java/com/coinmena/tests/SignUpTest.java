package com.coinmena.tests;

import com.coinmena.pages.HomePage;
import com.coinmena.pages.LoginPage;
import com.coinmena.pages.SignupPage;
import com.coinmena.support.Constants;
import com.coinmena.testbase.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    WebDriver driver;// = driverInit();
    SignupPage signupPage; // = new SignupPage(driver);
    HomePage homePage;//  = // new HomePage(driver);
    LoginPage loginPage; // = new LoginPage(driver);

    @AfterMethod
    public void quit() {
        System.out.println(Constants.TESTENDS.getConts());
        driver.quit();
    }

    @BeforeMethod
    public void launchBrowser() {
        driver = driverInit();
        signupPage = new SignupPage(driver);
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        System.out.println(Constants.TESTSTARTS.getConts());
        driver.get((String) prop.get("base.url"));
    }

    //  @Test
    public void Signup() {

        homePage.clickOn(homePage.signInLink);
        loginPage.enterText(loginPage.createAccount_EmailTexBox, "test90812@gmail.com")
                .clickOn(loginPage.createBtn);

        signupPage.clickOn(signupPage.genderSelectMr)
                .enterText(signupPage.firstNameTxtBox, "test")
                .enterText(signupPage.lastNameTxtBox, "john")
                .verifyAttributeText(signupPage.emailTextBox, "value", "test90812@gmail.com", "Email entered in Create Account in " +
                        "SignUp Page should match in SignUp Page")
                .enterText(signupPage.pwdTextBox, "check");

        signupPage.selectDOB("1", "3", "1990");
        signupPage.verifyText(signupPage.firstName, signupPage.firstName.getText(),
                "FirsName in Address Section should have Name as in Personal Information")
                .enterText(signupPage.addressLine1, "Test Address")
                .enterText(signupPage.city, "TestCity")
                .dropDownSelectByText(signupPage.stateDropdown, "Alaska")
                .enterText(signupPage.postCode, "00000")
                .enterText(signupPage.mobile, "1234567890")
//        .enterText(signupPage.addressAlias, "Alias Address")
                .clickOn(signupPage.registerBtn);

    }

    @Test
    public void signIn() {
        System.out.println("---> " + driver);
        homePage.clickOn(homePage.signInLink);
        loginPage.enterText(loginPage.signInEmailTextBox, "example12.mlo@gmai.com")
                .enterText(loginPage.signInPwdTextBox, "Test@123")
                .clickOn(loginPage.signUpBtn);


        homePage.enterText(homePage.search, "Printed Summer Dress");
        


    }
}
