package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OpenAccountPage extends Utility {
    By  openAccount = By.xpath("//button[normalize-space()='Open Account']");

    By CustomerName = By.xpath("//select[@id='userSelect']");

    By Currency = By.xpath("//select[@id='currency']");

    By ProcessButton = By.xpath("//button[normalize-space()='Process']");


    public void clickonOpenSAccountPage(){
        clickOnElement(openAccount);
    }

    public void selectCustomerName(){
        selectByVisibleTextFromDropDown(CustomerName,"Harry Potter");
    }

    public void selectCurrency(){
        selectByVisibleTextFromDropDown(Currency,"Pound");
    }

    public void clickOnProcessButton(){
        clickOnElement(ProcessButton);
    }
    public void clickAlert(){
        acceptAlert();
    }

    public void verifyAlertText (){
        String actual = getTextFromAlert();
        String expected = "Account created successfully with account Number :1016";
        Assert.assertEquals(expected,actual,"incorrect text");
    }



}
