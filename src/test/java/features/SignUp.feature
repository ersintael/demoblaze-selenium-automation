Feature: Signup

  @Signup
  Scenario: Verify sign up with valid credential
    Given User already on Home page
    And User click Sign Up menu
    When User input valid username
    And User input valid password
    And User click on Sign up button
    Then User see success sign up pop-up