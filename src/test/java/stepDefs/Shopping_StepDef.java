package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import pages.Kasse;
import pages.ProductPage;
import pages.ShopSubCategoryPage;

import static utilities.BrowserUtils.*;

public class Shopping_StepDef {

    Kasse kasse = new Kasse();
    ShopSubCategoryPage shopSubCategoryPage = new ShopSubCategoryPage();

    ProductPage productPage=new ProductPage();

    @When("The user enters valid {string} , {string} ,{string}, {string}, {string},{string},{string}, {string} ,{string}")
    public void theUserEntersValid(String firstname, String lastname, String companyname, String address1, String address2, String postcode, String city, String telephone, String email) {

        kasse.formularAusfüllen(firstname, lastname, companyname, address1, address2, postcode, city, telephone, email);
    }

    @And("The user selects the product {string} on the one subcategory tab and choose the {string}")
    public void theUserSelectsTheProductOnTheOneSubcategoryTabAndChooseThe(String subcategory, String category) {

        shopSubCategoryPage.selectShopSubCategory(subcategory);

        waitFor(3);

        shopSubCategoryPage.selectShopSubCategory(category);
    }

    @And("The user select the {string}")
    public void theUserSelectThe(String product) {

        shopSubCategoryPage.selectShopSubCategory(product);
    }

    @And("The user add the product in shopping bag")
    public void theUserAddTheProductInShoppingBag() {

        productPage.warenkorbBtn_loc.click();
        waitFor(2);


    }

    @And("The user click the shopping bag and see selected product in the shopping bag")
    public void theUserClickTheShoppingBagAndSeeSelectedProductInTheShoppingBag() {

        productPage.cartTotal_loc.click();
        waitFor(2);
    }

    @And("the user click the Kasse button")
    public void theUserClickTheKasseButton() {
        productPage.kasseBtn_loc.click();
        waitFor(2);
    }

    @Then("the user should be able to product name {string}  and total preis in the Rechnung")
    public void theUserShouldBeAbleToProductNameAndTotalPreisInTheRechnung(String product) {
        hover(kasse.productNameRechnung_Loc);
        waitFor(2);
        String actualProductText = kasse.productNameRechnung_Loc.getText();
        actualProductText=actualProductText.substring(0,actualProductText.length()-5);
        System.out.println("actualProductText = " + actualProductText);
        product=product.substring(0,product.length()-3);
        System.out.println("product = " + product);
        assertEquals(product,actualProductText);


    }
}
