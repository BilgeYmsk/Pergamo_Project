package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static utilities.BrowserUtils.*;
import utilities.Driver;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "(//ul[@class='sub-menu'])[1]//li")
    public List<WebElement> shop_subcategoryList;

    public void homeProductcategory(String category){

        WebElement element = Driver.get().findElement(By.xpath(" (//h2[text()=' "+category+" '])[2]"));
        element.click();
        waitFor(3);
    }







}
