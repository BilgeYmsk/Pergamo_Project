package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

import java.util.List;

public class Kasse extends BasePage{

    Faker faker=new Faker();

    @FindBy(xpath = "//h3[text()='Rechnungsdetails']")
    public WebElement rechnungdetailsText_loc;

    public WebElement  kundenInfo(String info){

        return  Driver.get().findElement(By.xpath("//input[@id='"+info+"']"));

    }

    public void formularAusfüllen(String firstname,String lastname){

//        List<WebElement>kunden_Info= Driver.get().findElements(By.xpath("//div[@class='woocommerce-billing-fields__field-wrapper']//p//span//input"));
//        for (WebElement info:kunden_Info) {}

            kundenInfo("billing_first_name").sendKeys(faker.name().firstName());
            kundenInfo("billing_last_name").sendKeys(faker.name().lastName());
            kundenInfo("billing_company").sendKeys(faker.company().name());
            kundenInfo("billing_address_1").sendKeys(faker.address().streetAddressNumber());
            kundenInfo("billing_address_2").sendKeys(faker.address().secondaryAddress());
//            kundenInfo("billing_postcode").







    }



}
