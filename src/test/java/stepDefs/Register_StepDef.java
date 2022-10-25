package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.KontoPage;
import pages.LoginPage;
import static utilities.BrowserUtils.*;

public class Register_StepDef {

    LoginPage loginPage=new LoginPage();
    KontoPage konto=new KontoPage();

    @When("The user click on Ihr Konto Menu")
    public void theUserClickOnIhrKontoMenu() {

        loginPage.konto_btn.click();
    }


    @When("The user enters valid E-Mail and Password")
    public void the_user_enters_valid_E_Mail_and_Password(){

        loginPage.login();
    }

    @When("The user enters valid {string} and {string}")
    public void theUserEntersValidAnd(String email, String password) {

        loginPage.theUserEntersEmailAndPassword(email,password);

    }

    @When("The user click on Privacy Policy Box")
    public void the_user_click_on_Privacy_Policy_Box()  {

        loginPage.reg_data_privacy_loc.click();
    }

    @When("The user click on Registieren button")
    public void the_user_click_on_Registieren_button() {

        loginPage.register_btn.click();
        waitFor(3);
    }

    @Then("Verify that The user should be able to see {string} and can not be register")
    public void verify_that_The_user_should_be_able_to_see_and_can_not_be_register(String warnmeldung) {

        loginPage.warnmeldungVerify(warnmeldung);

    }

    @When("The user enters invalid {string} , {string}")
    public void the_user_enters_invalid(String email, String password) {

        loginPage.theUserEntersEmailAndPassword(email,password);
    }


    @Then("Verify that the user can be register mit valid Email {string}")
    public void verify_that_the_user_can_be_register_mit_valid_Email(String email) {

        konto.theUserCanBeRegister(email);
    }

}
