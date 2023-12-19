package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserSteps {
    @Given("User is on login page")
    public void userIsOnLoginPage() {
    }

    @And("User should enter username {string}")
    public void userShouldEnterUsername(String username) {
        new LoginPage().enterUserName(username);
    }

    @And("User should enter password {string}")
    public void userShouldEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("User should click on login button")
    public void userShouldClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @When("User clicks on admin tab")
    public void userClicksOnAdminTab() {
        new HomePage().clickOnAdminTab();
    }

    @Then("User to verify text {string}")
    public void userToVerifyText(String verifyText) {
        new AddUserPage().getAddUserHeadingText();
    }

    @And("User should click on add button")
    public void userShouldClickOnAddButton() {
        new AddUserPage().clickOnSaveButton();
    }

    @And("User selects admin role {string}")
    public void userSelectsAdminRole(String admin) {
        new AddUserPage().selectUserRoleFromDropDown(admin);
    }

    @And("User enters employee name {string}")
    public void userEntersEmployeeName(String AnanyaDash) {
        new AddUserPage().enterUserName(AnanyaDash);

    }

    @And("User enters Username {string}")
    public void userEntersUsername(String Ananya) {
        new AddUserPage().enterUserName(Ananya);
    }

    @And("User disabled status {string}")
    public void userDisabledStatus(String Disabled) {
        new AddUserPage().clickOnStatusDropDown();
        new AddUserPage().selectStatusFromDropDown(Disabled);
    }

    @And("User enters password {string}")
    public void userEntersPassword(String password) {
        new AddUserPage().enterPassword(password);
    }

    @And("User enters confirm password {string}")
    public void userEntersConfirmPassword(String confirmPassword) {
        new AddUserPage().enterConfirmPassword(confirmPassword);
    }

    @And("User clicks on save button")
    public void userClicksOnSaveButton() {
        new AddUserPage().clickOnSaveButton();
    }

    @Then("User verifies text successfully saved {string}")
    public void userVerifiesTextSuccessfullySaved(String SuccessfullySaved) {
        Assert.assertEquals(new AddUserPage().getSuccessToasterMessageText(), SuccessfullySaved, "Employee details are not saved successfully");
    }

    @And("User enters NewUsername {string}")
    public void userEntersNewUsername(String newUsername) {
        new AddUserPage().enterUserName(newUsername);
    }

    @And("User selects admin role from dropdown menu {string}")
    public void userSelectsAdminRoleFromDropdownMenu(String adminRole) {
        new AddUserPage().selectUserRoleFromDropDown(adminRole);
    }

    @And("User enable status {string}")
    public void userEnableStatus(String enable) {
        new AddUserPage().selectStatusFromDropDown(enable);
    }

    @And("User clicks on search button")
    public void userClicksOnSearchButton() {
        new AddUserPage().clickOnSearchButton();
    }

    @Then("User verifies text user should be in Result list {string}")
    public void userVerifiesTextUserShouldBeInResultList(String searchResult) {
        Assert.assertTrue(ViewSystemUsersPage.getRecordFoundLabelText().contains("Record Found"), "The search results are not displayed.");
    }

    @And("User verifies text user should be in Result list")
    public void userVerifiesTextUserShouldBeInResultList() {
    }

    @And("User clicks on check box")
    public void userClicksOnCheckBox() {
        new AdminPage().clickOnCheckBox();
    }

    @And("User clicks on delete button")
    public void userClicksOnDeleteButton() {
        new AdminPage().clickOnDeleteButton();
    }


    @Then("User verifies text {string}")
    public void userVerifiesText(String SystemUsers) {
        Assert.assertEquals(ViewSystemUsersPage.getSystemUserHeadingText(), "System Users", "The user navigated to incorrect page");
    }


    @And("User should enter {string}")
    public void userShouldEnter(String username, String userRole, String employeeName, String status) {
        ViewSystemUsersPage.searchUser(username, userRole,employeeName,status);
    }

    @And("User should click on search button")
    public void userShouldClickOnSearchButton() {
        new AddUserPage().clickOnSearchButton();
    }

    @And("User verifies text \\({int})Record Found")
    public void userVerifiesTextRecordFound(int one) {
        Assert.assertEquals(ViewSystemUsersPage.getRecordFoundLabelText().contains("Records Found"), "Invalid message");
    }

    @And("User verifies username")
    public void userVerifiesUsername() {
        Assert.assertEquals(ViewSystemUsersPage.getUserNameInRecordText(),"Admin", "Record not found");
    }

    @Then("User clicks on reset tab")
    public void userClicksOnResetTab() {
        new ViewSystemUsersPage().clickOnResetButton();
    }
}
