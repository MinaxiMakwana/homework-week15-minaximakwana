Feature: Top Menu test feature

Scenario: Verify User Should Navigate To Desktops Page Successfully
  Given user should Mouse hover on Desktops Tab and click
  When User should call selectMenu method and pass the menu "Show All Desktops"
  Then User should Verify the text Desktops

Scenario: Verify User Should Navigate To Laptops And Notebooks Page Successfully
  Given User should Mouse hover on Laptops & Notebooks Tab and click
  When User should call select Menu method and pass the menu "Show All Laptops & Notebooks"
  Then User should verify the text Laptops & Notebooks

Scenario: Verify User Should Navigate To Components Page Successfully
  Given User should Mouse hover on Components Tab and click
  When User should call selectMenu method and pass the menu "Show All Components"
  Then User should verify the text ‘Components’



