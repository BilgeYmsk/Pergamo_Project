package pages;


import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static utilities.BrowserUtils.*;
import utilities.Driver;

import java.util.List;

public class SubcategoryPage extends BasePage{

    @FindBy(xpath = "//ul[@class='cms-breadcrumb']//li[3]")
    public WebElement selectedCategory_loc;

    @FindBy(xpath = "//ul[@class='sub-menu']//li")
    public List<WebElement> shopSubcategory_list_loc;

    @FindBy(xpath = "//h2[text()='Alle Olivenöl']")
    public WebElement alleOlivenöl_Loc;

    @FindBy(xpath = "//a[text()='Essig']")
    public WebElement essig_loc;
    @FindBy(xpath = "//a[text()='Türkische Desserts']")
    public WebElement turkischDessert_loc;

    public void verify_selectedCategory(String productKategorien){

        String actualselectedCategory = selectedCategory_loc.getText();
        scrollToElement(selectedCategory_loc);
        waitFor(1);
        assertEquals(productKategorien,actualselectedCategory);

    }
    public void shopsubcategory_mth(String category) {

        scrollToElement(essig_loc);

        if(category.equalsIgnoreCase("Sesampaste und Malasse") ||category.equalsIgnoreCase("Tee und Kaffe Sorten ")||category.equalsIgnoreCase("Traditionelle Türkische Spezialitäten")|| category.equalsIgnoreCase("Türkische Desserts") ){
            scrollToElement(turkischDessert_loc);
        }

        WebElement shopsubcategory = Driver.get().findElement(By.xpath("(//ul[@class='sub-menu'])[1]//li//a[text()='" + category + "']"));
        scrollToElement(shopsubcategory);
//        waitFor(1);
        shopsubcategory.click();
    }

    public void shopSubcategoryList(){


        for (WebElement category:shopSubcategory_list_loc) {
            System.out.println("category.getText() = " + category.getText());

        }

    }

    public void productFind(String name){

        WebElement product=Driver.get().findElement(By.xpath("//a[text()='"+name+"']"));
        hover(product);
        product.click();

    }

    public void verifyProduct(String name){
        WebElement verifyproduct=Driver.get().findElement(By.xpath("//h1[@class='product_title entry-title']"));
//        name=name.substring(0,name.length()-3);
        System.out.println("name = " + name);
        System.out.println("verifyproduct.getText() = " + verifyproduct.getText());
        assertEquals(name,verifyproduct.getText());
    }


}
