package org.example.lab3;

public class Interval extends Entity {
    private double start;
    private double end;
    private boolean includeStart;
    private boolean includeEnd;

    public Interval(double start, double end, boolean includeStart, boolean includeEnd) {
        this.start = start;
        this.end = end;
        this.includeStart = includeStart;
        this.includeEnd = includeEnd;
    }

    // геттеры и сеттеры

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                ", includeStart=" + includeStart +
                ", includeEnd=" + includeEnd +
                '}';
    }
}