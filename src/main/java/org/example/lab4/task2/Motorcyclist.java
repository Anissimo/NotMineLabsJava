package org.example.lab4.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Motorcyclist {
    private List<Amunition> amunitions;

    public Motorcyclist() {
        this.amunitions = new ArrayList<>();
    }

    public void addAmunition(Amunition ammunition) {
        amunitions.add(ammunition);
    }

    public void printAmunitions() {
        for (Amunition ammunition : amunitions) {
            System.out.println(ammunition.toString());
        }
    }

    public void sortByWeight() {
        amunitions.sort(Comparator.comparing(Amunition::getWeight));
    }

    public void findAmunitionsByPriceRange(double minPrice, double maxPrice) {
        amunitions.stream()
                  .filter(ammunition -> ammunition.getPrice() >= minPrice && ammunition.getPrice() <= maxPrice)
                  .forEach(System.out::println);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Motorcyclist motorcyclist = (Motorcyclist) o;
        return Objects.equals(amunitions, motorcyclist.amunitions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amunitions);
    }

    @Override
    public String toString() {
        return "Motorcyclist{" +
                "amunitions=" + amunitions +
                '}';
    }
}
