package com.test.automationexercise.testCases;

import com.test.automationexercise.Utilites.UserData;
import com.test.automationexercise.configuaration.BaseClass;
import com.test.automationexercise.landingPage.LandingPage;
import com.test.automationexercise.pages.SubscriptionPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubscriptionHomePageValidation extends BaseClass {

    @Test
    void subscriptionHomePageValidation(){

        SubscriptionPage sp = new SubscriptionPage(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;


        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given " + baseLink);
        Assert.assertEquals(baseLink, UserData.BASE_URL);
        System.out.println("Home URL is visible");
        sleepTime(1000);

        // Scroll down to footer
        //This will scroll the web page till end.
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        sleepTime(1000);

        // Verify text 'SUBSCRIPTION'
        if (sp.getSubscriptionHeader().isDisplayed())
        {
            String subscriptionHeader = sp.getSubscriptionHeader().getText();
            Assert.assertTrue(true,subscriptionHeader);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }

        // Enter email address in input
        sp.getInputSubscriptionEmail().sendKeys(UserData.INPUT_EMAIL);
        sleepTime(1000);

        // click arrow button
        sp.getClickArrowButton().click();
        sleepTime(1000);



    }
}
