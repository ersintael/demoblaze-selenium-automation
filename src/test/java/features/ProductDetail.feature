Feature: Product Detail

  Scenario: Verify add a product to cart
    Given User already on Product Detail page
    When User click on Add to cart button
    Then Product is added into the cart