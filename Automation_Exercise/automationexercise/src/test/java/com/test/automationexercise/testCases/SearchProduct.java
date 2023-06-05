package com.test.automationexercise.testCases;

import com.test.automationexercise.configuaration.BaseClass;
import com.test.automationexercise.landingPage.LandingPage;

public class SearchProduct extends BaseClass {

    public void searchProduct(){

        LandingPage lp = new LandingPage(driver);

        lp.getSignUpLoginButton().click();
    }
}
