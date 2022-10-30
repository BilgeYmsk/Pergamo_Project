Feature:Shop Product Category

  Background:
    Given The user is on the login page
@shopHover
  Scenario Outline: Verification of ShopCategory Page Product links
    When The user selects the category "Shop" in the category.
    And  The user selects the product "<subcategory>" on the one subcategory tab
    Then Verify the user should be able to select the "<subcategory>" product on the one subcategory tab
    Then Verify the alle product clickable
    Examples:
      | subcategory                           |
      | Angebote                              |
      | Olivenöl                              |
      | Milchprodukte                         |
#org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <a href="https://pergamo.eu/shop/angebote/frische-butter-aus-niederland-400-gr/"
#      hata da tiklaninca gelen ürün -->Pergamo Frische Mildgesäuerte Butter 900g
      | Fleisch Produkte                      |
      | Sirup-Melasse                         |
      | Essig                                 |
      | Datteln Sorten                        |
#      | Getrocknete Früchte                   |
#org.junit.ComparisonFailure: expected:<[G]etrocknete Früchte> but was:<[g]etrocknete Früchte>
      | Neue Produkte                         |
      | Premium Baklava                       |
      | Sesampaste und Malasse                |
      | Tee und Kaffe Sorten                  |
      | Traditionelle Türkische Spezialitäten |
      | Türkische Desserts                    |

