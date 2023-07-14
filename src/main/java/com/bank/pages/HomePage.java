package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By mouseHoverTohomebutton = By.xpath("//button[normalize-space()='Home']");

    By mainheading = By.xpath("//button[normalize-space()='Home']");

    By customerloginbutton = By.xpath("//button[contains(text(),'Customer Login')]");

    By bankmanagerlogin = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    public void hoverMouseToHomeButton(){
        mouseHoverToElement(mouseHoverTohomebutton);
    }

    public String getMainHeadingText(){
        return getTextFromElement(mainheading);

    }

    public void clickOnLoginButton(){
        clickOnElement(customerloginbutton);
    }
    public void clickOnBankManagerLogin(){
        clickOnElement(bankmanagerlogin);
    }
}
