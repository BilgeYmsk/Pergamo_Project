package stepDefs;

import io.cucumber.java.en.Given;
import utilities.ConfigurationReader;
import utilities.Driver;

import static utilities.BrowserUtils.waitFor;

public class Login_StepDef {

    @Given("Der Benutzer befindet sich auf der Anmeldeseite")
    public void derBenutzerBefindetSichAufDerAnmeldeseite() {
        Driver.get().get(ConfigurationReader.get("url"));
        waitFor(3);
    }
}
