package tests;

import dataCreation.DataCreation;
import methods.LoginMethods;
import methods.RegistrationMethods;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;
import pages.VerificationPage;
import utilities.PropertyManager;

public class RegistrationTest extends BaseTest{

    @Test
    public void registration(){
        LoginPage loginPage = new LoginPage(driver);
        LoginMethods loginMethods = new LoginMethods(driver);
        RegistrationMethods registrationMethods = new RegistrationMethods(driver);
        VerificationPage verificationPage = new VerificationPage(driver);

        loginPage.basePage();
        String regEmail = DataCreation.fakeEmail();
        loginMethods.navigateToRegistration(regEmail);
        String [] regData = DataCreation.registrationData();
        registrationMethods.register(regData);

        try {
            verificationPage.verifyLogin("Sign out");
            System.out.print("User is registered");
            PropertyManager.changeProperty("login_email", regEmail);
            PropertyManager.changeProperty("login_password", regData[2]);
        }catch (Exception e) {
            Assert.fail("User is NOT registered!");
        }
    }
}
