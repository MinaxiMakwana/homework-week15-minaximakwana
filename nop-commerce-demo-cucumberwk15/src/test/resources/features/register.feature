Feature: Register feature
  As a user I am able to login using valid credentials

  Scenario: Verify User Should Navigate To Register Page Successfully
    Given  User is on homepage
    When User clicks on register link
    Then User should see the message "register"

  Scenario: Verify That First Name Last Name Email Password And Confirm Password Fields Are Mandatory
    Given  User is on homepage
    When User clicks on register link
    And User should see the error message "First name is required."
    And User should see the error message "Last name is required."
    And User should see the error message "Email is required."
    And User should see the error message "Password is required."
    Then User should see the error message "Password is required."

  @onlytest
  Scenario: Verify That User Should Create Account Successfully
    Given User is on register page
    When User clicks on register link
    And User selects female radio button
    And User enters first name "Joanne"
    And User enters last name "Rowling"
    #And User selects day on date of birth field "01"
   # And User selects month on date of birth field "January"
   # And User selects year on date of birth field "2000"
    And User enters email address "j.rowling@gmail.com"
    And User enters password "abc_123"
    And User enters password to confirm password field "abc_123"
    And User clicks on register link
    Then User should see text your registration completed


