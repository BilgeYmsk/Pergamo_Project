package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.KontoPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import static utilities.BrowserUtils.waitFor;

public class Login_StepDef {

    KontoPage kontoPage=new KontoPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page()  {
        Driver.get().get(ConfigurationReader.get("url"));
        waitFor(3);
    }

    @Then("Verify that the user can be login mit valid Email")
    public void verify_that_the_user_can_be_login_mit_valid_Email()  {

        kontoPage.theUserCanBeLogin();


    }

}
