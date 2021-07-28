Feature: Login the application


  Scenario: Login as a user
    Given user on the main page
    When user click on sign in button
    Then user enters username "username"
    And user enters password "password"
    And user click the sign in button
    And user click the advanced and proceed button
    Then user able to see the "Account Summary" page

  @wip
    Scenario: Login with wrong credentials
      Given user on the main page
      When user click on sign in button
      Then user enters username "username"
      And user enters password " "
      And user click the sign in button
      Then user able to see the Login and or password are wrong page
