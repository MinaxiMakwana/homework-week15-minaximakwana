package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.browserfactory.ManageBrowser;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;

public class LoginSteps {

    private static final Logger log = LogManager.getLogger(ManageBrowser.class);

    @Given("User is on homepage")
    public void userIsOnHomepage() {
        System.out.println("This is @Given");
        log.info("User is on login page");
    }

    @When("User clicks on login link")
    public void userClicksOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("User should navigate to login page successfully")
    public void userShouldNavigateToLoginPageSuccessfully() {
        Assert.assertEquals(new LoginPage().getWelcomeMsgText(), "Welcome, Please Sign In!", "User is not logged in");
    }

    @And("User enters email {string}")
    public void userEntersEmail(String email) {
        new LoginPage().enterEmail(email);
    }

    @And("User enters password {string}")
    public void userEntersPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("User should see error message {string}")
    public void userShouldSeeErrorMessage(String errorMessage) {
    Assert.assertEquals(new LoginPage().getErrorMessage(),errorMessage,"Error message is not displayed");
    }


    @Then("User should see logout link")
    public void userShouldSeeLogoutLink() {
        new LoginPage().getLogInLink();
    }

    @And("User clicks on logout link")
    public void userClicksOnLogoutLink() {
        new LoginPage().clickOnLogOutLink();
    }

    @Then("User should see login link")
    public void userShouldSeeLoginLink() {
        new LoginPage().getLogInLink();

    }
}
