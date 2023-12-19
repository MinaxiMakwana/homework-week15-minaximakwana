package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.MyAccountPage;
import com.tutorialsninja.demo.pages.ProductPage;
import com.tutorialsninja.demo.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaptopsandnotebookSteps {
    @When("User should Click on Show All Laptops and Notebooks")
    public void userShouldClickOnShowAllLaptopsAndNotebooks() {
        new LaptopsAndNotebooksPage().selectProductByName("Show all");
    }

    @And("User should Select Sort By price high to low")
    public void userShouldSelectSortByPriceHighToLow() {
        new LaptopsAndNotebooksPage().getProductsPriceList();
    }

    @Then("User should Verify the Product price will arrange in High to Low order")
    public void userShouldVerifyTheProductPriceWillArrangeInHighToLowOrder() {
    }

    @When("User should Click on “Show All Laptops & Notebooks”")
    public void userShouldClickOnShowAllLaptopsNotebooks() {
        new LaptopsAndNotebooksPage().selectProductByName("Laptops and Notebooks");
    }

    @And("User should Select Product “MacBook”")
    public void userShouldSelectProductMacBook() {
        new LaptopsAndNotebooksPage().selectProductByName("MacBook");
    }

    @And("User should Verify the text “MacBook”")
    public void userShouldVerifyTheTextMacBook() {
    }

    @And("User should Click on ‘Add To Cart’ button")
    public void userShouldClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @And("User should Verify the message “Success: You have added MacBook to your shopping cart!”")
    public void userShouldVerifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        new ProductPage().getProductAddedSuccessMessage();
    }

    @And("User should Verify the text {string}")
    public void userShouldVerifyTheText(String arg0) {
    }

    @And("User should Verify the Product name {string}")
    public void userShouldVerifyTheProductName(String arg0) {
    }

    @And("User should Change Quantity {string}")
    public void userShouldChangeQuantity(String one) {
        new ProductPage().enterQuantity(one);
    }

    @And("User should Click on “Update” Tab")
    public void userShouldClickOnUpdateTab() {
        new ShoppingCartPage().changeQuantity("two");
    }

    @And("User should Verify the message “Success: You have modified your shopping cart!”")
    public void userShouldVerifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
    }

    @And("User should Verify the Total £{double}")
    public void userShouldVerifyTheTotal£(int arg0, int arg1) {
    }

    @And("User should  Click on “Checkout” button")
    public void userShouldClickOnCheckoutButton() {


    }

    @And("User should Verify the text “Checkout”")
    public void userShouldVerifyTheTextCheckout() {
    }

    @And("User should Verify the Text “New Customer”")
    public void userShouldVerifyTheTextNewCustomer() {
    }

    @And("User should Click on “Guest Checkout” radio button")
    public void userShouldClickOnGuestCheckoutRadioButton() {

    }

    @And("User should Click on “Continue” tab")
    public void userShouldClickOnContinueTab() {
        new MyAccountPage().clickOnContinueButton();
    }

    @And("User should Fill the mandatory fields")
    public void userShouldFillTheMandatoryFields() {
    }

//    @And("User should Click on “Continue” Button")
//    public void userShouldClickOnContinueButton() {
//    }

    @And("User should Add Comments About your order into text area")
    public void userShouldAddCommentsAboutYourOrderIntoTextArea() {
    }

    @And("User should Check the Terms & Conditions check box")
    public void userShouldCheckTheTermsConditionsCheckBox() {

    }

    @And("User should Click on “Continue” button")
    public void userShouldClickOnContinueButton() {
        new MyAccountPage().clickOnContinueButton();
    }

    @Then("User should Verify the message “Warning: Payment method required!”")
    public void userShouldVerifyTheMessageWarningPaymentMethodRequired() {

    }
}
