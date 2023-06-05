package com.test.automationexercise.testCases;

import com.test.automationexercise.Utilites.FunctionUtils;
import com.test.automationexercise.Utilites.UserData;
import com.test.automationexercise.configuaration.BaseClass;
import com.test.automationexercise.landingPage.LandingPage;
import com.test.automationexercise.pages.contactUsFormPage.ContactUsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsFormValidation extends BaseClass {

    @Test
    public void contactUsFormValidation(){

        LandingPage lp = new LandingPage(driver);
        ContactUsPage cup = new ContactUsPage(driver);

        //HOME URL Validation
        String baseLink = driver.getCurrentUrl();
        System.out.println("Given " + baseLink);
        Assert.assertEquals(baseLink, UserData.BASE_URL);
        System.out.println("Home URL is visible");
        sleepTime(1000);

        // Click on 'Contact Us' button
        lp.getContactUsButton().click();
        sleepTime(1000);

        // Verify 'GET IN TOUCH' is visible
        if (cup.getContactUsHeader().isDisplayed())
        {
            String getInTouchText = cup.getContactUsHeader().getText();
            Assert.assertTrue(true,getInTouchText);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }

        // Enter name, email, subject and message
        cup.getInputName().sendKeys(UserData.INPUT_NAME);
        sleepTime(500);
        cup.getInputEmail().sendKeys(UserData.INPUT_EMAIL);
        sleepTime(500);
        cup.getInputSubject().sendKeys(UserData.INPUT_SUBJECT);
        sleepTime(500);
        cup.getCreateMassage().sendKeys(UserData.INPUT_MASSAGE);
        sleepTime(500);

        // Upload file
        cup.getUploadFile().sendKeys(FunctionUtils.UPLOAD_FILE_PATH);
        sleepTime(1000);

        //Click 'Submit' button
        cup.getClickOnSubmitButton().click();
        sleepTime(1000);

        // Click OK button
        driver.switchTo().alert().accept();
        sleepTime(1000);

        // Verify success message 'Success! Your details have been submitted successfully.' is visible
        if (cup.getSubmittedSuccessfullyText().isDisplayed())
        {
            String submittedSuccessfully = cup.getSubmittedSuccessfullyText().getText();
            Assert.assertTrue(true,submittedSuccessfully);
        }else {
            System.out.println(UserData.NEGATIVE_ERROR_MASSAGE);
        }

        // Click 'Home' button and verify that landed to home page successfully
        cup.getGoToHomeButton().click();
        sleepTime(1000);

    }
}
