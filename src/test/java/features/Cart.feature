Feature: Cart

  Scenario: Verify submit a purchase order
    Given User already on Cart page
    And User click on Place Order button
    When User see Payment pop up
    And User input valid data
    And User click on Purchase button
    Then User see success purchase pop-up