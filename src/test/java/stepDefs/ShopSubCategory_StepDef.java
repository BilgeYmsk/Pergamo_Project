package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.ShopSubCategoryPage;
import static utilities.BrowserUtils.*;

public class ShopSubCategory_StepDef {

    ShopSubCategoryPage shopSubCategoryPage=new ShopSubCategoryPage();

    @When("The user selects the category {string} in the SubCategory")
    public void theUserSelectsTheCategoryInTheSubCategory(String category) {

        shopSubCategoryPage.selectShopSubCategory(category);

    }

    @And("The user selects the product on the {string} of the Kategorien")
    public void theUserSelectsTheProductOnTheOfTheKategorien(String subcategory) {

        shopSubCategoryPage.productcategorys(subcategory);
        waitFor(2);

    }


}
