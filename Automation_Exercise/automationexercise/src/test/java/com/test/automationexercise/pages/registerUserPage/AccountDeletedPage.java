package com.test.automationexercise.pages.registerUserPage;

import com.test.automationexercise.configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDeletedPage extends BasePage {

    public AccountDeletedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#form > div > div > div > h2 > b")
    public WebElement VerifyAccountDeletedHeader;
    public WebElement getVerifyAccountDeletedHeader(){
        return VerifyAccountDeletedHeader;
    }

    @FindBy(css = "#form > div > div > div > div > a")
    public WebElement ClickOnContinueButton;
    public WebElement getClickOnContinueButton(){
        return ClickOnContinueButton;
    }
}
