package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.ComponentsPage;
import com.tutorialsninja.demo.pages.DesktopPage;
import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TopMenuSteps {
    @Given("user should Mouse hover on Desktops Tab and click")
    public void userShouldMouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @Then("User should Verify the text Desktops")
    public void userShouldVerifyTheTextDesktops() {
        Assert.assertEquals(new DesktopPage().getDesktopsText(), "Show all Desktops");
    }

    @Given("User should Mouse hover on Laptops & Notebooks Tab and click")
    public void userShouldMouseHoverOnLaptopsNotebooksTabAndClick() {
        new HomePage().mouseHoverOnLaptopsAndNotebooksLinkAndClick();
    }

    @Then("User should verify the text Laptops & Notebooks")
    public void userShouldVerifyTheTextLaptopsNotebooks() {
        Assert.assertEquals(new LaptopsAndNotebooksPage().getLaptopsAndNotebooksText(), "Show All Laptops & Notebooks");
    }

    @Given("User should Mouse hover on Components Tab and click")
    public void userShouldMouseHoverOnComponentsTabAndClick() {
        new HomePage().mouseHoverOnComponentLinkAndClick();
    }

    @When("User should call selectMenu method and pass the menu Show All Components")
    public void userShouldCallSelectMenuMethodAndPassTheMenuShowAllComponents() {
        Assert.assertEquals(new ComponentsPage().getComponentsText(),"Show All Components");

    }

    @Then("User should verify the text ‘Components’")
    public void userShouldVerifyTheTextComponents() {
        new ComponentsPage().getComponentsText();
    }

}
