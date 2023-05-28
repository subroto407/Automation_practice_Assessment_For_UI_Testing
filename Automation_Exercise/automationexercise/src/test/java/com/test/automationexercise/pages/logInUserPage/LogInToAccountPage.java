package com.test.automationexercise.pages.logInUserPage;

import com.test.automationexercise.configuaration.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInToAccountPage extends BasePage {

    public LogInToAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#form > div > div > div.col-sm-4.col-sm-offset-1 > div > h2")
    public WebElement LoginToAccountVerifyText;
    public WebElement getLoginToAccountVerifyText(){
        return LoginToAccountVerifyText;
    }
}
