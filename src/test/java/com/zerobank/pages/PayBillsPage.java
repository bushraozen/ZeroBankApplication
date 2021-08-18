package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PayBillsPage {

    public PayBillsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Pay Bills']")
    public WebElement payBills;

    @FindBy(xpath = "//select[@id='sp_payee']")
    public WebElement payee;

    @FindBy(id = "sp_account")
    public WebElement account;


    @FindBy(xpath = "//input[@id='sp_amount']")
    public WebElement amount;


    @FindBy(id = "sp_date")
    public WebElement date;


    @FindBy(xpath = "//input[@id='sp_description']")
    public WebElement description;


    @FindBy(xpath = "//input[@id='pay_saved_payees']")
    public WebElement payButton;

    @FindBy(xpath = "//span[@title='$ 200 payed to payee sprint']")
    public WebElement successfully;


    public  void select1(){

        Select select = new Select(payee);
        select.selectByValue("sprint");
    }

    public  void select2(){

        Select select = new Select(account);
        select.selectByVisibleText("Savings");
    }




}
