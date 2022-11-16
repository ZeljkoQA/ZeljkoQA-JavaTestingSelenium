package dataCreation;

import com.github.javafaker.Faker;

public class DataCreation {

    public static String[] registrationData(){
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String regPassword = faker.internet().password(8,12);
        String regAddress = faker.address().fullAddress();
        String regCity = faker.address().cityName();
        String postalCode = faker.number().digits(5);
        String mobilePhone = faker.phoneNumber().cellPhone();

        return new String[]{firstName, lastName, regPassword, regAddress, regCity, postalCode, mobilePhone};
    }
    public static String fakeEmail(){
        Faker faker = new Faker();
        String fakeEmail = faker.internet().emailAddress();
        return fakeEmail;
    }
}
