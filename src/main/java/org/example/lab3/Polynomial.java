package org.example.lab3;

import java.util.Arrays;

public class Polynomial extends Entity {
    private int degree;
    private double[] coefficients;

    public Polynomial(int degree, double[] coefficients) {
        this.degree = degree;
        this.coefficients = coefficients;
    }

    // геттеры и сеттеры

    @Override
    public String toString() {
        return "Polynomial{" +
                "degree=" + degree +
                ", coefficients=" + Arrays.toString(coefficients) +
                '}';
    }
}