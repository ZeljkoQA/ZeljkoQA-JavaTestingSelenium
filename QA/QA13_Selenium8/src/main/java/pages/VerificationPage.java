package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerificationPage extends BasePage{
    public VerificationPage(WebDriver driver) {
        super(driver);
    }
    By errorNotificationBy = By.xpath("//div[@id=\"center_column\"]/div[1]");
    By signOutButtonBy = By.className("logout");
    By signInButtonBy = By.className("login");

    public VerificationPage verifyFailedLogin(String expectedText){
        String alert = readText(errorNotificationBy);
        assertStringEquals(alert, expectedText);
        return this;
    }
    public VerificationPage verifyLogin(String expectedText){
        String signout = readText(signOutButtonBy);
        assertStringEquals(signout, expectedText);
        return this;
    }
    public VerificationPage verifyLogout(String expectedText){
        String signin = readText(signInButtonBy);
        assertStringEquals(signin, expectedText);
        return this;
    }
}
