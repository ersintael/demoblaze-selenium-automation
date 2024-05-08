Feature: Home

  Scenario: Verify view product detail
    Given User already on Home page
    When User click on any product
    Then User see product name
    And User see product price
    And User see product description