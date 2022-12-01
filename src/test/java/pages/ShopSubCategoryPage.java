package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.BrowserUtils;
import utilities.Driver;

import java.util.List;

import static utilities.BrowserUtils.*;

public class ShopSubCategoryPage extends BasePage {

    @FindBy(xpath = "//a[text()='Shop'])[1]")
    public WebElement shopCategory_loc;

    @FindBy(xpath = "//ul[@class='product-categories']//li//a")
    public List<WebElement> product_categories_list;

    @FindBy(xpath = "//a[text()='Vorteilspaket']")
    public WebElement vorteilspaket_loc;

    @FindBy(xpath = "//a[text()='Oliven']")
    public WebElement oliven_loc;

    public void selectShopSubCategory(String category) {

        WebElement category_tb = Driver.get().findElement(By.xpath("(//a[text()='" + category + "'])[1]"));
        category_tb.click();
        waitFor(2);
    }

    public void productcategorys(String product) {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("window.scrollBy(0,2500)");
        waitFor(2);


        for (WebElement productName : product_categories_list) {
            if (productName.getText().equalsIgnoreCase(product)) {
                productName.click();
                waitFor(1);
                break;
            }
        }

    }
//        scrollToElement();
//
//        WebElement category_product = Driver.get().findElement(By.xpath("//ul[@class='product-categories']//li//a[text()='" + product + "']"));
//        scrollToElement(category_product);
//        category_product.click();
//        waitFor(2);
}



