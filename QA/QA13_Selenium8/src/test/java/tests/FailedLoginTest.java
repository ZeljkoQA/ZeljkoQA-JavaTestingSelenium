package tests;

import methods.LoginMethods;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class FailedLoginTest extends BaseTest{


    @Test(dataProvider = "Data")
    public void failedLogin(String email, String password){
        LoginPage loginPage = new LoginPage(driver);
        LoginMethods loginMethods = new LoginMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPage.basePage();
        loginMethods.login(email, password);

        try {
            verificationPage.verifyFailedLogin("There is 1 error\nAuthentication failed.");
            System.out.print("User is not logged in");
        }catch (Exception e){
            Assert.fail("User is logged in!");
        }

    }
    @DataProvider(name="Data")
    public Object [][] getDataFromDataProvider(){
        return new Object[][]
                {
                        {PropertyManager.getInstance().getLogin_email(), PropertyManager.getInstance().getLogin_password()},
                        {"ovoCESIGURNObitinatestu@gmail.com", "123456789"},
                        {"daliceovobitinatestu@gmail.com", "sigurnodahoce"}
                };
    }
}
