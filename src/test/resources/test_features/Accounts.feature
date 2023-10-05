@Regression
Feature: Account Section Verification

  Background:Login
    And Type in the username "supervisor"
    And Type in the password "tek_supervisor"
    And click on the login button

  @UserStory_6
  Scenario Outline: Verification of accounts and rows in account section
    Then click on the Account located at the left side panel
    And Validate the rows are 10
    Then click on item per page and change it to "<itemPerPage>"

    Examples:
    |itemPerPage|
    |25|
    |5|
    |100|
    |10|

  @UserStory_8
  Scenario: Validate Account Table header
    Then click on the Account located at the left side panel
    Then Validate Accounts table headers
      | Delete | Email | Full Name | Gender | Martial Status | Employement Status | Date of Birth | Account Detail |




