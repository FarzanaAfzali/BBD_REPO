Feature: Validate Plan Section

  Background: Login
    And Type in the username "supervisor"
    And Type in the password "tek_supervisor"
    And click on the login button
    When After login click on plans

  @UserStory_5
  Scenario: After login Validate that plan section is available with table in it
    Then Section title should be as "Plans"
    And Section table should contain 4
    And Validate all plans are Valid

  @UserStory_7
  Scenario: Validate Plan Code headers
    When Plan Code header Sections should be as
      |Plan Type|Base Price|Date Expire|Created By|Date Created|Plan Expired|