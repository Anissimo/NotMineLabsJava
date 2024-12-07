package org.example.lab4.task1;

import java.util.Objects;

public class String {
    private String value;

    public String(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        String string = (String) o;
        return Objects.equals(value, string.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
