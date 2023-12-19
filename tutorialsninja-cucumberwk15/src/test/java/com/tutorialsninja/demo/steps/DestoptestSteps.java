package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DestoptestSteps {
    @Given("User should Mouse hover on Desktops Tab and click")
    public void userShouldMouseHoverOnDesktopsTabAndClick() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @When("User should click on Show All Desktops")
    public void userShouldClickOnShowAllDesktops() {
        new LaptopsAndNotebooksPage().selectProductByName("macs");
    }

    @And("User should Select Sort By position Name: Z to A")
    public void userShouldSelectSortByPositionNameZToA() {
        new LaptopsAndNotebooksPage().selectSortByOption("Z to A");
    }

    @Then("User should verify  the Product will arrange in Descending order")
    public void userShouldVerifyTheProductWillArrangeInDescendingOrder() {
        new LaptopsAndNotebooksPage().selectSortByOption("Decending");
    }

    @Given("User should Mouse hover on Currency Dropdown and click")
    public void userShouldMouseHoverOnCurrencyDropdownAndClick() {

    }

    @When("User should Mouse hover on £Pound Sterling and click")
    public void userShouldMouseHoverOn£PoundSterlingAndClick() {

    }

    @Then("User should Mouse hover on Desktops Tab")
    public void userShouldMouseHoverOnDesktopsTab() {
        new HomePage().mouseHoverOnDesktopsLinkAndClick();
    }

    @And("User should Select Sort By position Name A to Z")
    public void userShouldSelectSortByPositionNameAToZ() {
        new LaptopsAndNotebooksPage().selectSortByOption("A to Z");
    }


    @And("User should Verify the Text product")
    public void userShouldVerifyTheTextProduct() {
        new ProductPage().clickOnShoppingCartLinkIntoMessage();
    }

    @And("User should Enter Qty {int} using Select class")
    public void userShouldEnterQtyUsingSelectClass(int arg0) {
    }

    @And("User should Click on Add to Cart button")
    public void userShouldClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("User should Click on link “shopping cart” display into success message")
    public void userShouldClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
       new ProductPage().clickOnAddToCartButton();
    }

    @And("User should Verify the text Shopping Cart")
    public void userShouldVerifyTheTextShoppingCart() {
        new ShoppingCartPage().getShoppingCartText();
    }

    @And("User should Verify the Product name product")
    public void userShouldVerifyTheProductNameProduct() {
        new ShoppingCartPage().getShoppingCartText();
    }

    @And("User should Verify the Model {string}")
    public void userShouldVerifyTheModel(String arg0) {
    }

    @And("User should Verify the Total {string}")
    public void userShouldVerifyTheTotal(String arg0) {
    }

    @And("User should Select product “<product>”")
    public void userShouldSelectProductProduct() {

    }

    @And("User should Verify the Message “Success: You have added “<product>” to your shopping cart")
    public void userShouldVerifyTheMessageSuccessYouHaveAddedProductToYourShoppingCart() {
    }
}
