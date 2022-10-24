package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utilities.BrowserUtils.*;
import utilities.Driver;

import java.util.List;

public abstract class BasePage {

    @FindBy(xpath = "//span[text()='Ihr Konto']")
    public WebElement konto_btn;

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//ul[@id='mastmenu']/li")
    public List<WebElement> home_Tab_loc;

    public void mastmenu_mth(String category) {
        WebElement category_tb = Driver.get().findElement(By.xpath("(//a[text()='" + category + "'])[1]"));
        hover(category_tb);

//        category_tb.click();
//        waitFor(2);
    }

    public void subcategory_mth(String subcategory) {
        WebElement subcatrgory_tb = Driver.get().findElement(By.xpath("//ul[@class='sub-menu']//li//a[text()='" + subcategory + "']"));
        subcatrgory_tb.click();
        waitFor(2);
    }

    public void hoverProduct_met(String subCategory, String productName) {
        mastmenu_mth(subCategory);
        waitFor(2);
        subcategory_mth(productName);
    }


}

