package pages;

import static org.junit.Assert.*;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utilities.BrowserUtils.*;

import utilities.ConfigurationReader;
import utilities.Driver;


public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@type='email']")
    public WebElement registerEmail_loc;

    @FindBy(id = "reg_password")
    public WebElement reg_password_loc;

    @FindBy(xpath = "//input[@id='reg_data_privacy']")
    public WebElement reg_data_privacy_loc;

    @FindBy(xpath = "//button[@name='register']")
    public WebElement register_btn;

    @FindBy(id = "username")
    public WebElement username_loc;

    @FindBy(id = "password")
    public WebElement password_loc;

    @FindBy(id = "rememberme")
    public WebElement rememberme_loc;

    @FindBy(xpath = "//button[@name='login']")
    public WebElement anmeldenBtn_loc;

    @FindBy(linkText = "Passwort vergessen?")
    public WebElement passwordVergessen_loc;

    @FindBy(xpath = "//div[@id='content']//li[1]")
    public WebElement warnmeldung_loc;

    @FindBy(css = ".woocommerce-password-strength.bad")
    public WebElement passwordWarnung_loc;

    public void warnmeldungVerify(String meldung) {
        if (meldung.equals("")) {
            System.out.println("registerEmail_loc.getAttribute(\"validationMessage\") = " + registerEmail_loc.getAttribute("validationMessage"));
            String validationMessage = registerEmail_loc.getAttribute("validationMessage").substring(0, 27);
//            System.out.println("validationMessage = " + validationMessage);
//            assertTrue(validationMessage.contains(" Die E-Mail-Adresse muss ein"));
            assertEquals("Die E-Mail-Adresse muss ein", validationMessage);

        } else {
            String actualWarnmeldung = warnmeldung_loc.getText();
            System.out.println("actualWarnmeldung = " + actualWarnmeldung);
            assertEquals(meldung, actualWarnmeldung);
        }
    }

    public void login(){

        username_loc.sendKeys(ConfigurationReader.get("email"));
        password_loc.sendKeys(ConfigurationReader.get("passwort"));
        anmeldenBtn_loc.click();

    }


}
