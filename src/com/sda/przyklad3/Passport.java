package com.sda.przyklad3;

import java.time.LocalDate;

public final class Passport {

    private final String peselNumber;
    private final LocalDate creationDate;
    private final Person owner;

    public Passport(String peselNumber, LocalDate creationDate, Person owner) {
        this.peselNumber = peselNumber;
        this.creationDate = creationDate;
        this.owner = owner;
    }

    public String getPeselNumber() {
        return peselNumber;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public Person getOwner() {
        return owner;
    }
}
