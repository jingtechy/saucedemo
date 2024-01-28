@about
Feature: About Page Feature

  Scenario Outline: Navigate to About page
    Given I go to website "https://www.saucedemo.com/"
    And I enter "<username>" and "<password>"
    Then I click Login button
    Then I click "Open Menu" button on home page
    Then I click "About" menu on home page
    Then I verify about page title is "Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing"
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |




