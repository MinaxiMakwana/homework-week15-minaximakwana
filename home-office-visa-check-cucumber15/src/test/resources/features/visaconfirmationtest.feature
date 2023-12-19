Feature: Visa confirmation test feature file

  Scenario: An Australian Coming To UK For Tourism
    Given User clicks on start button
    When User should Select a Nationality 'Australia'
    And User Clicks on Continue button
    And User should Select reason Tourism
    And User Clicks on Continue button
    Then User verifies verify result 'You will not need a visa to come to the UK'

  Scenario: A Chilean Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    Given User clicks on start button
    When User should Select a Nationality 'Chile'
    And User Clicks on Continue button
    And User should Select reason Work, academic visit or business
    And User Clicks on Continue button
    And User should Select intended to stay for longer than 6 months
    And User Clicks on Continue button
    And User Selects have planning to work for Health and care professional
    And User Clicks on Continue button
    Then User verifies verify result 'You need a visa to work in health and care'

  Scenario: A Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article10 Or 20Card
    Given User clicks on start button
    When User should Select a Nationality 'Colombia'
    And User Clicks on Continue button
    And User should Select reason Join partner or family for a long stay
    And User Clicks on Continue button
    And User should My partner of family member have uk immigration status 'yes'
    And User Clicks on Continue button
    Then User verifies verify result 'You’ll need a visa to join your family or partner in the UK'

  Scenario Outline: Verify the following country available in country dropdown list
    Given User should be on home page
    When User clicks on start button
    Then User can see following "<countries>" into dropdown

    Examples:
      |countries|
      |albania|
      |bhutan|
      |british-protected-person|
      |haiti|
      |kazakhstan|
      |mozambique|
      |norway|
      |portugal|
      |russia|
      |zambia|
