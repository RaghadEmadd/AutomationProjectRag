@smoke
  Feature: Register| users can register with new credentials
    Scenario: guest user could register with valid data successfully
      Given user go to register page
      When user selects gender type
      Then user types his first name
      And  user types his last name
      Then user selects a day
      Then user selects a month
      Then user selects a year
      Then user enters a valid email
      Then user scrolls down
      Then user enters a company name
      Then user enters a valid password
      Then user reenters the same password
      Then user clicks on register button
      Then registration should be successful