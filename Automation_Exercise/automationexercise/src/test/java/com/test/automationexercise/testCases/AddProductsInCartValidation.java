package com.test.automationexercise.testCases;

import com.test.automationexercise.Utilites.UserData;
import com.test.automationexercise.configuaration.BaseClass;
import com.test.automationexercise.landingPage.LandingPage;
import com.test.automationexercise.pages.cartPage.AddToCartPage;
import com.test.automationexercise.pages.cartPage.ShoppingCartPage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductsInCartValidation extends BaseClass {

    @Test
    public void addProductsInCartValidation(){

        LandingPage lp = new LandingPage(driver);
        AddToCartPage atc = new AddToCartPage(driver);
        ShoppingCartPage scp = new ShoppingCartPage(driver);

        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given " + baseLink);
        Assert.assertEquals(baseLink, UserData.BASE_URL);
        System.out.println("Home URL is visible");
        sleepTime(1000);

        // Click 'Products' button
        lp.getClickOnProductButton().click();
        sleepTime(1000);

        // Hover over first product and click 'Add to cart'
        Actions actionOne = new Actions(driver);
        actionOne.moveToElement(atc.getHoverOnFirstProduct()).build().perform();
        sleepTime(2000);
        atc.getClickOnAddToCartButton1().click();
        sleepTime(1000);

        //  Click 'Continue Shopping' button
        atc.getClickContinueButton().click();
        sleepTime(1000);

        // Hover over second product and click 'Add to cart'
        Actions actionTwo = new Actions(driver);
        actionTwo.moveToElement(atc.getHoverOnSecondProduct()).build().perform();
        sleepTime(1000);
        atc.getClickOnAddToCartButton2().click();
        sleepTime(1000);

        // Click 'View Cart' button
        atc.getClickViewCartButton().click();
        sleepTime(1000);

        // Verify first product are added to Cart and
        if (scp.getFirstCartProduct().isDisplayed())
        {
            String firstCart = scp.getFirstCartProduct().getText();
            Assert.assertTrue(true,firstCart);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(1000);

        //Verify prices, quantity and total price
        if (scp.getFirstProductPrice().isDisplayed())
        {
            String firstProductPrice = scp.getFirstProductPrice().getText();
            Assert.assertTrue(true,firstProductPrice);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(500);

        if (scp.getFirstProductQuantity().isDisplayed())
        {
            String firstProductQuantity = scp.getFirstProductQuantity().getText();
            Assert.assertTrue(true,firstProductQuantity);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(500);
        if (scp.getFirstProductCartTotal().isDisplayed())
        {
            String firstProductCartTotal = scp.getFirstProductCartTotal().getText();
            Assert.assertTrue(true,firstProductCartTotal);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(500);


        // Verify second product are added to Cart and
        if (scp.getSecondCartProduct().isDisplayed())
        {
            String secondCart = scp.getSecondCartProduct().getText();
            Assert.assertTrue(true,secondCart);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }

        // Verify prices, quantity and total price

        if (scp.getSecondProductPrice().isDisplayed())
        {
            String secondProductPrice = scp.getSecondProductPrice().getText();
            Assert.assertTrue(true,secondProductPrice);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(500);

        if (scp.getSecondProductQuantity().isDisplayed())
        {
            String secondProductQuantity = scp.getSecondProductQuantity().getText();
            Assert.assertTrue(true,secondProductQuantity);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(500);

        if (scp.getSecondProductCartTotal().isDisplayed())
        {
            String secondProductCartTotal = scp.getSecondProductCartTotal().getText();
            Assert.assertTrue(true,secondProductCartTotal);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }
        sleepTime(500);



    }
}
