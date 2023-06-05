package com.test.automationexercise.pages.placeOrder_RegisterWhileCheckout;

import com.test.automationexercise.configuaration.BasePage;
import com.test.automationexercise.landingPage.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#do_action > div.container > div > div > a")
    public WebElement ProceedToCheckOutButton;
    public WebElement getProceedToCheckOutButton(){
        return ProceedToCheckOutButton;
    }

    @FindBy(css = "#checkoutModal > div > div > div.modal-body > p:nth-child(2) > a > u")
    public WebElement ClickCheckoutLoginButton;
    public WebElement getClickCheckoutLoginButton(){
        return ClickCheckoutLoginButton;
    }
}
