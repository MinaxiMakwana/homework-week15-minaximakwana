Feature: Login test feature

Scenario: Verify User Should Login Successfully
  Given User is on Login page
  And User should enter Username "Admin"
  And User should enter Password "admin123"
  And User should click on Login button
  Then User should verify Welcome message

Scenario: Verify That The Logo Display On HomePage
  Given User is on Login page
  And User should enter Username "Admin"
  And User should enter Password "admin123"
  And User should click on Login button
  Then User should verify Logo is displayed

Scenario: Verify User Should LogOut SuccessFully
  Given User is on Login page
  And User should enter Username "Admin"
  And User should enter Password "admin123"
  And User should click on Login button
  And User should click on user profile logo
  And U   ser should mouse hover on "Logout" and click
  Then User should verify text Login Panel is displayed

Scenario Outline: Verify Error Message With Invalid Credentials
  And User should enter "<username>"
  And User should enter "<password>"
  And User should enter "<errorMessage>"

  Examples:
    | username           | password  | errorMessage        |
    |                    |           | Required            |
    | test123@gmail.com  |           | Required            |
    |                    | test123   | Required            |
    | test123@gmail.com  | test123   | Invalid credentials |