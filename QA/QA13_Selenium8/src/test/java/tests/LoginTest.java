package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class LoginTest extends BaseTest{

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage(driver);
        LoginMethods loginMethods = new LoginMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPage.basePage();
        loginMethods.login(PropertyManager.getInstance().getLogin_email(),
                PropertyManager.getInstance().getLogin_password());

        try {
            verificationPage.verifyLogin("Sign");
            System.out.print("User is logged in!");
        }catch (Exception e){
            Assert.fail("User is not logged in");
        }
    }
}

