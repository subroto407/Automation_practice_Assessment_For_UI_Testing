package com.test.automationexercise.landingPage;

import com.test.automationexercise.configuaration.BasePage;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a")
    public WebElement SignUpLoginButton;
    public WebElement getSignUpLoginButton(){
        return SignUpLoginButton;
    }

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(10) > a")
    public WebElement VerifyLoggedInAsUserName;
    public WebElement getVerifyLoggedInAsUserName(){
        return VerifyLoggedInAsUserName;
    }

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(5) > a")
    public WebElement ClickOnDeleteAccountButton;
    public WebElement getClickOnDeleteAccountButton(){
        return ClickOnDeleteAccountButton;
    }

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a ")
    public WebElement ClickOnLogOutButton;
    public WebElement getClickOnLogOutButton(){
        return ClickOnLogOutButton;
    }

    @FindBy(css = "li:nth-of-type(8) > a")
    public WebElement ContactUsButton;
    public WebElement getContactUsButton(){
        return ContactUsButton;
    }



}
