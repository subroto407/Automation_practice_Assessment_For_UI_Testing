package com.test.automationexercise.testCases;

import com.test.automationexercise.Utilites.UserData;
import com.test.automationexercise.configuaration.BaseClass;
import com.test.automationexercise.landingPage.LandingPage;
import com.test.automationexercise.pages.cartPage.AddToCartPage;
import com.test.automationexercise.pages.placeOrder_RegisterWhileCheckout.CartPage;
import com.test.automationexercise.pages.registerUserPage.EnterAccountInformationPage;
import com.test.automationexercise.pages.registerUserPage.SignUpLoginPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderPlaceValidation extends BaseClass {

    @Test
    public void orderPlaceValidation(){

        LandingPage lp = new LandingPage(driver);
        CartPage cp = new CartPage(driver);
        SignUpLoginPage slp = new SignUpLoginPage(driver);
        EnterAccountInformationPage eaip = new EnterAccountInformationPage(driver);
        AddToCartPage atc = new AddToCartPage(driver);

        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given " + baseLink);
        Assert.assertEquals(baseLink, UserData.BASE_URL);
        System.out.println("Home URL is visible");
        sleepTime(1000);

        // Add products to cart
        lp.getClickOnProductButton().click();
        Actions actionOne = new Actions(driver);
        actionOne.moveToElement(atc.getHoverOnFirstProduct()).build().perform();
        sleepTime(500);
        atc.getClickOnAddToCartButton1().click();
        sleepTime(500);
        atc.getClickViewCartButton().click();
        sleepTime(500);

        // Click 'Cart' button
        lp.getClickOnCartButton().click();
        sleepTime(1000);

        // Verify that cart page is displayed
        String cartPage = driver.getCurrentUrl();
        System.out.println("Given " + cartPage);
        Assert.assertEquals(cartPage, UserData.CART_PAGE);
        System.out.println("Home URL is visible");
        sleepTime(1000);

        // Click Proceed To Checkout
        cp.getProceedToCheckOutButton().click();
        sleepTime(1000);

        // Click 'Register / Login' button
        cp.getClickCheckoutLoginButton().click();
        sleepTime(1000);

        // Fill all details in Signup and create account
        slp.getInputName().sendKeys(UserData.INPUT_NAME);
        slp.getInputEmailAddress().sendKeys(UserData.INPUT_EMAIL);
        eaip.getTitleCheckBox1().click();
        eaip.getInputPassword().sendKeys(UserData.INPUT_PASSWORD);
        eaip.getSelectDay().click();
        eaip.getSelectMonth().click();
        eaip.getSelectYear().click();
        eaip.getSelectNewsLetterCheckBox().click();
        eaip.getSelectSpecialOfferCheckBox().click();
        eaip.getFirstName().sendKeys(UserData.FIRST_NAME);
        eaip.getLastName().sendKeys(UserData.LAST_NAME);
        eaip.getInputCompany().sendKeys(UserData.COMPANY_NAME);
        eaip.getInputAddress1().sendKeys(UserData.ADDRESS1);
        eaip.getInputAddress2().sendKeys(UserData.ADDRESS2);
        eaip.getSelectCountry().click();
        eaip.getInputState().sendKeys(UserData.STATE);
        eaip.getInputCity().sendKeys(UserData.CITY);
        eaip.getInputZipCode().sendKeys(UserData.ZIP_CODE);
        eaip.getInputMobileNumber().sendKeys(UserData.MOBILE_NUMBER);
        eaip.getClickOnCreateAccountButton().click();




    }
}
