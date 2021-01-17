package com.sda.przyklad2;

public class Main {
    public static void main(String[] args) {
        //Person person = new Employee("Jan", "Kowalski", 50);
        //person.describe();
        String [] strings = {"a","b"};
        Employee person = new JavaDeveloper("Jan",
                "Kowalski",
                50,
                20,
                strings);

        Employee[] employees = {
                person,
                new Employee("Annaaa", "Nowak", 20, 5000),
                new Manager("Marian", "Jakikolwiek", 34, 6000, null),
                new JavaDeveloper("Stefan", "Inny", 40, 5000, null),
                new SeniorJavaDeveloper("Alfred", "Nie mam pomyslu", 23, 7000, null, 20)
        };

        Manager manager = new Manager("Jan",
                "Kowalski",
                50,
                20,
                employees);

        manager.describe();
        for (Employee e:manager.getEmployees()) {
            e.describe();
        }
    }
}
