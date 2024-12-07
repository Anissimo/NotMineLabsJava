package org.example.lab7;

public class PangramChecker {
    public static boolean isPangram(String str) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (char c : alphabet.toCharArray()) {
            if (!str.toLowerCase().contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}