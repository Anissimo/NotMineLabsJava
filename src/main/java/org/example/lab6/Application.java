package org.example.lab6;

public class Application {
    private String name;
    private String surname;

    public Application(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}