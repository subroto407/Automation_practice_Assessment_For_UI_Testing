package com.test.automationexercise.pages;

import com.test.automationexercise.configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends BasePage {

    public SearchProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(2) > a")
    public WebElement ClickOnProductButton;
    public WebElement getClickOnProductButton(){
        return ClickOnProductButton;
    }

    @FindBy(css = "#search_product")
    public WebElement InputSearchProduct;
    public WebElement getInputSearchProduct(){
        return InputSearchProduct;
    }

    @FindBy(css = "#submit_search")
    public WebElement SubmitSearch;
    public WebElement getSubmitSearch(){
        return SubmitSearch;
    }
}
