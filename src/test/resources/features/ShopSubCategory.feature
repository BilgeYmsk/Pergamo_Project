Feature: Shop SubCategory Product Category

  Background:
    Given The user is on the login page

  @home
  Scenario Outline: Verification of Shop SubCategory Product links
    When The user selects the category "Home" in the SubCategory
    And  The user selects the product on the "<SubCategory>" of the Home Page

    Examples:
      | SubCategory                           |
      | Bestseller                            |
      | Brotaufstriche                        |
      | Datteln Sorten                        |
      | Eingelegte Gemüse                     |
      | getrocknete Früchte                   |
      | getrocknete Gemüsen                   |
      | Gewürze                               |
      | Glutenfrei                            |
      | Granatapfelsirup                      |
      | Hülsenfrüchte                         |
      | Nuss mit Schale                       |
      | Nuss ohne Schale                      |
      | Nusssorrten                           |
      | Premium Baklava                       |
      | Säfte                                 |
      | Sesampaste und Malasse                |
      | Tee und Kaffe Sorten                  |
      | Tiefkühlbackware                      |
      | Tomatenmark / Paprikamark             |
      | Traditionelle Suppenmischung          |
      | Traditionelle Türkische Spezialitäten |
      | Türkische Desserts                    |
      | Vorteilspaket                         |
      | Angebote                              |
      | Neue Produkte                         |
      | Olivenöl                              |
      | Natürliche Öle                        |
      | Oliven                                |
      | Fleisch Produkte                      |
      | Honig                                 |
      | Milchprodukte                         |
      | Kosmetik                              |
      | Geschenkartikel                       |
      | Essig                                 |
      | Sirup-Melasse                         |