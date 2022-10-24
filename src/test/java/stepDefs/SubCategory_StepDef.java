package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.SubcategoryPage;
import utilities.Driver;

import static utilities.BrowserUtils.waitFor;

public class SubCategory_StepDef {

    SubcategoryPage subcategoryPage=new SubcategoryPage();

    @When("The user selects the category {string} in the category..")
    public void the_user_selects_the_category_in_the_category(String category) {

        subcategoryPage.mastmenu_mth(category);
        waitFor(5);
    }

    @When("The user selects the product {string} on the one subcategory tab")
    public void the_user_selects_the_product_on_the_one_subcategory_tab(String subcategory) {

//        subcategoryPage.shopSubcategoryList(); sol tarafta duran kategori isimleri almak icin yaptim

        subcategoryPage.shopsubcategory_mth(subcategory);
        waitFor(5);

        //zeytin kategorisini yazdirmak icin yaptim
//        for (WebElement element : Driver.get().findElements(By.xpath("//ul[@class='products columns-4']//li"))) {
//            System.out.println(element.getText());
//        }

    }

    @Then("Verify the user should be able to select the {string} product on the one subcategory tab")
    public void verify_the_user_should_be_able_to_select_the_product_on_the_one_subcategory_tab(String product) {

        subcategoryPage.verify_selectedCategory(product);
    }


    @Then("the user selects the {string} on the subcategory")
    public void the_user_selects_the_on_the_subcategory(String product) {

        subcategoryPage.productFind(product);
    }

    @Then("Verify the user should be able to see the selected {string}")
    public void verify_the_user_should_be_able_to_see_the_selected(String product) {
        subcategoryPage.verifyProduct(product);
    }

}
