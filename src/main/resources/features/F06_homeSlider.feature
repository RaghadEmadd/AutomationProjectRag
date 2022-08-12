@smoke
Feature: Viewing sliders on homepage
  Scenario: user can click on first slider for Nokia
    Given users clicks on home screen logo
    Then user clicks on Nokia slider
    Then check if url is changed accordingly

Feature: Viewing slider on homepage
  Scenario: user clicks on second slider for Iphone
    Given users clicks on home screen logo
    Then user clicks on Iphone slider
    Then check if url is changed successfully
