package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AccountPage extends Utility {
    By TransactionTab = By.xpath("//button[normalize-space()='Transactions']");

    By DepositTab = By .xpath("//button[normalize-space()='Deposit']");

    By WithdrawlTab = By.xpath("//button[normalize-space()='Withdrawl']");

    By AmountToBeDepositedDropDown = By.xpath("//input[@placeholder='amount']");

    By deposit = By.xpath("//button[@type='submit']");

    By AmountToBeWithdrawn = By.xpath("//input[@placeholder='amount']");
    By withdraw =By.xpath("//button[normalize-space()='Withdraw']");

    public void clickOnTransactionTab(){
        clickOnElement(TransactionTab);
    }
    public void clickOnDepositTab(){
        clickOnElement(DepositTab);
    }

    public void clickOnWithdrawTab(){
        clickOnElement(WithdrawlTab);
    }
    public void enterAmount(){
      sendTextToElement(AmountToBeDepositedDropDown,"100");
    }

    public void clickOnDeposit(){
        clickOnElement(deposit);
    }

    public void enterWithdrwalAmount(){
        sendTextToElement(AmountToBeWithdrawn,"50");
    }

    public void clickOnwithdraw(){
        clickOnElement(withdraw);
    }
   public void clickAlert(){
       acceptAlert();
   }

    public void verifyAlertText (){
        String actual = getTextFromAlert();
        String expected = "Deposit Successful";
        Assert.assertEquals(expected,actual,"incorrect text");
    }
    public void clickAlertText1(){
        String actual = getTextFromAlert();
        String expected = "Transaction successful";
        Assert.assertEquals(expected,actual,"incorrect text");
    }




}
