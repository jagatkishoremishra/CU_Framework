Feature: Testing to validate SignIn functionality
  Scenario: Testing to validate SignIn functionality
    Given  Go to the homepage of the application "https://www.rentalcars.com/"
    And    Click on Sign In Tab
    And    Enter username <name> in the textbox 
    And    Enter Password <Password> in the textbox 
    Then   Submit the form 
      | name  | Password |
      | jagatkishoremishramishra@hotmail.com |    12345 | 
