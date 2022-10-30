Feature: Buy one product

  Background:
    Given The user is on the login page

  @shop
  Scenario Outline: The user should be able to buy a product.
    When The user selects the category "Shop" in the SubCategory
    And  The user selects the product "<subcategory>" on the one subcategory tab and choose the "Salzige Brotaufstriche"
    And  The user select the "Testprodukt – Bitte nicht kaufen!..."
    And  The user add the product in shopping bag
    And  The user click the shopping bag and see selected product in the shopping bag
    And  the user click the Kasse button
    When The user enters valid "<firstname>" , "<lastname>" ,"<companyname>", "<address1>", "<address2>","<postcode>","<city>", "<telephone>" ,"<email>"
    Then the user should be able to product name "Testprodukt - Bitte nicht kaufen!..."  and total preis in the Rechnung
    Examples:
      | subcategory    |
      | Brotaufstriche |