package methods;

import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;

public class RegistrationMethods extends RegistrationPage {
    public RegistrationMethods(WebDriver driver) {
        super(driver);
    }
    public RegistrationMethods register(String[] regData){
        clickOnGender();
        writeFirstName(regData[0]);
        writeLastName(regData[1]);
        writePassword(regData[2]);
        writeAddress(regData[3]);
        writeCity(regData[4]);
        selectStateDropdown();
        writePostalCode(regData[5]);
        writeMobileNumber(regData[6]);
        clickORegisterButton();
        return this;
    }
}
