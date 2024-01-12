@login
  Feature: Login Page Feature

    Scenario Outline: Log in saucedemo website
      Given I go to website "https://www.saucedemo.com/"
      And I enter "<username>" and "<password>"
      Then I click Login button
      Examples:
      | username        | password     |
      | standard_user   | secret_sauce |


