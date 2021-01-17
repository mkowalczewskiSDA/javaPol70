package com.sda.przyklad3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        Passport passport = new Passport("856065911654",
                date,
                new Person("Jan", "Kowalski"));
    }
}
