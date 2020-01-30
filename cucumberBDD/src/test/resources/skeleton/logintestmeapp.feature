Feature: Login Test Me App Demo File

  Scenario Outline: Credentials to log in Test Me App
    Given The URL of Test Me App is "http://10.232.237.143:443/TestMeApp/login.htm"
    When User clicks on SignIn button
    And User enters "<UserName>" as UserName
    And User enters "<PassWord>" as PassWord
    Then User clicks on Login

    Examples: 
      | UserName  | PassWord   |
      | rowdy2129 | 2129@rowdy |

