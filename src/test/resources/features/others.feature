Feature: Others page tests

  Scenario: US2001 - Disabled button is working as expected
    Given I open url of homepage
    When I click a button Others
    Then Verify buttons is disabled