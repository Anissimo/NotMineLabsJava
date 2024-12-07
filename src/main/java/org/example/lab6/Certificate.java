package org.example.lab6;

public class Certificate {
    private String number;
    private String date;

    public Certificate(String number, String date) {
        this.number = number;
        this.date = date;
    }

    public String getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }
}