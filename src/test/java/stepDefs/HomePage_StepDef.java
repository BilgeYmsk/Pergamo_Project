package stepDefs;

import io.cucumber.java.en.And;
import pages.HomePage;
import static utilities.BrowserUtils.*;

public class HomePage_StepDef {

    HomePage homePage=new HomePage();

    @And("The user selects the product on the {string} of the Home Page")
    public void theUserSelectsTheProductOnTheOfTheHomePage(String category) {

        homePage.homeProductcategory(category);
        waitFor(5);


    }



}
