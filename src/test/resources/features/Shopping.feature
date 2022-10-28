Feature: Buy one product

  Background:
    Given The user is on the login page

  @shop
  Scenario Outline: The user should be able to buy a product.
    When The user selects the category "Shop" in the category..
    And  The user selects the product "<subcategory>" on the one subcategory tab
    Then Verify the user should be able to select the "<subcategory>" product on the one subcategory tab
    And  the user selects the "<product>" on the subcategory
    Then Verify the user should be able to see the selected "<productName>"

    When The user enters valid "<firstname>" , "<lastname>" , "<email>", "<telephone>" ,"<password>" , "<confirm>"

    Examples:
      | subcategory | product                                  | productName                           |
      | Angebote    | Ajwa Datteln aus Medina Naturbelassen... | Ajwa Datteln Aus Medina Naturbelassen