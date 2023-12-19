Feature: User test feature

Scenario: Admin Should Add User Successfully
  Given User is on login page
  And User should enter username "Admin"
  And User should enter password "admin123"
  And User should click on login button
  When User clicks on admin tab
  Then User to verify text "System Users"
  And User should click on add button
  And User selects admin role "Admin"
  And User enters employee name "Ananya Dash"
  And User enters Username "Ananya"
  And User disabled status "Disabled"
  And User enters password "admin123"
  And User enters confirm password "admin123"
  And User clicks on save button
  Then User verifies text successfully saved "Successfully Saved"

Scenario: Search The User Created And Verify It
  Given User is on login page
  And User should enter username "Admin"
  And User should enter password "admin123"
  And User should click on login button
  When User clicks on admin tab
  Then User to verify text "System Users"
  And User enters NewUsername "Cecil.Bonaparte"
  And User selects admin role from dropdown menu "Admin"
  And User enable status "Enabled"
  And User clicks on search button
  Then User verifies text user should be in Result list "(1) Record Found"

Scenario: Verify That Admin Should Delete The User Successfully
  Given User is on login page
  And User should enter username "Admin"
  And User should enter password "admin123"
  And User should click on login button
  When User clicks on admin tab
  And User enters Username "Ananya"
  And User selects admin role from dropdown menu "Admin"
  And User enable status "Enabled"
  And User verifies text user should be in Result list
  And User clicks on check box
  And User clicks on delete button
  Then User verifies text "Successfully Deleted"

Scenario Outline: Search The User And Verify The Message Record Found
  Given User is on login page
  And User should enter username "Admin"
  And User should enter password "admin123"
  And User should click on login button
  When User clicks on admin tab
  And User verifies text user should be in Result list
  And User should enter "<username>"
  And User should enter "<userRole>"
  And User should enter "<employeeName>"
  And User should enter "<status>"
  And User should click on search button
  And User verifies text (1)Record Found
  And User verifies username
  Then User clicks on reset tab


  Examples:
    | username      | userRole  | employeeName    | status  |
    | Admin         | Admin     | Paul Collings   | Enable  |
    | Cassidy.Hope  | ESS       | Cassidy Hope    | Enable  |
    | Nina.Patel    | ESS       | Nina Patel      | Enable  |
    | Odis.Adalwin  | Admin     | Odis Adalwin    | Enable  |


