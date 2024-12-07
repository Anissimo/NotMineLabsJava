package org.example.lab7;

import java.util.function.Predicate;

public class NamePredicate {
    public static Predicate<String> startsWith(char c) {
        return name -> name.startsWith(String.valueOf(c));
    }
}