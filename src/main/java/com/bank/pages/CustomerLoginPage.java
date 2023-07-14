package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CustomerLoginPage extends Utility {
    By customerloginbutton = By.xpath("//button[contains(text(),'Customer Login')]");

    By labelyourname = By.xpath("//label[contains(text(),'Your Name :')]");
    By namedropdown = By.xpath("//select[@id='userSelect']");

    By loginbutton = By.xpath("//button[@type='submit']");

    By logoutbutton = By.xpath("//button[contains(text(),'Logout')]");


    public void clickOnCustomeLoginPage() {
        clickOnElement(customerloginbutton);
    }

    public void nameLabel() {
        mouseHoverToElement(labelyourname);

    }

    public void selectName() {
        selectByVisibleTextFromDropDown(namedropdown, "Harry Potter");
    }


    public void clickOnLoginButton() {
        clickOnElement(loginbutton);
    }

    public void clickOnLogOutButton(){
        clickOnElement(labelyourname);
    }

    public void clickAlert() {
        acceptAlert();
    }

    public void verifyAlertText() {
        String actual = getTextFromAlert();
        String expected = "Your Name :";
        Assert.assertEquals(expected, actual, "incorrect text");

    }
}
