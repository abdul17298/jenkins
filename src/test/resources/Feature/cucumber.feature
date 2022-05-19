Feature: Insta functionality testing

  Scenario: login function testing
    Given user is on insta page
    When user should enter username and password
    Then user should click login
    And user is on main page
