# Delete User
# Tags: functional, user, toolsqa, delete
@Regression
    
Feature: Delete User
    
Scenario: TC001 - SMOKE - Login and Delete Account
    Given I open Chrome and go to "https://demoqa.com/login"
    When I write User Name "name"
    And I write Password "Name@123"
    And I click on Login
    And I click on Delete Account
    And I click on Ok to confirm
    Then I validate PopUp text is "User Deleted."

Scenario: TC002 - SMOKE - Login with an deleted Account
    Given I open Chrome and go to "https://demoqa.com/login"
    When I write User Name "name"
    And I write Password "Name@123"
    And I click on Login
    Then I validate alert text is "Invalid username or password!"