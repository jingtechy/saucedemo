@cart
Feature: Cart Page Feature


  Scenario Outline: Add product to cart
    Given I go to website "https://www.saucedemo.com/"
    Then I enter "<username>" and "<password>"
    Then I click Login button
    Then I click "Add to cart" button on home page
    Then I click shopping cart badge on home page
    Then I verify "Continue Shopping" button displayed on cart page
    Examples:
      | username        | password     |
      | standard_user   | secret_sauce |
