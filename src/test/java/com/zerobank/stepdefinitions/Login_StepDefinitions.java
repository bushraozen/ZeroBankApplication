package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user on the main page")
    public void user_on_the_main_page() {
        String url = ConfigurationReader.getProperty("zeroBankUrl");
        Driver.getDriver().get(url);
    }

    @When("user click on sign in button")
    public void user_click_on_sign_in_button() {
        loginPage.mainLogin.click();
    }

    @Then("user enters username {string}")
    public void user_enters_username(String login) {
        loginPage.login.sendKeys(login);
    }


    @Then("user enters password {string}")
    public void user_enters_password(String password) {
        loginPage.password.sendKeys(password);
    }

    @And("user click the sign in button")
    public void userClickTheSignInButton() throws InterruptedException {
            loginPage.signIn.click();

    }

    @And("user click the advanced and proceed button")
    public void userClickTheAdvancedAndProceedButton() {

        loginPage.advanced.click();
        loginPage.proceedLink.click();

    }

    @Then("user able to see the {string} page")
    public void userAbleToSeeThePage(String expected) {

        loginPage.module(expected);

        String actual = loginPage.accountSummary.getText();
        Assert.assertEquals(actual,expected);

    }


    @Then("user able to see the Login and or password are wrong page")
    public void userAbleToSeeTheLoginAndOrPasswordAreWrongPage() {
        String actual= loginPage.alert.getText();
        String expected = "Login and/or password are wrong.";
        Assert.assertEquals(actual,expected);
    }

}
