package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {
    @When("User is on home page")
    public void userClicksOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("User should see register text")
    public void userShouldSeeRegisterText() {
        new RegisterPage().verifyRegisterText();
    }

    @Given("User is on register page")
    public void userIsOnRegisterPage() {
        new RegisterPage().clickOnRegisterLink();
    }

    @And("User clicks on register link")
    public void userClicksOnRegisterButton() {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("User should see the error message {string}")
    public void userShouldSeeTheErrorMessage(String text1, String text2, String text3, String text4, String text5 ) {
        Assert.assertEquals(new RegisterPage().verifyFirstName(),text1, "First name is required.");
        Assert.assertEquals(new RegisterPage().verifyLastName(), text2, "Last name is required.");
        Assert.assertEquals(new RegisterPage().verifyEmail(), text3, "Email is required.");
        Assert.assertEquals(new RegisterPage().verifyPassword(), text4, "Password is required.");
        Assert.assertEquals(new RegisterPage().verifyPassword(), text5, "Password is required.");
    }

    @And("User selects female radio button")
    public void userSelectsFemaleRadioButton() {
        new RegisterPage().clickOnGenderFemaleButton();
    }

    @And("User enters first name")
    public void userEntersFirstName() {
        new RegisterPage().verifyFirstName();
    }

    @And("User enters last name")
    public void userEntersLastName() {
        new RegisterPage().verifyLastName();
    }

//    @And("User selects day on date of birth field")
//    public void userSelectsDayOnDateOfBirthField() {
//        new RegisterPage().selectDay();
//    }
//
//    @And("User selects month on date of birth field")
//    public void userSelectsMonthOnDateOfBirthField() {
//        new RegisterPage().selectMonth();
//    }
//
//    @And("User selects year on date of birth field")
//    public void userSelectsYearOnDateOfBirthField() {
//        new RegisterPage().selectYear();
//    }

    @And("User enters email address")
    public void userEntersEmailAddress() {
        new RegisterPage().verifyEmail();
    }

    @And("User enters password")
    public void userEntersPassword() {
        new RegisterPage().verifyPassword();
        new RegisterPage().enterPassword("abc_123");
    }

    @And("User enters password to confirm password field")
    public void userEntersPasswordToConfirmPasswordField() {
        new RegisterPage().verifyPassword();
    }

    @Then("User should see text your registration completed")
    public void userShouldSeeTextYourRegistrationCompleted() {
        new RegisterPage().verifyMessageYourRegistrationCompleted();
    }

    @And("User enters first name {string}")
    public void userEntersFirstName(String Name) {
        new RegisterPage().enterFirstName(Name);
    }

    @And("User enters last name {string}")
    public void userEntersLastName(String Surname) {
        new RegisterPage().enterLastName(Surname);
    }

    @And("User selects day on date of birth field {string}")
    public void userSelectsDayOnDateOfBirthField(String Day) {
        new RegisterPage().selectDayFromDropDown(Day);
    }

    @And("User selects month on date of birth field {string}")
    public void userSelectsMonthOnDateOfBirthField(String Month) {
        new RegisterPage().selectMonthFromDropDown(Month);
    }

    @And("User selects year on date of birth field {string}")
    public void userSelectsYearOnDateOfBirthField(String Year) {
        new RegisterPage().selectYearFromDropDown(Year);
    }

    @And("User enters email address {string}")
    public void userEntersEmailAddress(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("User enters password to confirm password field {string}")
    public void userEntersPasswordToConfirmPasswordField(String password) {
        new RegisterPage().confirmPassword(password);
    }

    @Then("User should see the message {string}")
    public void userShouldSeeTheMessage(String registerText) {
        Assert.assertEquals(new RegisterPage().verifyRegisterText(), registerText, "Register");
    }
}
