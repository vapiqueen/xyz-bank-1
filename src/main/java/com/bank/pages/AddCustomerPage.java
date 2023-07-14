package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AddCustomerPage extends Utility {
    By addingNewCustomertab = By.xpath("//button[contains(text(),'Add Customer')]");

    By firstname = By.xpath("//input[@placeholder='First Name']");

    By lastname = By.xpath("//input[@placeholder='Last Name']");

    By postcode = By.xpath("//input[@placeholder='Post Code']");

    By addcustomerbutton = By.xpath("//button[@type='submit']");

    public void addNewCustomer(){
        clickOnElement(addingNewCustomertab);

    }
    public void enterFirstname(){
sendTextToElement(firstname,"Aarti");
    }

    public void enterLastName(){
        sendTextToElement(lastname,"Doshi");
    }

    public void enterPostcode(){
        sendTextToElement(postcode,"HA3 5SB");
    }

    public void addCustomer(){
        clickOnElement(addcustomerbutton);
    }



    public void clickAlert(){
        acceptAlert();
    }

    public void verifyAlertText (){
        String actual = getTextFromAlert();
        String expected = "Customer added successfully with customer id :6";
        Assert.assertEquals(expected,actual,"incorrect text");
    }

}
