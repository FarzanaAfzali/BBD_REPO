@Smoke
Feature: Validating Tek Insurance Application Title

  @UserStory_1
  Scenario: Navigate to the Tek Insurance Application and Validate the application title as "Tek Insurance Service"
    Then Validate application's title as " Tek Insurance Service "

  @UserStory_2
  Scenario: By Navigating and opening Tek Insurance Service, page's title should be "TEK Insurance Portal".
    Then Validate application's header title as " TEK Insurance Portal "
    And Validate Login Section header title as "Customer Service Portal"

