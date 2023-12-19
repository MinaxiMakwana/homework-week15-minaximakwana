package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/**
 * 1.LoginPage - Email, password, Login Button and "Welcome, Please Sign In!" text Locators and
 * create appropriate methods for it.
 */

public class LoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Welcome, Please Sign In!']")
    WebElement WelcomeMessage;

    public String getWelcomeMsgText(){
        return getTextFromElement(WelcomeMessage);
    }

    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmail;

    public void enterEmail(String text){
       sendTextToElement(enterEmail, text);
    }

    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;

    public void enterPassword(String text){
        sendTextToElement(enterPassword, text);
    }

    @CacheLookup
    @FindBy(xpath = "//button[text() = 'Log in']")
    WebElement loginBtn;

    public void clickOnLoginButton(){
        clickOnElement(loginBtn);
    }

//    @CacheLookup
//    @FindBy(className = "message-error validation-summary-errors")
//    WebElement LoginWasUnsuccessful;

    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    //public String getLoginWasUnsuccessful(){
      //  return getTextFromElement(errorMessage);
    //}

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        //CustomListeners.node.log(Status.PASS, "Get errorMessage : " + errorMessage.getText());
        Reporter.log("Getting error message : " + errorMessage.getText() + "<br>");
        //log.info("Get errorMessage : " + errorMessage.getText());
        return message;
    }

    @CacheLookup
    @FindBy(className = "ico-logout")
    WebElement LogOutLink;

    public String getLogOutLink(){
        return getTextFromElement(LogOutLink);
    }

    @CacheLookup
    @FindBy(className = "ico-logout")
    WebElement logout;

    public void clickOnLogOutLink (){
        clickOnElement(logout);
    }

    @CacheLookup
    @FindBy(className = "ico-login")
    WebElement LogInLink;

    public String getLogInLink(){
        return getTextFromElement(LogInLink);
    }

}
