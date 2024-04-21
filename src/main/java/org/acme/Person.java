package org.acme;

import java.util.Locale;
import com.github.javafaker.Faker;

public class Person {
    
    public String name;
    public String surname;
    public String pesel;
    public String dateOfBirth;
    public String email;
    public String telephone;
    public String address;
    public String postalCode;
    public String city;
    public String country;

    public Person() {
    Faker faker = new Faker(new Locale("pl-PL"));

    this.name = faker.name().firstName();
    this.surname = faker.name().lastName();
    this.pesel = faker.idNumber().validSvSeSsn();
    this.dateOfBirth = faker.backToTheFuture().date();
    this.email = faker.internet().emailAddress();
    this.telephone = faker.phoneNumber().cellPhone();
    this.address = faker.address().streetAddress();
    this.postalCode = faker.address().zipCode();
    this.city = faker.address().cityName();
    this.country = "Polska";
    }

    public String toStringPerson() {
        return this.name +" "+ this.surname +" "+ this.pesel +" "+ this.dateOfBirth +" "+ 
               this.email +" "+ this.telephone +" "+ this.address +" "+ this.postalCode +" "+ 
               this.city +" "+ this.country;
    }        

}
