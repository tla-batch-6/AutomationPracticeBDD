Feature: User Mgt page scenarios

  @US4001 @regression
  Scenario: User-Mgt page title test
    Given I open url of homepage
    When I click a button User-Mgt
    Then Verify title of the page is Register New User