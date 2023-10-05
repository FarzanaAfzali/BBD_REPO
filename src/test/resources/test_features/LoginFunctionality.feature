@Regression
Feature: Validate Login For Tek Insurance Application

  @UserStory_3
  Scenario: User should be able to login with valid username and password
    Then Validate login button is disabled
    And Type in the username "supervisor"
    And Type in the password "tek_supervisor"
    And Validate login button is enabled
    And click on the login button
    And Validate login by account's username "Supervisor"



    @UserStory_4
    Scenario Outline: Negative Testing for Login functionality
      And Type in the username "<username>"
      And Type in the password "<password>"
      And click on the login button
      Then Validate the errorMassage"<errorMassage>"

      Examples:
      |username|password|errorMassage|
      |wrongUsername|tek_supervisor|User not found|
      |supervisor|wrongPassword|Password Not Matched|
