Feature: As a user, I should be able to login with valid credential

  Background:
    Given The user is on the login page
    When  The user click on Ihr Konto Menu


  Scenario: The user can log in by entering the correct information
    When The user enters valid E-Mail and Passwort
    Then Verify the user should be able to login

#  Scenario Outline: The user can not login with invalid credential
#    Given the user navigates to "My Account" module "Login" tab
#    When the user enters valid "<Email>" and "<Password>" credentials
#    Then the user can see warning message and can not login
#    Examples:
#      | Email     | Password |
     