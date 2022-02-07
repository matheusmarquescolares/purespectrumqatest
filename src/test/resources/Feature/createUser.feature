@Regression
Feature: createUser
 Users should be able to create a new User

  Scenario: TC001 - SMOKE - New User
      Given I open Chrome and go to "https://demoqa.com/login"
      When I click on New User
      And I write First Name "name"
      And I write Last Name "name"
      And I write User Name "name"
      And I write Password "Name@123"
      And I click on Captcha
      And I click on Register
      Then I validate PopUp text is "User Register Successfully."

  Scenario: TC002 - SMOKE - New User that already exists
      Given I open Chrome and go to "https://demoqa.com/login"
      When I click on New User
      And I write First Name "name"
      And I write Last Name "name"
      And I write User Name "name"
      And I write Password "Name@123"
      And I click on Captcha
      And I click on Register
      Then I validate alert text is "User exists!"

  Scenario: TC003 - SMOKE - User with Password that does not attend password policies (just letters)
      Given I open Chrome and go to "https://demoqa.com/login"
      When I click on New User
      And I write First Name "name"
      And I write Last Name "name"
      And I write User Name "name123"
      And I write Password "name"
      And I click on Captcha
      And I click on Register
      Then I validate alert text is "Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be"

  Scenario: TC004 - SMOKE - User with Password that does not attend password policies (just numbers)
      Given I open Chrome and go to "https://demoqa.com/login"
      When I click on New User
      And I write First Name "name"
      And I write Last Name "name"
      And I write User Name "name1234"
      And I write Password "1234"
      And I click on Captcha
      And I click on Register
      Then I validate alert text is "Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be"

  Scenario: TC005 - SMOKE - User with Password that does not attend password policies (just special Characters)
      Given I open Chrome and go to "https://demoqa.com/login"
      When I click on New User
      And I write First Name "name"
      And I write Last Name "name"
      And I write User Name "name12345"
      And I write Password "!@#$%"
      And I click on Captcha
      And I click on Register
      Then I validate alert text is "Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be"

  Scenario: TC006 - SMOKE - User with Password that does not attend password policies (just letters and numbers)
      Given I open Chrome and go to "https://demoqa.com/login"
      When I click on New User
      And I write First Name "name"
      And I write Last Name "name"
      And I write User Name "name123456"
      And I write Password "name123"
      And I click on Captcha
      And I click on Register
      Then I validate alert text is "Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be"

  Scenario: TC007 - User with Password that does not attend password policies (just letters and special characters)
      Given I open Chrome and go to "https://demoqa.com/login"
      When I click on New User
      And I write First Name "name"
      And I write Last Name "name"
      And I write User Name "name1234567"
      And I write Password "name!@#"
      And I click on Captcha
      And I click on Register
      Then I validate alert text is "Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be"

  Scenario: TC008 - User with Password that does not attend password policies (just numbers and special characters)
      Given I open Chrome and go to "https://demoqa.com/login"
      When I click on New User
      And I write First Name "name"
      And I write Last Name "name"
      And I write User Name "name1234568"
      And I write Password "1234!@#"
      And I click on Captcha
      And I click on Register
      Then I validate alert text is "Passwords must have at least one non alphanumeric character, one digit ('0'-'9'), one uppercase ('A'-'Z'), one lowercase ('a'-'z'), one special character and Password must be"

  Scenario: DE001 - DEFECT - User with BLANK User Name
      Given I open Chrome and go to "https://demoqa.com/login"
      When I click on New User
      And I write First Name "name"
      And I write Last Name "name"
      And I write User Name "   "
      And I write Password "Name@123"
      And I click on Captcha
      And I click on Register
      Then I validate alert text is "User Name can not be blank."

  Scenario: DE002 - DEFECT - User with BLANK First Name
        Given I open Chrome and go to "https://demoqa.com/login"
        When I click on New User
        And I write First Name "    "
        And I write Last Name "name"
        And I write User Name "name6"
        And I write Password "Name@123"
        And I click on Captcha
        And I click on Register
        Then I validate alert text is "First Name can not be blank."

  Scenario: DE003 - DEFECT - User with BLANK Last Name
          Given I open Chrome and go to "https://demoqa.com/login"
          When I click on New User
          And I write First Name "name"
          And I write Last Name "    "
          And I write User Name "name7"
          And I write Password "Name@123"
          And I click on Captcha
          And I click on Register
          Then I validate alert text is "Last Name can not be blank."