Feature: My Accounts test

  Scenario: Verify User Should Navigate To Register Page Successfully
    Given User should Click on My Account Link.
    When User should Call the method “selectMyAccountOptions” method and pass the parameter Register
    Then User should Verify the text Register Account

  Scenario: Verify User Should Navigate To Register Page Successfully
    Given User should Click on My Account Link
    When User should Call the method “selectMyAccountOptions” method and pass the parameter “Login”
    Then User should Verify the text “Returning Customer”

  Scenario: Verify That User Register Account Successfully
    Given User should Click on My Account Link
    When User should Call the method “selectMyAccountOptions” method and pass the parameter Register
    Then User should Enter First Name
    And User should Enter Last Name
    And User should Enter Email
    And User should Enter Telephone
    And User should Enter Password
    And User should Enter Password Confirm
    And User should Select Subscribe Yes radio button
    And User should Click on Privacy Policy check box
    And User should Click on Continue button
    And User should Verify the message “Your Account Has Been Created!
    And User should Click on Continue button
    And User should Click on My Account Link
    And User should Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    And User should Verify the text “Account Logout”
    Then User should Click on Continue button

  Scenario: Verify That User Should Login And Logout Successfully
    Given User should Click on My Account Link
    When User should Call the method “selectMyAccountOptions” method and pass the parameter “Login”
    Then User should Enter Email address
    And User should Enter Last Name
    And User should Enter Password
    And User should Click on Login button
    And User should Verify text “My Account”
    And User should Click on My Account Link
    And User should Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
    And User should Verify the text “Account Logout”
    Then User should Click on Continue button