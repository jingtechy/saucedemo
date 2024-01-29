@product
Feature: Login Page Feature


  Scenario Outline: Navigate to product page
    Given I go to website "https://www.saucedemo.com/"
    Then I enter "<username>" and "<password>"
    Then I click Login button
    Then I click "Sauce Labs Backpack" product on home page
    Examples:
      | username        | password     |
      | standard_user   | secret_sauce |