@smoke
  Feature: user can check the search functionality
    Scenario Outline: search with product name
      Given user clicks on search field
      Then user does something
      Then user types <productName>
      When user clicks on search button
      Then products are shown successfully
      Examples:
        | productName|
        |book   |
        | laptop|
        | nike  |

    Scenario Outline: search with SKU
      Given user clicks on search field1
      Then user does something
      Then user types <SKU>
      Then check results
      Then click on result
      Examples:
        |SKU      |
        |SCI_FAITH|
        |APPLE_CAM|
        |SF_PRO_11|

