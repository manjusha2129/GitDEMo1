Feature: Demo Web Shop feature file

  @valid
  Scenario Outline: Valid Login For Demo Web Shop for Admin user
    Given The URL of the Demo Web Shop "http://demowebshop.tricentis.com/login"
    When User enters "<username>" as username
    And User enters "<password>" as password
    And User clicks on Login button
    Then User is in a valid login page

    Examples: 
      | username          | password |
      | askmail@email.com | abc123   |
      | askmail@ymail.com | abc123   |
      | askmail@gmail.com | abc123   |
