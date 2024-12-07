package org.example.lab4.task2;

public class Boots extends Amunition {
    public Boots(double price, double weight) {
        super(price, weight);
    }

    @Override
    public String toString() {
        return "Boots{" +
                "price=" + getPrice() +
                ", weight=" + getWeight() +
                '}';
    }
}
