Feature: Shop SubCategory Product Category

  Background:
    Given The user is on the login page

  @shopSub
  Scenario Outline: Verification of Shop SubCategory Product links
    When The user selects the category "Shop" in the SubCategory
    And  The user selects the product on the "<subcategory>" of the Kategorien
    Then Verify the user should be able to select the "<subcategory>" product on the one subcategory tab
    Then Verify the alle product clickable

    Examples:
      | subcategory                           |
      | Angebote                              |
      | Bestseller                            |
#      | Brotaufstriche                        |
      | Datteln Sorten                        |
      | Eingelegte Gemüse                     |
      | Essig                                 |
      | Fleisch Produkte                      |
      | Geschenkartikel                       |
      | getrocknete Früchte                   |
      | getrocknete Gemüsen                   |
      | Gewürze                               |
      | Glutenfrei                            |
      | Granatapfelsirup                      |
#      | Honig                                 |
      | Hülsenfrüchte                         |
      | Kosmetik                              |
      | Milchprodukte                         |
      | Natürliche Öle                        |
      | Neue Produkte                         |
      | Nuss mit Schale                       |
      | Nuss ohne Schale                      |
      | Nusssorrten                           |
#      | Oliven                                |
      | Olivenöl                              |
      | Premium Baklava                       |
      | Säfte                                 |
      | Sesampaste und Malasse                |
      | Sirup-Melasse                         |
      | Tee und Kaffe Sorten                  |
      | Tiefkühlbackware                      |
      | Tomatenmark / Paprikamark             |
      | Traditionelle Suppenmischung          |
      | Traditionelle Türkische Spezialitäten |
      | Türkische Desserts                    |
      | Vorteilspaket                         |











