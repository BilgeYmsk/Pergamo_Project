package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KontoPage extends BasePage {

    @FindBy(xpath = "//strong[1]")
    public WebElement usernameText_loc;

    public void theUserCanBeRegister(String email) {
        String actualText = usernameText_loc.getText();
        System.out.println("actualText = " + actualText);

        Assert.assertEquals(email, actualText);
    }
}
