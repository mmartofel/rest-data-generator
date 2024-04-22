package org.acme;

import java.util.Locale;
import java.util.UUID;
import com.github.javafaker.Faker;

public class Transaction {
    
    public Person person;
    public UUID transactionID;

    public Transaction() {

        Faker faker = new Faker(new Locale("pl-PL"));

        this.person = new Person();
        this.transactionID = new UUID(9, 0);
    }

public UUID getTransactionID() {
    return this.transactionID;
}

}
