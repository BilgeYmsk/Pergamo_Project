package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static utilities.BrowserUtils.*;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Kasse extends BasePage {

    Faker faker = new Faker();

    @FindBy(xpath = "//h3[text()='Rechnungsdetails']")
    public WebElement rechnungdetailsText_loc;

    @FindBy(xpath = "//div[@class='wc-gzd-product-name-right']")
    public WebElement productNameRechnung_Loc;

    public WebElement kundenInfo(String info) {

        return Driver.get().findElement(By.xpath("//input[@id='" + info + "']"));

    }

    public void formularAusfüllen(String firstname, String lastname,String companyname,String address1, String address2, String postcode, String city, String telephone, String email) {

//        List<WebElement>kunden_Info= Driver.get().findElements(By.xpath("//div[@class='woocommerce-billing-fields__field-wrapper']//p//span//input"));
//        for (WebElement info:kunden_Info) {}

        kundenInfo("billing_first_name").sendKeys(faker.name().firstName());
        waitFor(2);
        kundenInfo("billing_last_name").sendKeys(faker.name().lastName());
        waitFor(2);
        kundenInfo("billing_company").sendKeys(faker.company().name());
        waitFor(2);
        kundenInfo("billing_address_1").sendKeys(faker.address().streetAddressNumber());
        waitFor(2);
        kundenInfo("billing_address_2").sendKeys(faker.address().secondaryAddress());
        waitFor(2);
        kundenInfo("billing_postcode").sendKeys(faker.address().zipCode());
        waitFor(2);
        kundenInfo("billing_city").sendKeys(faker.address().city());
        waitFor(2);
        kundenInfo("billing_phone").sendKeys(faker.phoneNumber().phoneNumber());
        waitFor(2);
        kundenInfo("billing_email").sendKeys(ConfigurationReader.get("email"));
        waitFor(2);


    }


}
