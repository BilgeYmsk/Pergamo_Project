package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ProductPage;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;


public class Menu_StepDef extends BrowserUtils {

    @When("All links on the Website should be able be verified")
    public void allLinksOnTheWebsiteShouldBeAbleBeVerified() {
        List<WebElement> links = Driver.get().findElements(By.cssSelector("link"));

        System.out.println("Total links are " + links.size());

        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href"); //site icinde ki linkler--> href
            System.out.println("url = " + url);  //bu sekilde likleri de yazdirabilirsin
            verifyLink(url);

        }

    }

    @Then("All image on the Website should be able be verified")
    public void allImageOnTheWebsiteShouldBeAbleBeVerified() {

       List<WebElement> productArr = Driver.get().findElements(By.cssSelector("html img"));
        productArr.forEach(e -> System.out.println(e.getAttribute("src")));


    }






    @Then("the user should be able to clicked {string}")
    public void theUserShouldBeAbleToClicked(String product) {
    }

    @Then("Verify the alle product clickable")
    public void verifyTheAlleProductClickable() throws InterruptedException {

        ProductPage productPage=new ProductPage();
        productPage.productList_SelectAndVerify();

    }


}
