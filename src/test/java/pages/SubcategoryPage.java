package pages;


import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class SubcategoryPage extends BasePage{

    @FindBy(xpath = "//ul[@class='cms-breadcrumb']//li[3]")
    public WebElement selectedCategory_loc;

    @FindBy(xpath = "//h2[text()='Alle Olivenöl']")
    public WebElement alleOlivenöl_Loc;

    public void verify_selectedCategory(String productKategorien){
        String actualselectedCategory = selectedCategory_loc.getText();
        assertEquals(productKategorien,actualselectedCategory);
    }
    public void shopsubcategory_mth(String category) {
        WebElement shopsubcategory = Driver.get().findElement(By.xpath("(//ul[@class='sub-menu'])[1]//li//a[text()='" + category + "']"));
        shopsubcategory.click();
    }


}
