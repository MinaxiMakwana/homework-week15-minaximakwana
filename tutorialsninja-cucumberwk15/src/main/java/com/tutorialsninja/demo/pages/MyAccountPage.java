package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.openqa.selenium.By;


public class MyAccountPage extends Utility {

    By accountLogoutText = By.xpath("//h1[contains(text(),'Account Logout')]");
    By accountCreatedText = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By continueBtn = By.xpath("//a[contains(text(),'Continue')]");

    public String getAccountLogoutText() {
        return getTextFromElement(accountLogoutText);
    }

    public String getTextFromElement(By accountLogoutText) {
        return null;
    }

    public String getYourAccountHasBeenCreatedText() {
        return getTextFromElement(accountCreatedText);
    }
    public void clickOnContinueButton() {
        clickOnElement(continueBtn);
    }

    public void clickOnElement(By continueBtn) {
    }
}
