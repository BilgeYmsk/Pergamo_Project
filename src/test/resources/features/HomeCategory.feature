Feature: Home Page Product Category

  Background:
    Given The user is on the login page

  @home
  Scenario Outline: Verification of Home Page Product links
    When The user click the category "Home" in the category.
    And  The user selects the product on the "<category>" of the Home Page
    Then Verify the user should be able to select the "<category>" product on the one subcategory tab

    Examples:
      | category                              |
      | Olivenöl                              |
      | Geschenkartikel                       |
      | Essig                                 |
      | Sirup-Melasse                         |
      | Oliven                                |
      | Angebote                              |
#      | Natur -Honig                          |
#      org.openqa.selenium.ElementNotInteractableException: element not interactable
      | Neue Produkte                         |
      | Fleisch Produkte                      |
      | Milchprodukte                         |
#      | Süße Brotaufstriche                   |
#  org.openqa.selenium.ElementNotInteractableException: element not interactable
#      | Wabenhonig                            |
#      expected:<[Wabenh]onig> but was:<[H]onig>
      | getrocknete Gemüsen                   |
      | Tomatenmark / Paprikamark             |
#      | Premium Baklava                       |
#      org.openqa.selenium.ElementNotInteractableException: element not interactable
      | Datteln Sorten                        |
      | Traditionelle Türkische Spezialitäten |
      | Nusssorrten                           |
#      | getrocknete Früchte                   |
#      org.openqa.selenium.ElementNotInteractableException: element not interactable
      | Tee und Kaffe Sorten                  |
      | Gewürze                               |
      | Bestseller                            |
      | Vorteilspaket                         |
      | Nuss mit Schale                       |
      | Nuss ohne Schale                      |
#      | Traditionelle Suppenmischung          |
#      org.openqa.selenium.ElementNotInteractableException: element not interactable
      | Granatapfelsirup                      |
      | Glutenfrei                            |

