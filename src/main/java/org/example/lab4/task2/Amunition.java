package org.example.lab4.task2;

import java.util.Objects;

public abstract class Amunition {
    private double price;
    private double weight;

    public Amunition(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Amunition ammunition = (Amunition) o;
        return Double.compare(ammunition.price, price) == 0 &&
                Double.compare(ammunition.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight);
    }

    @Override
    public String toString() {
        return "Amunition{" +
                "price=" + price +
                ", weight=" + weight +
                '}';
    }
}
