package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "(//ul[@class='sub-menu'])[1]//li")
    public List<WebElement> shop_subcategoryList;







}
