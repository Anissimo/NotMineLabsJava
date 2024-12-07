package org.example.lab4.task2;

public class Helmet extends Amunition {
    public Helmet(double price, double weight) {
        super(price, weight);
    }

    @Override
    public String toString() {
        return "Helmet{" +
                "price=" + getPrice() +
                ", weight=" + getWeight() +
                '}';
    }
}
