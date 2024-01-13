@home
Feature: Home Page Feature


  Scenario Outline: Home page validations
    Given I go to website "https://www.saucedemo.com/"
    And I enter "<username>" and "<password>"
    Then I click Login button
    Then I verify home page title is "Swag Labs"
    And I verify Products title displayed on home page
    And I verify "Sauce Labs Backpack" displayed on home page
    And I verify "Sauce Labs Bike Light" displayed on home page
    And I verify "Sauce Labs Bolt T-Shirt" displayed on home page
    And I verify "Sauce Labs Fleece Jacket" displayed on home page
    And I verify "Sauce Labs Onesie" displayed on home page
    And I verify "Test.allTheThings() T-Shirt (Red)" displayed on home page
    Then I click product sort selector on home page
    Then I verify the following products sort options are displayed
       | Options             |
       | Name (A to Z)       |
       | Name (Z to A)       |
       | Price (low to high) |
       | Price (high to low) |
    Then I click "Open Menu" button on home page
    Then I verify the following menus are displayed
       | Menus         |
       | All Items       |
       | About           |
       | Logout          |
       | Reset App State |
    Examples:
      | username        | password     |
      | standard_user   | secret_sauce |
