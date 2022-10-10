package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SubcategoryPage;

import static utilities.BrowserUtils.waitFor;

public class SubCategory_StepDef {

    SubcategoryPage subcategoryPage=new SubcategoryPage();

    @When("Der Benutzer wählt die Kategorie {string} in der Kategorie aus.")
    public void derBenutzerWähltDieKategorieInDerKategorieAus(String category) {
        subcategoryPage.mastmenu_mth(category);
        waitFor(5);
    }

    @And("Der Benutzer wählt das Produkt {string} auf dem einen Unterkategorie-Tab aus")
    public void derBenutzerWähltDasProduktAufDemEinenUnterkategorieTabAus(String subcategory) {

        subcategoryPage.shopsubcategory_mth(subcategory);
        waitFor(5);
    }

    @Then("Stellen Sie sicher, dass der Benutzer in der Lage sein sollte, das Produkt {string} auf dem einen Unterkategorie-Tab auszuwählen")
    public void stellenSieSicherDassDerBenutzerInDerLageSeinSollteDasProduktAufDemEinenUnterkategorieTabAuszuwählen(String product) {

        subcategoryPage.verify_selectedCategory(product);
    }


}
