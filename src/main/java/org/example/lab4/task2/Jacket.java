package org.example.lab4.task2;

public class Jacket extends Amunition {
    public Jacket(double price, double weight) {
        super(price, weight);
    }

    @Override
    public String toString() {
        return "Jacket{" +
                "price=" + getPrice() +
                ", weight=" + getWeight() +
                '}';
    }
}
