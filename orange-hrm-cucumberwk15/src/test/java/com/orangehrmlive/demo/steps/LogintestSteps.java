package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LogintestSteps {
    @Given("User is on Login page")
    public void userIsOnLoginPage() {
    }

    @And("User should enter Username {string}")
    public void userShouldEnterUsername(String username) {
        new LoginPage().enterUserName(username);
    }

    @And("User should enter Password {string}")
    public void userShouldEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("User should click on Login button")
    public void userShouldClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("User should verify Welcome message")
    public void userShouldVerifyWelcomeMessage() {
        String actualDashBoardTitle = HomePage.getDashboardTitleText();
        Assert.assertEquals(actualDashBoardTitle, "Dashboard", "User navigated ti incorrect page.");
    }

    @Then("User should verify Logo is displayed")
    public void userShouldVerifyLogoIsDisplayed() {
        Assert.assertTrue(LoginPage.getLogoElement().isDisplayed(), "Logo is not displayed.");
    }

    @And("User should click on user profile logo")
    public void userShouldClickOnUserProfileLogo() {
        new HomePage().clickOnUserProfileLogo();

    }

    @And("User should mouse hover on {string} and click")
    public void userShouldMouseHoverOnAndClick(String logout) {
        new HomePage().clickOnDropDownOptions(logout);
    }

    @Then("User should verify text Login Panel is displayed")
    public void userShouldVerifyTextLoginPanelIsDisplayed() {

    }


}
