Feature:Register Function

  Background:
    Given Der Benutzer befindet sich auf der Anmeldeseite
    When  Der Benutzer klickt auf Ihr Konto

  Scenario:
    When  Der Benutzer gibt eine gültige E-Mail-Adresse und ein gültiges Passwort ein
    And   Der Benutzer klickt auf die Datenschutzerklärung.
    And   Der Benutzer klickt auf die Schaltfläche Registrieren
    Then  Stellen Sie sicher, dass der Benutzer in der Lage sein sollte, sich mit gültigen Anmeldeinformationen zu registrieren


  @registerNgtv
  Scenario Outline:Register Function_negative scenario
    When  Der Benutzer gibt eine "<E-Mail-Adresse>" und ein "<Passwort>" ein
    And   Der Benutzer klickt auf die Datenschutzerklärung.
    And   Der Benutzer klickt auf die Schaltfläche Registrieren
    Then  Stellen Sie sicher, dass der Benutzer "<Warnmeldung>" sehen kann und sich nicht registrieren kann

    Examples:
      | E-Mail-Adresse     | Passwort       | Warnmeldung                                       |
      | sdet_blg@gmail     |                | Fehler: Bitte gib eine gültige E-Mail-Adresse an. |
      |                    | Test1234!?TEST | Fehler: Bitte gib eine gültige E-Mail-Adresse an. |
      | sdet_blggmail.com  | Test1234!?TEST |                                                   |
      | sdet_blg@gmail.com |                | Fehler: Bitte gib ein Passwort für das Konto ein. |
#      | sdet_blg@gmail.com |                | Fehler: Bitte akzeptiere die Erstellung eines neuen Kundenkontos |
#      | sdet_blg@gmail.com |                | Fehler: Bitte gib ein Passwort für das Konto ein.                |
#      | sdet_blg@com      | Test1234!?TEST | Fehler: Bitte gib eine gültige E-Mail-Adresse an. |
#      | sdet_blg@com               | TEST1234!§$test | Fehler: Bitte gib eine gültige E-Mail-Adresse an. |
#     | sdet_blggmail.com | Test1234! | Schwach - Bitte gib ein stärkeres Passwort ein. |
#   Die E-Mail-Adresse muss ein @-Zeichen enthalten. In der Angabe "sdet_blggmail.com" fehlt ein @-Zeichen.


