Feature: Login feature
  As a user I am able to login using valid credentials

  Scenario: User should navigate to login page successfully
    Given  User is on homepage
    When User clicks on login link
    Then User should navigate to login page successfully


    Scenario: Verify The Error Message With Invalid Credentials
      Given User is on homepage
      When User clicks on login link
      And User enters email "xyz@gmail.com"
      And User enters password "abc123"
      And User clicks on login button
      Then User should see error message "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found"

    Scenario: Verify That User Should Log In SuccessFully With Valid Credentials
      Given User is on homepage
      When User clicks on login link
      And User enters email "abc@gmail.com"
      And User enters password "abc123"
      And User clicks on login button
      Then User should see logout link

    Scenario: Verify That User Should Logout SuccessFully
      Given User is on homepage
      When User clicks on login link
      And User enters email "abc@gmail.com"
      And User enters password "abc123"
      And User clicks on login button
      And User clicks on logout link
      Then User should see login link


