package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryPage extends ZeroModulesPage {

    public AccountSummaryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='offset2 span8']/h2")
    public List<WebElement> accountTypes;

    public void verifyAccountType(List<String> expected) {
        for (int i = 0; i < accountTypes.size(); i++) {
            if (accountTypes.get(i).getText().equals(expected.get(i))) {
                String expectedT = expected.get(i);
                String actual = accountTypes.get(i).getText();
                Assert.assertTrue(actual.contains(expectedT));

//                System.out.println(accountTypes.get(i).getText());
            }
        }

    }


    @FindBy(xpath = "(//table[@class='table'])[3]//tr/th")
    List<WebElement> creditAccountsColumns;

    public void verifyCreditAccountsColumns(List<String> expected) {
        for (int i = 0; i < creditAccountsColumns.size(); i++) {
            if (creditAccountsColumns.get(i).getText().equals(expected.get(i))) {

                String expectedT = expected.get(i);
                String actual = creditAccountsColumns.get(i).getText();
                Assert.assertTrue(actual.contains(expectedT));

                System.out.println(creditAccountsColumns.get(i).getText());
            }
        }

    }

}
