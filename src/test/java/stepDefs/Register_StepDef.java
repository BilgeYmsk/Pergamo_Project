package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import static utilities.BrowserUtils.*;

public class Register_StepDef {

    LoginPage loginPage=new LoginPage();

    @When("Der Benutzer klickt auf Ihr Konto")
    public void derBenutzerKlicktAufIhrKonto() {
        loginPage.konto_btn.click();

    }

    @And("Der Benutzer gibt eine gültige E-Mail-Adresse und ein gültiges Passwort ein")
    public void derBenutzerGibtEineGültigeEMailAdresseUndEinGültigesPasswortEin() {
        loginPage.login();
    }

    @And("Der Benutzer klickt auf die Datenschutzerklärung.")
    public void derBenutzerKlicktAufDieDatenschutzerklärung() {
        loginPage.reg_data_privacy_loc.click();
    }


    @And("Der Benutzer klickt auf die Schaltfläche Registrieren")
    public void derBenutzerKlicktAufDieSchaltflächeRegistrieren() {
//        clickWithJS(loginPage.register_btn);
        loginPage.register_btn.click();
       waitFor(3);
    }

    @Then("Stellen Sie sicher, dass der Benutzer in der Lage sein sollte, sich mit gültigen Anmeldeinformationen zu registrieren")
    public void stellenSieSicherDassDerBenutzerInDerLageSeinSollteSichMitGültigenAnmeldeinformationenZuRegistrieren() {
    }

    @When("Der Benutzer gibt eine {string} und ein {string} ein")
    public void derBenutzerGibtEineUndEinEin(String email, String passwort) {
        loginPage.registerEmail_loc.sendKeys(email);
        loginPage.reg_password_loc.sendKeys(passwort);

    }

    @Then("Stellen Sie sicher, dass der Benutzer {string} sehen kann und sich nicht registrieren kann")
    public void stellenSieSicherDassDerBenutzerSehenKannUndSichNichtRegistrierenKann(String warnmeldung) {
        loginPage.warnmeldungVerify(warnmeldung);

    }
}
