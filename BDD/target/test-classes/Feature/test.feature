Feature: Login Feature
  Verify if user is able to Login in to the site

  Background: 
    Given User is on Home Page

  @web
  Scenario Outline: Login as a authenticated user
    When User is enetering "<username>" and "<password>"
    Then Message displayed Login Successfully
    And User LogOut from the Application

    Examples: 
      | username     | password   |
      | Karthika2326 | eaxilm@226 |

  @signin
  Scenario Outline: Login as a unauthenticated user
    When User is enetering "<username>" and "<password>"
    Then Message displayed Login Unsuccessfull

    Examples: 
      | username     | password  |
      | Karthika2326 | eaxil@226 |
