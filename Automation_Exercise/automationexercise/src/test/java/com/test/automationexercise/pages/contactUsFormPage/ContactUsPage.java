package com.test.automationexercise.pages.contactUsFormPage;

import com.test.automationexercise.configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#contact-page > div.row > div.col-sm-8 > div > h2")
    public WebElement ContactUsHeader;
    public WebElement getContactUsHeader(){
        return ContactUsHeader;
    }

    @FindBy(css = "#contact-us-form > div:nth-child(2) > input")
    public WebElement InputName;
    public WebElement getInputName(){
        return InputName;
    }

    @FindBy(css = "#contact-us-form > div:nth-child(3) > input")
    public WebElement InputEmail;
    public WebElement getInputEmail(){
        return InputEmail;
    }

    @FindBy(css = "#contact-us-form > div:nth-child(4) > input")
    public WebElement InputSubject;
    public WebElement getInputSubject(){
        return InputSubject;
    }

    @FindBy(css = "#message")
    public WebElement CreateMassage;
    public WebElement getCreateMassage(){
        return CreateMassage;
    }

    @FindBy(css = "#contact-us-form > div:nth-child(6) > input")
    public WebElement UploadFile;
    public WebElement getUploadFile(){
        return UploadFile;
    }

    @FindBy(css = ".submit_form")
    public WebElement ClickOnSubmitButton;
    public WebElement getClickOnSubmitButton(){
        return ClickOnSubmitButton;
    }

    @FindBy(css = ".alert.alert-success.status")
    public WebElement SubmittedSuccessfullyText;
    public WebElement getSubmittedSuccessfullyText(){
        return SubmittedSuccessfullyText;
    }

    @FindBy(css = "#form-section > a > span")
    public WebElement goToHomeButton;
    public WebElement getGoToHomeButton(){
        return goToHomeButton;
    }

}
