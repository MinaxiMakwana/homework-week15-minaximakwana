package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.AccountLoginPage;
import com.tutorialsninja.demo.pages.AccountRegisterPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountSteps {
    @Given("User should Click on My Account Link.")
    public void userShouldClickOnMyAccountLink() {
        new HomePage().clickOnMyQAccountTab();
    }

    @When("User should Call the method “selectMyAccountOptions” method and pass the parameter Register")
    public void userShouldCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterRegister() {
        new HomePage().selectMyAccountOptions("Register");
    }

    @Then("User should Verify the text Register Account")
    public void userShouldVerifyTheTextRegisterAccount() {

    }

    @When("User should Call the method “selectMyAccountOptions” method and pass the parameter “Login”")
    public void userShouldCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogin() {
        new HomePage().selectMyAccountOptions("Login");
    }

    @Then("User should Verify the text “Returning Customer”")
    public void userShouldVerifyTheTextReturningCustomer() {
        new AccountLoginPage().getReturningCustomerText();
    }

    @Then("User should Enter First Name")
    public void userShouldEnterFirstName() {
        new AccountRegisterPage().enterFirstName("test");
    }

    @And("User should Enter Last Name")
    public void userShouldEnterLastName() {
        new AccountRegisterPage().enterLastName("test1");
    }

    @And("User should Enter Email")
    public void userShouldEnterEmail() {
        new AccountRegisterPage().enterEmail("test@gmail.com");
    }

    @And("User should Enter Telephone")
    public void userShouldEnterTelephone() {
        new AccountRegisterPage().enterTelephone("012345789023");
    }

    @And("User should Enter Password")
    public void userShouldEnterPassword() {
        new AccountRegisterPage().enterPassword("123_abc");
    }

    @And("User should Enter Password Confirm")
    public void userShouldEnterPasswordConfirm() {
        new AccountRegisterPage().enterConfirmPassword("123_abc");
    }

    @And("User should Select Subscribe Yes radio button")
    public void userShouldSelectSubscribeYesRadioButton() {

    }

    @And("User should Click on Privacy Policy check box")
    public void userShouldClickOnPrivacyPolicyCheckBox() {
        new AccountRegisterPage().clickOnPrivacyPolicyCheckBox();
    }

    @And("User should Click on Continue button")
    public void userShouldClickOnContinueButton() {
        new AccountRegisterPage().clickOnContinueButton();
    }

    @And("User should Verify the message “Your Account Has Been Created!")
    public void userShouldVerifyTheMessageYourAccountHasBeenCreated() {
        new AccountRegisterPage().getRegisterAccountText();
    }

    @And("User should Call the method “selectMyAccountOptions” method and pass the parameter “Logout”")
    public void userShouldCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogout() {
    }

    @And("User should Verify the text “Account Logout”")
    public void userShouldVerifyTheTextAccountLogout() {
    }

    @Given("User should Click on My Account Link")
    public void userShouldClickrOnMyAccountLink() {
        new HomePage().clickOnMyQAccountTab();
    }

    @Then("User should Enter Email address")
    public void userShouldEnterEmailAddress() {
        new AccountRegisterPage().enterEmail("test@gmail.com");
    }

    @And("User should Click on Login button")
    public void userShouldClickOnLoginButton() {
        new AccountLoginPage().clickOnLoginButton();
    }

    @And("User should Verify text “My Account”")
    public void userShouldVerifyTextMyAccount() {
        new MyAccountPage().getAccountLogoutText();
    }
}
