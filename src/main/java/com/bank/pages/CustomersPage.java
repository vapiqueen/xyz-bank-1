package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomersPage extends Utility {

    By searchCustomerBox = By.xpath("//input[@placeholder='Search Customer']");

    public void customerSearch(){
        clickOnElement(searchCustomerBox);
    }
}
