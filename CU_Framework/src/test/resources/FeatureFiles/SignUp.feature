#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Testing to validate SignUp functionality

 
  Scenario: Testing to validate SignUp functionality
    Given  Go to the homepage of the application "https://www.rentalcars.com/"
    And    Click on Sign In Tab
    And    Click on Create an account link 
    And    Navigate to pop up 
    And    Enter username <name> in the textbox 
    And    Enter Password <Password> in the textbox 
    Then   Submit the form 
      | name  | Password |
      | jagat.mishra@india.com |    12345 | 
