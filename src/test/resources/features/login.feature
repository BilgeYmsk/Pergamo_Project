Feature: As a user, I should be able to login with valid credential

  Background:
    Given The user is on the login page
    When  The user click on Ihr Konto Menu

  @login
  Scenario: The user can log in by entering the correct information
    When The user enters valid E-Mail and Password
    Then Verify that the user can be login mit valid Email


#  Scenario Outline: The user can not login with invalid credential
#    Given the user navigates to "My Account" module "Login" tab
#    When the user enters valid "<Email>" and "<Password>" credentials
#    Then the user can see warning message and can not login
#    Examples:
#      | Email     | Password |
     