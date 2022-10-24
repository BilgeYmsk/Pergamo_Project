@register
Feature:Register Function

  Background:
    Given The user is on the login page
    When  The user click on Ihr Konto Menu


  Scenario:Register Function_positive scenario
    When The user enters valid "sdet.praktikum7@gmail.com" and "Test1234!()TEST."
    And  The user click on Privacy Policy Box
    And  The user click on Registieren button
    Then Verify that the user can be register mit valid Email "sdet.praktikum7"


  Scenario Outline:Register Function_negative scenario
    When The user enters invalid "<email>" , "<password>"
    And  The user click on Privacy Policy Box
    And  The user click on Registieren button
    Then Verify that The user should be able to see "<Warnung Message>" and can not be register

    Examples:
      | email                     | password       | Warnung Message                                                                     |
      | sdet.praktikum5@gmail     |                | Fehler: Bitte gib eine gültige E-Mail-Adresse an.                                   |
      | sdet.praktikum5@com       |                | Fehler: Bitte gib eine gültige E-Mail-Adresse an.                                   |
      | sdet.praktikum5gmail.com  | Test1234!?TEST |                                                                                     |
      |                           | Test1234!?TEST | Fehler: Bitte gib eine gültige E-Mail-Adresse an.                                   |
      | sdet.praktikum5@gmail.com |                | Fehler: Für diese E-Mail-Adresse existiert bereits ein Kundenkonto. Bitte anmelden. |
      | sdet.praktikum5@gmail.com | Test1234!?TEST | Fehler: Für diese E-Mail-Adresse existiert bereits ein Kundenkonto. Bitte anmelden. |


#   Schwach - Bitte gib ein stärkeres Passwort ein.
#   Die E-Mail-Adresse muss ein @-Zeichen enthalten. In der Angabe "sdet_blggmail.com" fehlt ein @-Zeichen.


  Scenario Outline:Register Function_negative scenario2
    When The user enters invalid "<email>" , "<password>"
    And  The user click on Registieren button
    Then Verify that The user should be able to see "<Warnung Message>" and can not be register
    Examples:
      | email                 | password       | Warnung Message                                                  |
      | sdet.praktikum5@gmail | Test1234!?TEST | Fehler: Bitte akzeptiere die Erstellung eines neuen Kundenkontos |


