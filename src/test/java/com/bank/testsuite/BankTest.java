package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {

    HomePage homePage = new HomePage();

    CustomerLoginPage customerLoginPage = new CustomerLoginPage();

    AddCustomerPage addCustomerPage = new AddCustomerPage();

    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();

    OpenAccountPage openAccountPage = new OpenAccountPage();

    AccountPage accountPage = new AccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully () {



        homePage.clickOnBankManagerLogin();
        addCustomerPage.addNewCustomer();
        addCustomerPage.enterFirstname();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostcode();
        addCustomerPage.addCustomer();
        addCustomerPage.verifyAlertText();
        addCustomerPage.clickAlert();
    }
    @Test
    public void bankManagerShouldOpenAccountSuccessfully(){

        homePage.clickOnBankManagerLogin();

        bankManagerLoginPage.openAccount();

        openAccountPage.selectCustomerName();

        openAccountPage.selectCurrency();

        openAccountPage.clickOnProcessButton();
        openAccountPage.clickAlert();


    }

    @Test
    public void  customerShouldLoginAndLogoutSuceessfully(){
        customerLoginPage.clickOnCustomeLoginPage();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        customerLoginPage.clickOnLogOutButton();
        customerLoginPage.clickAlert();
    }

    @Test
    public void customerShouldDepositMoneySucessfully(){
        customerLoginPage.clickOnCustomeLoginPage();
        customerLoginPage.clickOnLoginButton();
        customerLoginPage.clickAlert();
        accountPage.clickOnDepositTab();
        accountPage.enterAmount();
        accountPage.clickOnDeposit();
        accountPage.clickAlertText1();

    }

    @Test
    public void  customerShouldWithdrawMoneySuccessfully(){
        customerLoginPage.clickOnCustomeLoginPage();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginButton();
        accountPage.clickOnWithdrawTab();
        accountPage.enterWithdrwalAmount();
        accountPage.clickOnwithdraw();


    }


}
