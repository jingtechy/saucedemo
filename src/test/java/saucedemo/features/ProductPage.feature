@product
Feature: Product Page Feature


  Scenario Outline: Navigate to product page
    Given I go to website "https://www.saucedemo.com/"
    Then I enter "<username>" and "<password>"
    Then I click Login button
    Then I click "<product>" on home page
    Examples:
      | username        | password     | product                 |
      | standard_user   | secret_sauce | Sauce Labs Backpack     |
      | standard_user   | secret_sauce | Sauce Labs Bike Light   |
      | standard_user   | secret_sauce | Sauce Labs Bolt T-Shirt |