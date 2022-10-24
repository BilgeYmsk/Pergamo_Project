package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.ConfigurationReader;
import utilities.Driver;

import static utilities.BrowserUtils.waitFor;

public class Login_StepDef {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page()  {
        Driver.get().get(ConfigurationReader.get("url"));
        waitFor(3);
    }


    @Then("Verify the user should be able to login")
    public void verifyTheUserShouldBeAbleToLogin() {
    }
}
