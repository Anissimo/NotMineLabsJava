package org.example;

/**
 * Класс для конвертации чисел из одной системы счисления в другую.
 */
public class Lab2 {

    /**
     * Перевести число из одной системы счисления в другую.
     *
     * @param number число для перевода
     * @param fromBase исходная система счисления
     * @param toBase целевая система счисления
     * @return переведенное число
     */
    public String convertNumber(String number, int fromBase, int toBase) {
        int decimal = 0;
        for (int i = 0; i < number.length(); i++) {
            decimal += (number.charAt(i) - '0') * (int) Math.pow(fromBase, number.length() - 1 - i);
        }
        StringBuilder result = new StringBuilder();
        while (decimal > 0) {
            result.insert(0, decimal % toBase);
            decimal /= toBase;
        }
        return result.toString();
    }

    /**
     * Перевести число из десятичной системы счисления в другую.
     *
     * @param number число для перевода
     * @param toBase целевая система счисления
     * @return переведенное число
     */
    public String convertFromDecimal(int number, int toBase) {
        StringBuilder result = new StringBuilder();
        while (number > 0) {
            result.insert(0, number % toBase);
            number /= toBase;
        }
        return result.toString();
    }

    /**
     * Перевести число из другой системы счисления в десятичную.
     *
     * @param number число для перевода
     * @param fromBase исходная система счисления
     * @return переведенное число
     */
    public int convertToDecimal(String number, int fromBase) {
        int decimal = 0;
        for (int i = 0; i < number.length(); i++) {
            decimal += (number.charAt(i) - '0') * (int) Math.pow(fromBase, number.length() - 1 - i);
        }
        return decimal;
    }

    public static void main(String[] args) {
        Lab2 converter = new Lab2();
        String number = "101";
        int fromBase = 2;
        int toBase = 10;
        String convertedNumber = converter.convertNumber(number, fromBase, toBase);
        System.out.println("Переведенное число: " + convertedNumber);
    }
}