package org.example.lab3;

public class Bus extends Entity {
    private String driver;
    private String number;
    private String route;
    private String mark;
    private int year;
    private int mileage;

    public Bus(String driver, String number, String route, String mark, int year, int mileage) {
        this.driver = driver;
        this.number = number;
        this.route = route;
        this.mark = mark;
        this.year = year;
        this.mileage = mileage;
    }

    // геттеры и сеттеры

    @Override
    public String toString() {
        return "Bus{" +
                "driver='" + driver + '\'' +
                ", number='" + number + '\'' +
                ", route='" + route + '\'' +
                ", mark='" + mark + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}