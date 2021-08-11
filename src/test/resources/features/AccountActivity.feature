Feature: Account Activity

  @accountActivity
  Scenario: Verify "Zero - Account Activity " page


    Given user click on "Account Activity"
    When user should be able to see the title "Zero - Account Activity"
    And user on drop down default option should be "Savings"
    Then drop down should have the following options
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |
    And Transactions table should have column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |