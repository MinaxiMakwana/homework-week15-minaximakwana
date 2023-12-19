package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 2.HomePage - All Menu (Seven menu), LoginLink, registerLink, nopcommerce logo, My account
 * link and LogOut link locators and create appropriate methods for it.
 */
public class HomePage extends Utility {


    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    public void clickOnLoginLink (){
        clickOnElement(loginLink);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class = 'ico-register']")
    WebElement registerLink;

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }

}
