package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By addingNewCustomerPage = By.xpath("//button[normalize-space()='Add Customer']");

    By openAccount = By.xpath("//button[normalize-space()='Open Account']");

    By customerTab = By.xpath("//button[normalize-space()='Customers']");

    public void addCustomerByManager(){
        clickOnElement(addingNewCustomerPage);
    }

    public void openAccount(){
        clickOnElement(openAccount);
    }

    public void customersTab(){
        clickOnElement(customerTab);
    }
}
