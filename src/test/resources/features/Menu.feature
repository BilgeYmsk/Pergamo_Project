Feature: WebSite Menu

  Background:
    Given The user is on the login page


  Scenario: WebSite Verify
    When All links on the Website should be able be verified
    Then All image on the Website should be able be verified


  @smoke
  Scenario Outline: Product Link Verify
    When The user selects the category "Shop" in the category..
    And  The user selects the product "<subcategory>" on the one subcategory tab
    Then Verify the user should be able to select the "<subcategory>" product on the one subcategory tab
    Then Verify the alle product clickable
    Examples:
      | subcategory   |
      | Angebote      |
      | Olivenöl      |
#      | Milchprodukte |
#      | Fleisch Produkte |
#      | Sirup-Melasse |
#      | Essig                                 |
#      | Datteln Sorten                        |
#      | Getrocknete Früchte                   |
#      | Neue Produkte                         |
#      | Premium Baklava                       |
#      | Sesampaste und Malasse                |
#      | Tee und Kaffe Sorten                  |
#      | Traditionelle Türkische Spezialitäten |
#      | Türkische Desserts                    |

