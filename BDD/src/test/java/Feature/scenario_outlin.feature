Feature: Login Action

  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home Page
    When User is enetering "<username>" and "<password>"
    Then Message displayed Login Successfully
    And User LogOut from the Application

    Examples: 
      | username     | password   |
      | Karthika2326 | eaxilm@226 |
      | Karthika2326 | eaxilm@226 |
