package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggedInPage extends BasePage{
    public LoggedInPage(WebDriver driver) {
        super(driver);
    }
    By singOutButtonBy = By.className("logout");

    public LoggedInPage logout(){
        click(singOutButtonBy);
        return this;
    }
}
