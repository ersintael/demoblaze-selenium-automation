Feature: Login

  @Login
  Scenario: Verify login with valid credential
    Given User already on Home page
    And User click Log In menu
    When User input valid login username
    And User input valid login password
    And User click on Log In button
    Then User see username on Navbar
    And User see Log out menu on Navbar