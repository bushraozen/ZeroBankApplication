package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends ZeroModulesPage {


    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "signin_button")
    public WebElement mainLogin;

    @FindBy(id="user_login")
    public WebElement login;

    @FindBy(id="user_password")
    public WebElement password;

    @FindBy(xpath = "//input [@ value = 'Sign in']")
    public WebElement signIn;

    @FindBy(id="details-button")
    public WebElement advanced;

    @FindBy(id="proceed-link")
    public WebElement proceedLink;

    @FindBy(xpath = "//a[.='Account Summary']")
    public WebElement accountSummary;

    @FindBy(xpath = "//form//div[@class='alert alert-error']")
    public WebElement alert;




}
