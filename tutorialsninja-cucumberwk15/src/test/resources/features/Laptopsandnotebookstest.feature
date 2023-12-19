Feature: Laptops and notebooks test

  Scenario: Verify Products Price Display High To Low Successfully
    Given User should Mouse hover on Laptops & Notebooks Tab and click
    When User should Click on Show All Laptops and Notebooks
    And User should Select Sort By price high to low
    Then User should Verify the Product price will arrange in High to Low order

  Scenario: Verify That User Place Order Successfully
    Given User should Mouse hover on Laptops & Notebooks Tab and click
    When User should Click on “Show All Laptops & Notebooks”
    Then User should Select Sort By price high to low
    And User should Select Product “MacBook”
    And User should Verify the text “MacBook”
    And User should Click on ‘Add To Cart’ button
    And User should Verify the message “Success: You have added MacBook to your shopping cart!”
    And User should Click on link “shopping cart” display into success message
    And User should Verify the text "Shopping Cart"
    And User should Verify the Product name "MacBook"
    And User should Change Quantity "2"
    And User should Click on “Update” Tab
    And User should Verify the message “Success: You have modified your shopping cart!”
    And User should Verify the Total £737.45
    And User should  Click on “Checkout” button
    And User should Verify the text “Checkout”
    And User should Verify the Text “New Customer”
    And User should Click on “Guest Checkout” radio button
    And User should Click on “Continue” tab
    And User should Fill the mandatory fields
    And User should Click on “Continue” Button
    And User should Add Comments About your order into text area
    And User should Check the Terms & Conditions check box
    And User should Click on “Continue” button
    Then User should Verify the message “Warning: Payment method required!”