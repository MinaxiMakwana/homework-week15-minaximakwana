Feature: Desktops test page

Scenario: Verify Product Arrange In Alphabetical Order
  Given User should Mouse hover on Desktops Tab and click
  When User should click on Show All Desktops
  And User should Select Sort By position Name: Z to A
  Then User should verify  the Product will arrange in Descending order

Scenario Outline: Verify Product Added To Shopping Cart SuccessFully
  Given User should Mouse hover on Currency Dropdown and click
  When User should Mouse hover on £Pound Sterling and click
  Then User should Mouse hover on Desktops Tab
  And User should Select Sort By position Name A to Z
  And User should Select product “<product>”
  And User should Verify the Text product
  And User should Enter Qty 1 using Select class
  And User should Click on Add to Cart button
  And User should Verify the Message “Success: You have added “<product>” to your shopping cart
  And User should Click on link “shopping cart” display into success message
  And User should Verify the text Shopping Cart
  And User should Verify the Product name product
  And User should Verify the Model "<model>"
  Then User should Verify the Total "<price>"

Examples:
    |product      | model    | price  |
    |HTC Touch HD |Product 1 |£74.73  |
    |iPhone       |product 11| £75.46 |
    |iPod Classic |product 20| £74.73 |
    |MacBook      |Product 16| £368.73|
    |MacBook Air  |Product 17| £736.23|
    |Sony VAIO    |Product 19| £736.23|



