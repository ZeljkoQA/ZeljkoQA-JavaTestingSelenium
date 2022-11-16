package methods;


import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginMethods extends LoginPage {
    public LoginMethods(WebDriver driver) {
        super(driver);
    }
    public LoginMethods login(String email, String password){
        clickOnSignInbutton();
        writeLoginEmail(email);
        writeLoginPassword(password);
        clickOnLoginButton();
        return this;
    }
    public LoginMethods navigateToRegistration(String email){
        clickOnSignInbutton();
        writeRegistrationEmail(email);
        clickOnSCreateAccountButton();
        return this;
    }
}
