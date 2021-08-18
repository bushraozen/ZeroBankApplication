package com.zerobank.stepdefinitions;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtil;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class PayBills_StepDefinitions {

    PayBillsPage payBillsPage = new PayBillsPage();

    @Given("user clicks on Pay Bills")
    public void userClicksOnPayBills() {

        payBillsPage.payBills.click();

    }
    @Given("title should be {string}")
    public void title_should_be(String expected) {

        Assert.assertEquals(expected, Driver.getDriver().getTitle());

    }
    @When("user clicks on Payee, Account, Amount, Date, Description")
    public void user_clicks_on_payee_account_amount_date_description() {

        payBillsPage.select1();
        payBillsPage.select2();
        payBillsPage.amount.sendKeys("200");
        payBillsPage.date.sendKeys("2021-08-09");
        payBillsPage.description.sendKeys("For credit");
        payBillsPage.payButton.click();


    }
    @Then("user can see the payment was successfully submitted")
    public void userCanSeeThePaymentWasSuccessfullySubmitted() {
        BrowserUtil.wait(3);
        Assert.assertEquals("The payment was successfully submitted.", payBillsPage.successfully.getText());
    }



}
