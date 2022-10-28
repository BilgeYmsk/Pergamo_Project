package stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.ProductPage;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;


public class Menu_StepDef extends BrowserUtils {

    @When("All links on the Website should be able be verified")
    public void allLinksOnTheWebsiteShouldBeAbleBeVerified() {
//        List<WebElement> links = Driver.get().findElements(By.cssSelector("link"));
        List<WebElement> links = Driver.get().findElements(By.xpath("//a"));

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

//       List<WebElement> productArr = Driver.get().findElements(By.cssSelector("html img"));
       List<WebElement> productArr = Driver.get().findElements(By.xpath("//img"));
        System.out.println("productImg.size = " + productArr.size());
//        productArr.forEach(e -> System.out.println(e.getAttribute("src")));

        for (WebElement product:productArr) {

            if(product.getAttribute("width").equals("500") & product.getAttribute("height").equals("500")){
//                System.out.println((product.getAttribute("alt") + " size is 500*500"));
                System.out.println();
            }else{
                String sizes= product.getAttribute("width") +"*"+ product.getAttribute("height");
                System.out.println((product.getAttribute("alt") + " size is not 500*500 . But " + sizes));

            }

        }


    }

    @Then("Verify the alle product clickable")
    public void verifyTheAlleProductClickable() throws InterruptedException {

        ProductPage productPage=new ProductPage();
        productPage.productList_SelectAndVerify();

    }



}
