Feature: Login Feature
  Verify if user is able to Login in to the site

  Scenario: Login as a authenticated user
    Given User is on Home Page
    When user enters username and Password
    Then Message displayed Login Successfully
    And User LogOut from the Application
