package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utilities.BrowserUtils;
import utilities.Driver;

import static utilities.BrowserUtils.*;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//h3//a")
    public List<WebElement> product_list;

    @FindBy(xpath = "//h1")
    public WebElement productText_loc;

    @FindBy(id="pa_format")
    public WebElement wähleEineOption_loc;

    @FindBy(xpath = "//button[text()='in den Warenkorb']")
    public WebElement warenkorbBtn_loc;

    @FindBy(css = ".cart-total-wrap")
    public WebElement cartTotal_loc;

    @FindBy(xpath = "(//a[text()='Kasse'])[1]")
    public WebElement kasseBtn_loc;

    public void productList_SelectAndVerify() throws InterruptedException {

        int productSize = product_list.size();

        System.out.println("productSize = " + productSize);
        System.out.println(getElementsText(product_list));

        int product = 0;

//        List<String>productList = null;

        for (int i = 0; i < product_list.size(); i++) {

            product_list.get(i).click();

            Thread.sleep(3000);
            product++;
            waitFor(1);
//            productList.add(product_list.get(i).getText());
            Driver.get().navigate().back();
            waitFor(1);

        }

        Assert.assertEquals(productSize, product);
    }
}



