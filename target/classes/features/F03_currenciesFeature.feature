@smoke
  Feature: F03_currenciesFeature | user can change currencies anytime
    Scenario: user can change currency of displayed products
      Given User Select “Euro” from currency dropdown list
      Then  User scrolls down to view products
      Then User can see the prices with the new selected currency successfully
