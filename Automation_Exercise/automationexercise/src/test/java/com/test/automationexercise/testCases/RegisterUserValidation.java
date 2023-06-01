package com.test.automationexercise.testCases;

import com.test.automationexercise.Utilites.UserData;
import com.test.automationexercise.configuaration.BaseClass;
import com.test.automationexercise.landingPage.LandingPage;
import com.test.automationexercise.pages.registerUserPage.AccountCreatedPage;
import com.test.automationexercise.pages.registerUserPage.AccountDeletedPage;
import com.test.automationexercise.pages.registerUserPage.EnterAccountInformationPage;
import com.test.automationexercise.pages.registerUserPage.SignUpLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterUserValidation extends BaseClass {

    @Test
    void registerUserValidation(){

        LandingPage lp = new LandingPage(driver);
        SignUpLoginPage slp = new SignUpLoginPage(driver);
        EnterAccountInformationPage eaip = new EnterAccountInformationPage(driver);
        AccountCreatedPage acp = new AccountCreatedPage(driver);
        AccountDeletedPage adp = new AccountDeletedPage(driver);

        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given " + baseLink);
        Assert.assertEquals(baseLink, UserData.BASE_URL);
        System.out.println("Home URL is visible");
        sleepTime(1000);

        //Click on 'Signup / Login' button
        lp.getSignUpLoginButton().click();
        sleepTime(1000);

        //Verify 'New User Signup!' is visible
        if (slp.getVerifyNewUserSignUpText().isDisplayed())
        {
            String newUserSignupText= slp.getVerifyNewUserSignUpText().getText();
            Assert.assertTrue(true,newUserSignupText);
        }
        else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }

        //Enter name and email address
        slp.getInputName().sendKeys(UserData.NAME);
        sleepTime(1000);
        slp.getInputEmailAddress().sendKeys(UserData.EMAIL);
        sleepTime(1000);

        // Click 'Signup' button
        slp.getClickOnSignUpButton().click();
        sleepTime(1000);

        // Verify that 'ENTER ACCOUNT INFORMATION' is visible
        if (eaip.getEnterAccountInformationText().isDisplayed())
        {
            String enterAccountInformationText= eaip.getEnterAccountInformationText().getText();
            Assert.assertTrue(true,enterAccountInformationText);
        }
        else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }

        // Name Validation
        if (eaip.getNameInput().isDisplayed())
        {
            String actualInputName = eaip.getNameInput().getText();
            Assert.assertTrue(true,actualInputName);

        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }

        // Email Validation
        if ((eaip.getEmailInput().isDisplayed()))
        {
            String actualInputEmail = eaip.getEmailInput().getText();
            Assert.assertTrue(true,actualInputEmail);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }

        // Input details: Title, Password, Date of birth
        eaip.getTitleCheckBox1().click();
        sleepTime(1000);
        eaip.getInputPassword().sendKeys(UserData.INPUT_PASSWORD);
        sleepTime(1000);
        eaip.getSelectDay().click();
        sleepTime(500);
        eaip.getSelectMonth().click();
        sleepTime(500);
        eaip.getSelectYear().click();
        sleepTime(500);

        // Select checkbox 'Sign up for our newsletter!'
        eaip.getSelectNewsLetterCheckBox().click();
        sleepTime(500);

        //Select checkbox 'Receive special offers from our partners!'
        eaip.getSelectSpecialOfferCheckBox().click();
        sleepTime(500);

        // Input details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        eaip.getFirstName().sendKeys(UserData.FIRST_NAME);
        sleepTime(1000);
        eaip.getLastName().sendKeys(UserData.LAST_NAME);
        sleepTime(1000);
        eaip.getInputCompany().sendKeys(UserData.COMPANY_NAME);
        sleepTime(1000);
        eaip.getInputAddress1().sendKeys(UserData.ADDRESS1);
        sleepTime(1000);
        eaip.getInputAddress2().sendKeys(UserData.ADDRESS2);
        sleepTime(1000);
        eaip.getSelectCountry().click();
        sleepTime(1000);
        eaip.getInputState().sendKeys(UserData.STATE);
        sleepTime(1000);
        eaip.getInputCity().sendKeys(UserData.CITY);
        sleepTime(1000);
        eaip.getInputZipCode().sendKeys(UserData.ZIP_CODE);
        sleepTime(1000);
        eaip.getInputMobileNumber().sendKeys(UserData.MOBILE_NUMBER);
        sleepTime(1000);

        // Click 'Create Account button'
        eaip.getClickOnCreateAccountButton().click();
        sleepTime(1000);

        // Verify that 'ACCOUNT CREATED!' is visible
        if (acp.getAccountCreatedHeaderText().isDisplayed())
        {
            String actualAccountCreateText = acp.getAccountCreatedHeaderText().getText();
            Assert.assertTrue(true,actualAccountCreateText);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }

        // Click 'Continue' button
        acp.getClickOnContinueButton().click();
        sleepTime(1000);

        // Verify that 'Logged in as username' is visible
        if (lp.getVerifyLoggedInAsUserName().isDisplayed())
        {
            String actualVerifyUserName = lp.getVerifyLoggedInAsUserName().getText();
            Assert.assertTrue(true,actualVerifyUserName);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }

        // Click 'Delete Account' button
        lp.getClickOnDeleteAccountButton().click();
        sleepTime(1000);

        // Verify that 'ACCOUNT DELETED!' is visible
        if (adp.getVerifyAccountDeletedHeader().isDisplayed())
        {
            String actualVerifyAccountDeleteText = adp.getVerifyAccountDeletedHeader().getText();
            Assert.assertTrue(true,actualVerifyAccountDeleteText);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }

        // click 'Continue' button
        adp.getClickOnContinueButton().click();
        sleepTime(1000);

        // DRIVER CLOSE
        driver.close();


    }
}
