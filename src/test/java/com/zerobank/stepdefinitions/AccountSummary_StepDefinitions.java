package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.ZeroModulesPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountSummary_StepDefinitions {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the landing page")
    public void userIsOnTheLandingPage() {

    }

    @And("user should be able to see title {string}")
    public void userShouldBeAbleToSeeTitle(String expected) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle, expected);
    }

    @Given("user should be able to see")
    public void user_should_be_able_to_see(List<String> expected) {
        accountSummaryPage.verifyAccountType(expected);
    }

    @Then("user should be able to see under Credit Accounts table Account, Credit Card and Balance columns")
    public void userShouldBeAbleToSeeUnderCreditAccountsTableAccountCreditCardAndBalanceColumns(List<String> expected) {
        accountSummaryPage.verifyCreditAccountsColumns(expected);
    }

}
