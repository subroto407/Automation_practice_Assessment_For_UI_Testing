package com.test.automationexercise.pages.cartPage;

import com.test.automationexercise.configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends BasePage {

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "div:nth-of-type(2) > .product-image-wrapper > .single-products > .productinfo.text-center")
    public WebElement HoverOnFirstProduct;
    public WebElement getHoverOnFirstProduct(){
        return HoverOnFirstProduct;
    }

    @FindBy(xpath = "div:nth-of-type(2) > .product-image-wrapper > .single-products > .product-overlay > .overlay-content > .add-to-cart.btn.btn-default")
    public WebElement ClickOnAddToCartButton1;
    public WebElement getClickOnAddToCartButton1(){
        return ClickOnAddToCartButton1;
    }

    @FindBy(css = "#cartModal > div > div > div.modal-footer > button")
    public WebElement ClickContinueButton;
    public WebElement getClickContinueButton(){
        return ClickContinueButton;
    }

    @FindBy(css = "div:nth-of-type(3) > .product-image-wrapper > .single-products > .productinfo.text-center")
    public WebElement HoverOnSecondProduct;
    public WebElement getHoverOnSecondProduct(){
        return HoverOnSecondProduct;
    }

    @FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[3]/div/div[1]/div[2]/div/a")
    public WebElement ClickOnAddToCartButton2;
    public WebElement getClickOnAddToCartButton2(){
        return ClickOnAddToCartButton2;
    }

    @FindBy(css = "#cartModal > div > div > div.modal-body > p:nth-child(2) > a > u")
    public WebElement ClickViewCartButton;
    public WebElement getClickViewCartButton(){
        return ClickViewCartButton;
    }
}
