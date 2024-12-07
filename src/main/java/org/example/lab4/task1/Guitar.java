package org.example.lab4.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Guitar {
    private List<StringMy> strings;
    private Skvorechnik skvorechnik;

    public Guitar() {
        this.strings = new ArrayList<>();
        this.skvorechnik = new Skvorechnik();
    }

    public void play() {
        System.out.println("Играю на гитаре");
    }

    public void tune() {
        System.out.println("Настрою гитару");
    }

    public void replaceString(StringMy string) {
        strings.add(string);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Guitar guitar = (Guitar) o;
        return Objects.equals(strings, guitar.strings) &&
                Objects.equals(skvorechnik, guitar.skvorechnik);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strings, skvorechnik);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "strings=" + strings +
                ", skvorechnik=" + skvorechnik +
                '}';
    }
}