package pages;

import static org.junit.Assert.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.ConfigurationReader;

public class KontoPage extends BasePage {

    @FindBy(xpath = "//strong[1]")
    public WebElement usernameText_loc;

    public void theUserCanBeRegister(String email) {
        String actualText = usernameText_loc.getText();
        System.out.println("actualText = " + actualText);

        assertEquals(email, actualText);
    }

    public void theUserCanBeLogin() {
        String actualText = usernameText_loc.getText();
        System.out.println("actualText = " + actualText);

        assertTrue(ConfigurationReader.get("email").contains(actualText));
    }
}
