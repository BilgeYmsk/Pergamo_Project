Feature: Select one product

  Background:
    Given Der Benutzer befindet sich auf der Anmeldeseite

  @shop
  Scenario: Der Benutzer sollte in der Lage sein, eine Kategorie auszuwählen.
    When Der Benutzer wählt die Kategorie "Shop" in der Kategorie aus.
    And  Der Benutzer wählt das Produkt "Olivenöl" auf dem einen Unterkategorie-Tab aus
    Then Stellen Sie sicher, dass der Benutzer in der Lage sein sollte, das Produkt "Olivenöl" auf dem einen Unterkategorie-Tab auszuwählen

#    Examples:
#      | subcategory      | category          |
#      | Angebote         | Home              |
#      | Olivenöl         | Shop              |
#      | Oliven           | Geschenkartikel   |
#      | Honig            | Aktuelle Angebote |
#      | Milchprodukte    | B2B Angebot       |
#      | Fleisch Produkte | Kontakt           |
#      | Sirup-Melasse    | Anmelden          |
#      | Essig            | Über uns          |
#
##      | subcategory      |
#      | Angebote         |
#      | Olivenöl         |
#      | Oliven           |
#      | Honig            |
#      | Milchprodukte    |
#      | Fleisch Produkte |
#      | Sirup-Melasse    |
#      | Essig            |



