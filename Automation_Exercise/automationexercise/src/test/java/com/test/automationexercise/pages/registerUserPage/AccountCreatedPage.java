package com.test.automationexercise.pages.registerUserPage;

import com.test.automationexercise.configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage {

    public AccountCreatedPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#form > div > div > div > h2 > b")
    public WebElement AccountCreatedHeaderText;
    public WebElement getAccountCreatedHeaderText(){
        return AccountCreatedHeaderText;
    }

    @FindBy(css = "#form > div > div > div > div > a")
    public WebElement ClickOnContinueButton;
    public WebElement getClickOnContinueButton(){
        return ClickOnContinueButton;
    }

}
