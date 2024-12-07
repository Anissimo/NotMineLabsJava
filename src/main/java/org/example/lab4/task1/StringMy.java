package org.example.lab4.task1;

import java.util.Objects;

public class StringMy {
    private String value;

    public StringMy(String value) {
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
        StringMy stringMy = (StringMy) o;
        return Objects.equals(value, stringMy.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}