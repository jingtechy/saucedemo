@login
  Feature: Login Page Feature

    @login
    Scenario Outline: Log in saucedemo website
      Given I go to website "https://www.saucedemo.com/"
      And I verify "Swag Labs" display on login page
      Then I enter "<username>" and "<password>"
      Then I click Login button
      Examples:
      | username        | password     |
      | standard_user   | secret_sauce |

    @logout
    Scenario Outline: Log out saucedemo website
      Given I go to website "https://www.saucedemo.com/"
      And I enter "<username>" and "<password>"
      Then I click Login button
      Then I click "Open Menu" button on home page
      Then I click "Logout" menu on home page
      Then I verify "Swag Labs" display on login page
      Examples:
        | username      | password     |
        | standard_user | secret_sauce |