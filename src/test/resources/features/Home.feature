Feature: Home Page Product Category

  Background:
    Given The user is on the login page

  @home
  Scenario Outline: Verification of Home Page Product links
    When The user selects the category "Home" in the category..
    And  The user selects the product on the "<category>" of the Home Page

    Examples:
      | category                              |
      | Olivenöl                              |
      | Geschenkartikel                       |
      | Essig                                 |
      | Sirup-Melasse                         |
      | Oliven                                |
      | Angebote                              |
      | Natur -Honig                          |
      | Neue Produkte                         |
      | Fleisch Produkte                      |
      | Milchprodukte                         |
      | Süße Brotaufstriche                   |
      | Wabenhonig                            |
      | getrocknete Gemüsen                   |
      | Tomatenmark / Paprikamark             |
      | Premium Baklava                       |
      | Datteln Sorten                        |
      | Traditionelle Türkische Spezialitäten |
      | Nusssorrten                           |
      | getrocknete Früchte                   |
      | Tee und Kaffe Sorten                  |
      | Gewürze                               |
      | Bestseller                            |
      | Vorteilspaket                         |
      | Nuss mit Schale                       |
      | Nuss ohne Schale                      |
      | Traditionelle Suppenmischung          |
      | Granatapfelsirup                      |
      | Glutenfrei                            |

