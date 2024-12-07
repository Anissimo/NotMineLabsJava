package org.example.lab4.task2;

public class Gloves extends Amunition {
    public Gloves(double price, double weight) {
        super(price, weight);
    }

    @Override
    public String toString() {
        return "Gloves{" +
                "price=" + getPrice() +
                ", weight=" + getWeight() +
                '}';
    }
}
