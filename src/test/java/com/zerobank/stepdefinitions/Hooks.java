package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;

import io.cucumber.java.*;
import com.zerobank.utilities.Driver;
import io.cucumber.java.*;

public class Hooks {
    //Import from io.cucumber.java not from junit
    @Before("@accountActivity")
    public void setupLoginScenario() {
        LoginPage loginPage = new LoginPage();
        String url = ConfigurationReader.getProperty("zeroBankUrl");
        Driver.getDriver().get(url);
        loginPage.mainLogin.click();
        loginPage.login.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.signIn.click();
        loginPage.advanced.click();
        loginPage.proceedLink.click();
    }
}
