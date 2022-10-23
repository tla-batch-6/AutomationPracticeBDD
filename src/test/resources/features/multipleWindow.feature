Feature: Multiple Window page tests

  Background: Open Multiple Window page
    Given I open url of homepage
    When I click nav button "Multiple Window"

  @US9001
  Scenario: Verify social media buttons are enabled
    Then Verify link text "Launch TLA" is displayed
    Then Verify link text "Launch Google" is displayed
    Then Verify link text "Launch Facebook" is displayed

  @US9001b
  Scenario: Verify social media buttons are enabled 2
    Then Verify following link texts are displayed:
      | Launch TLA      |
      | Launch Google   |
      | Launch Facebook |
