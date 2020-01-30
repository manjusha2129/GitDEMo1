Feature: Payment gateaway in test me app

  Scenario: Credentials to log in TestMeApp
    Given The URL of TestMeApp is "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
    When User clicks on Sign In button
    And User enters "<User_Name>" as User_Name
    And User enters "<Pass_Word>" as Pass_Word
    And User clicks on Login_button
    And User enters a product on Search_Product "<product>"
    And User clicks on FIND_DETAILS
    And User clicks on Add to cart
    And User proceed to payment
    Then User cant see the proceed to pay button
