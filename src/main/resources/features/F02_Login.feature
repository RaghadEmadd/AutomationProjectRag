@smoke
  Feature: F02_Login | users could use login functionality to use their accounts
    Scenario: user could login with valid email and password
      Given user go to login page
      Then user login with valid email and valid password
      And user press on login button
      Then user login to the system successfully