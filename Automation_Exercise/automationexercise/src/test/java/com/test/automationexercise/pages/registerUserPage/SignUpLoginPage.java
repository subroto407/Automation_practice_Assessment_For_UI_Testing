package com.test.automationexercise.pages.registerUserPage;

import com.test.automationexercise.configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpLoginPage extends BasePage {

    public SignUpLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#form > div > div > div:nth-child(3) > div > h2")
    public WebElement VerifyNewUserSignUpText;
    public WebElement getVerifyNewUserSignUpText(){
        return VerifyNewUserSignUpText;
    }

    @FindBy(css = "#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)")
    public WebElement InputName;
    public WebElement getInputName(){
        return InputName;
    }

    @FindBy(css = "#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)")
    public WebElement InputEmailAddress;
    public WebElement getInputEmailAddress(){
        return InputEmailAddress;
    }

    @FindBy(css = "#form > div > div > div:nth-child(3) > div > form > button")
    public WebElement ClickOnSignUpButton;
    public WebElement getClickOnSignUpButton(){
        return ClickOnSignUpButton;
    }

    @FindBy(css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > h2")
    public WebElement LoginToAccountVerifyText;
    public WebElement getLoginToAccountVerifyText(){
        return LoginToAccountVerifyText;
    }

    @FindBy(css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button")
    public WebElement ClickOnLoginButton;
    public WebElement getClickOnLoginButton(){
        return ClickOnLoginButton;
    }

    @FindBy(css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > p")
    public WebElement IncorrectEmailAndPasswordText;
    public WebElement getIncorrectEmailAndPasswordText(){
        return IncorrectEmailAndPasswordText;
    }


}
