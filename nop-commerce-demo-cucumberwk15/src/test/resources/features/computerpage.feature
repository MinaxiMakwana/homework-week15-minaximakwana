Feature: Computer Page feature

  Scenario: Verify User Should Navigate To Computer Page Successfully
    Given User is on homepage
    When User should click on computer tab
    Then User should see text computer

  Scenario: Verify User Should Navigate To Desktops Page Successfully
    Given User should click on computer tab
    When User should click on desktop link
    Then User should see text Desktop
@onlytest
  Scenario Outline: Verify That User Should Build You Own Computer And Add Them To Cart Successfully
    Given User should click on computer tab
    When User should click on desktop link
    And User should click on product name Build your own computer
    And User should select "<processor>"
    And User should select "<ram>"
    And User should select "<hdd>"
    And User should select "<os>"
    Then User should select "<software>"

  Examples:
  | processor                                         | ram           | hdd                           | os                      | software                   |
  | 2.2 GHz Intel Pentium Dual-Core E2200             | 2 GB          | 320 GB                        | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
  | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]   | 4GB [+$20.00] | 400 GB [+$100.00]             | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
  | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]   | 8GB [+$60.00] | 320 GB                        | Vista Home [+$50.00]    | Total Commander [+$5.00]   |

