package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utilities.BrowserUtil;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountActivity_StepDefinitions {

    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Given("user click on {string}")
    public void userClickOn(String expected) {

        accountActivityPage.accountActivity.click();
    }

    @When("user should be able to see the title {string}")
    public void user_should_be_able_to_see_the_title(String expected) {

        BrowserUtil.wait(3);
        String actual = Driver.getDriver().getTitle();
        BrowserUtil.wait(3);
        Assert.assertEquals(expected,actual);

    }

    @And("user on drop down default option should be {string}")
    public void userOnDropDownDefaultOptionShouldBe(String expected) {

       String actual = accountActivityPage.selectedOption();
       Assert.assertEquals(expected, actual);


    }

    @Then("drop down should have the following options")
    public void drop_down_should_have_the_following_options(List<String> expected) {

        List<String> allName = new ArrayList<>();

        for (WebElement each: accountActivityPage.selectedOptions()){
            allName.add(each.getText());
        }

        for (int i = 0; i < allName.size(); i++) {
            Assert.assertEquals(allName.get(i), expected.get(i));

        }


        


    }
    @Then("Transactions table should have column names")
    public void transactions_table_should_have_column_names(List<String> expected) {

        List<String> allName = new ArrayList<>();

        for (WebElement each: accountActivityPage.accountColumnNames){
            allName.add(each.getText());
        }

        for (int i = 0; i < allName.size(); i++) {
            Assert.assertEquals(allName.get(i), expected.get(i));

        }

    }



}
