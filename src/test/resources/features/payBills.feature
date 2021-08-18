Feature: Pay Bill

  @wip
  Scenario: Paying bills


    Given user clicks on Pay Bills
    And title should be "Zero - Pay Bills"
    When user clicks on Payee, Account, Amount, Date, Description
    Then user can see the payment was successfully submitted