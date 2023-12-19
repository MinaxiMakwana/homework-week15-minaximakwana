package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ComputerSteps {

    @Given("User should click on computer tab")
    public void userShouldClickOnComputerTab() {
        new ComputerPage().clickOnComputerTab();
    }

    @When("User should see text computer")
    public void userShouldSeeTextComputer() {
        new ComputerPage().verifyComputersText();
    }

    @When("User should click on desktop link")
    public void userShouldClickOnDesktopLink() {
        new ComputerPage().clickOnDesktops();
    }

    @Then("User should see text Desktop")
    public void userShouldSeeTextDesktop() {
        new ComputerPage().verifyDesktops();
    }

    @And("User should click on product name Build your own computer")
    public void userShouldClickOnProductNameBuildYourOwnComputer() {
        new BuildYourOwnComputerPage().clickOnBuildYourOwnComputer();
    }

    @And("User should select {string}")
    public void userShouldSelect(String processor, String ram, String hdd, String os, String software) {
        new BuildYourOwnComputerPage().selectprocessorFromDropDown(processor);
        new BuildYourOwnComputerPage().selectRamFromDropDown(ram);
        new BuildYourOwnComputerPage().selectHddFromDropDown(hdd);
        new BuildYourOwnComputerPage().selectOsFromDropDown(os);
        new BuildYourOwnComputerPage().selectSoftwareCheckBox(software);

    }
}
