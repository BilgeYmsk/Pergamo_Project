Feature: Home Page Product Category

  Background:
    Given The user is on the login page

  @home
  Scenario Outline: Verification of Home Page Product links
    When The user selects the category "Home" in the category..
    And  The user selects the product on the "<category>" of the Home Page

    Examples:
      | category |
      | Olivenöl |
