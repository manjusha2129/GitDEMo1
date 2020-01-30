Feature: Test Me App Feature File

  Scenario: Credentials to register into the application
    Given The URL of Test Me app is "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
    When User clicks on SignUp button
    And User enters "<Username>" as Username
    And User enters "<firstname>" as firstname
    And User enters "<lastname>" as lastname
    And User enters "<pass_word>" as pass_word
    And User enters "<confirmpassword>" as confirmpassword
    And User enters "<gender>" as gender
    And User enters "<email>" as email
    And User enters "<mobilenumber>" as mobilenumber
    And User enters "<DOB>" as DOB
    And User enters "<address>" as address
    And User enters "<securityquestion>" as securityquestion
    And User enters "<answer>" as answer
    Then User clicks on Register button


  Scenario Outline: Credentials to log in Test Me App
    Given The URL of Test Me App is "http://10.232.237.143:443/TestMeApp/fetchcat.htm"
    When User clicks on SignIn button
    And User enters "<UserName>" as UserName
    And User enters "<PassWord>" as PassWord
    And  User clicks on Login
    And User enters a product on SearchProduct "<product>"
    And User clicks on FINDDETAILS
    Then User clicks on ADD TO CART
    
    

    Examples: 
      | UserName  | PassWord   |
      | rowdy2129 | 2129@rowdy |
    