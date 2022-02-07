# Edit User
# Tags: functional, user, toolsqa, login
@Regression
    
Feature: Edit User
    
Scenario: TC001 - SMOKE - Login and Add a Book
    Given I open Chrome and go to "https://demoqa.com/login"
    When I write User Name "name"
    And I write Password "Name@123"
    And I click on Login
    And I click on Go To Book Store
    And I click on Git Pocket Book
    And I click on Add To Your Collection
    Then I validate PopUp text is "Book added to your collection."

Scenario: TC002 - SMOKE - Login and Add another Book
    Given I open Chrome and go to "https://demoqa.com/login"
    When I write User Name "name"
    And I write Password "Name@123"
    And I click on Login
    And I click on Go To Book Store
    And I click on Learning Javascript Book
    And I click on Add To Your Collection
    Then I validate PopUp text is "Book added to your collection."

Scenario: TC003 - SMOKE - Login and Add a Book that is already added
    Given I open Chrome and go to "https://demoqa.com/login"
    When I write User Name "name"
    And I write Password "Name@123"
    And I click on Login
    And I click on Go To Book Store
    And I click on Git Pocket Book
    And I click on Add To Your Collection
    Then I validate PopUp text is "Book already present in the your collection!"

Scenario: TC004 - SMOKE - Login and Remove a Book from Collection
    Given I open Chrome and go to "https://demoqa.com/login"
    When I write User Name "name"
    And I write Password "Name@123"
    And I click on Login
    And I click on Remove book
    And I click on Ok to confirm
    Then I validate PopUp text is "Book deleted."

Scenario: TC005 - SMOKE - Login and Remove a Book from Collection
    Given ...