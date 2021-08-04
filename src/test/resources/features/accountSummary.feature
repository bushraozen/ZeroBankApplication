Feature: Account summary

  @accountSummary
  Scenario: Verify "Zero - Account Summary" page
    Given  user is on the landing page
    And user should be able to see title "Zero - Account Summary"
    And user should be able to see
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |
    Then user should be able to see under Credit Accounts table Account, Credit Card and Balance columns
      | Account     |
      | Credit Card |
      | Balance     |
