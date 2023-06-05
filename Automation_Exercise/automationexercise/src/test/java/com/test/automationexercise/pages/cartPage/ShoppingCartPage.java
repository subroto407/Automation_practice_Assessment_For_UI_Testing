package com.test.automationexercise.pages.cartPage;

import com.test.automationexercise.configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#product-1")
    public WebElement FirstCartProduct;

    public WebElement getFirstCartProduct() {
        return FirstCartProduct;
    }

    @FindBy(css = "#product-1 > td.cart_price")
    public WebElement FirstProductPrice;

    public WebElement getFirstProductPrice() {
        return FirstProductPrice;
    }

    @FindBy(css = "#product-1 > td.cart_quantity")
    public WebElement FirstProductQuantity;

    public WebElement getFirstProductQuantity() {
        return FirstProductQuantity;
    }

    @FindBy(css = "#product-1 > td.cart_total")
    public WebElement FirstProductCartTotal;

    public WebElement getFirstProductCartTotal() {
        return FirstProductCartTotal;
    }

    @FindBy(css = "#product-2")
    public WebElement SecondCartProduct;

    public WebElement getSecondCartProduct() {
        return SecondCartProduct;
    }

    @FindBy(css = "#product-2 > td.cart_price")
    public WebElement SecondProductPrice;

    public WebElement getSecondProductPrice() {
        return SecondProductPrice;
    }

    @FindBy(css = "#product-2 > td.cart_quantity")
    public WebElement SecondProductQuantity;

    public WebElement getSecondProductQuantity() {
        return SecondProductQuantity;
    }

    @FindBy(css = "#product-2 > td.cart_total")
    public WebElement SecondProductCartTotal;

    public WebElement getSecondProductCartTotal() {
        return SecondProductCartTotal;
    }
}
