package com.test.automationexercise.pages;

import com.test.automationexercise.configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubscriptionPage extends BasePage {

    public SubscriptionPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".footer-widget > .container h2")
    public WebElement SubscriptionHeader;
    public WebElement getSubscriptionHeader(){
        return SubscriptionHeader;
    }

    @FindBy(css = "#susbscribe_email")
    public WebElement InputSubscriptionEmail;
    public WebElement getInputSubscriptionEmail(){
        return InputSubscriptionEmail;
    }

    @FindBy(css = "#subscribe")
    public WebElement ClickArrowButton;
    public WebElement getClickArrowButton(){
        return ClickArrowButton;
    }

}
