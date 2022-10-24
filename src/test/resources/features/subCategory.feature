Feature: Select one product

  Background:
    Given The user is on the login page

  @shop
  Scenario Outline: The user should be able to select a category.
    When The user selects the category "Shop" in the category..
    And  The user selects the product "<subcategory>" on the one subcategory tab
    Then Verify the user should be able to select the "<subcategory>" product on the one subcategory tab
    And  the user selects the "<product>" on the subcategory
    Then Verify the user should be able to see the selected "<productName>"

    Examples:
      | subcategory                           | product                                           | productName                                            |
      | Angebote                              | Ajwa Datteln aus Medina Naturbelassen...          | Ajwa Datteln Aus Medina Naturbelassen                  |
      | Olivenöl                              | Lychnos Extra Virgin Olivenöl 5lt...              | Lychnos Extra Virgin Olivenöl 5lt                      |
      | Milchprodukte                         | Antep Käse mit Schwarzkümmel oder ohne Schw...    | Antep Käse Mit Schwarzkümmel Oder Ohne Schwarzkümmel   |
      | Fleisch Produkte                      | 2 x 100g Öz-Kayseri Rinderschinken nach türk...   | 2 X 100g Öz-Kayseri Rinderschinken Nach Türkischer Art |
      | Sirup-Melasse                         | Fersan Granatapfelsirup 100 % Natürlich 330 m...  | Fersan Granatapfelsirup 100 % Natürlich 330 Ml         |
      | Essig                                 | Burkhardt Aceto Balsamico di Modena IGP 6% Sä...  | Burkhardt Aceto Balsamico Di Modena IGP 6% Säure 500ml |
      | Datteln Sorten                        | Ajwa Datteln aus Medina Naturbelassen...          | Ajwa Datteln Aus Medina Naturbelassen                  |
#      | Getrocknete Früchte                   | Berg-Feigen 100% Natürlich...                     | Berg-Feigen 100% Natürlich                             |
#      getrockene kismi otomasyonu bozuyor. Expected :Getrocknete Früchte Actual   :getrocknete Früchte  bas harfleri büyük kücük farki oldugu icin
      | Neue Produkte                         | Avar Wildblumen-Kammhonig 100% Natürlich...       | Avar Wildblumen-Kammhonig 100% Natürlich               |
      | Premium Baklava                       | Baklava-Vorteilspack...                           | Baklava-Vorteilspack                                   |
      | Sesampaste und Malasse                | Koska Sesampaste 600g...                          | Koska Sesampaste 600g                                  |
      | Tee und Kaffe Sorten                  | 1 KG Goran Mevlana Premium Ceylon-Teemischung...  | 1 KG Goran Mevlana Premium Ceylon-Teemischung          |
      | Traditionelle Türkische Spezialitäten | Atom Cezerye mit Pistazien, Walnuss und Haseln... | Atom Cezerye Mit Pistazien, Walnuss Und Haselnuss      |
      | Türkische Desserts                    | Halva mit Vanille, Kakao und Pistazien-Geschma... | Halva Mit Vanille, Kakao Und Pistazien-Geschmack 400g  |









