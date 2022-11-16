package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    By genderRadioButtonBy = By.id("id_gender1");
    By firstNameInputFieldBy = By.id("customer_firstname");
    By lastNameInputFieldBy = By.id("customer_lastname");
    By passwordInputFieldBy = By.id("passwd");
    By addressInputFieldBy = By.id("address1");
    By cityInputFieldBy = By.id("city");
    By stateDropdownBy = By.id("id_state");
    By postalCodeInputFieldBy = By.id("postcode");
    By mobilePhoneInputFieldBy = By.id("phone_mobile");
    By registrationButtonBy = By.id("submitAccount");


   /* public RegistrationPage register(String[] regData) {
        click(genderRadioButtonBy);
        writeText(firstNameInputFieldBy, regData[0]);
        writeText(lastNameInputFieldBy, regData[1]);
        writeText(passwordInputFieldBy, regData[2]);
        writeText(addressInputFieldBy, regData[3]);
        writeText(cityInputFieldBy, regData[4]);
        selectRandomFromDropdown(stateDropdownBy);
        writeText(postalCodeInputFieldBy, regData[5]);
        writeText(mobilePhoneInputFieldBy, regData[6]);
        click(registrationButtonBy);
        return this;
    }*/
    public void clickOnGender(){
        click(genderRadioButtonBy);
    }
    public void writeFirstName(String fName){
        writeText(firstNameInputFieldBy, fName);
    }
    public void writeLastName(String lName){
        writeText(lastNameInputFieldBy, lName);
    }
    public void writePassword(String password){
        writeText(passwordInputFieldBy,password);
    }
    public void writeAddress(String address){
        writeText(addressInputFieldBy, address);
    }
    public void writeCity(String city){
        writeText(cityInputFieldBy, city);
    }
    public void selectStateDropdown(){
        selectRandomFromDropdown(stateDropdownBy);
    }
    public void writePostalCode(String postalCode){
        writeText(postalCodeInputFieldBy, postalCode);
    }
    public void writeMobileNumber(String mobile){
        writeText(mobilePhoneInputFieldBy, mobile);
    }
    public void clickORegisterButton(){
        click(registrationButtonBy);
    }
}
