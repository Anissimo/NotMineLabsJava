package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class LabWork {

    private Scanner scanner;
    private Random random;

    public LabWork() {
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void run() {
        greetUser();
        printRandomNumbers();
        calculateSumAndProduct();
        processNumbers();
    }

    private void greetUser() {
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, " + name + "!");
    }

    private void printRandomNumbers() {
        int count = getIntInput("Введите количество случайных чисел: ");

        System.out.println("Случайные числа с переходом на новую строку:");
        for (int i = 0; i < count; i++) {
            System.out.println(random.nextInt(100));
        }

        System.out.println("Случайные числа без перехода на новую строку:");
        for (int i = 0; i < count; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
        System.out.println();
    }

    private void calculateSumAndProduct() {
        System.out.print("Введите целые числа: \n");
        String[] numbersStr = scanner.nextLine().split(" ");
        int[] numbers = new int[numbersStr.length];

        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = getIntInput("Введите целое число " + (i + 1) + ": ");
        }

        int sum = 0;

        int product = 1;

        for (int number : numbers) {
            sum += number;
            product *= number;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }

    private void processNumbers() {
        int count = getIntInput("Введите количество целых чисел: ");

        int[] numbers = new int[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = getIntInput("Введите целое число " + (i + 1) + ": ");
        }

        System.out.println("Четные числа:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        System.out.println("Нечетные числа:");
        for (int number : numbers) {
            if (number % 2!= 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        System.out.println("Числа, которые делятся на 3 или на 9:");
        for (int number : numbers) {
            if (number % 3 == 0 || number % 9 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        Arrays.sort(numbers);
        System.out.println("Отсортированные числа в порядке возрастания:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        Arrays.sort(numbers);
        System.out.println("Отсортированные числа в порядке убывания:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    private int getIntInput(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введите целое число.");
                scanner.next(); // Читаем символ новой строки
            }
        }
    }

    public static void main(String[] args) {
        LabWork app = new LabWork();
        app.run();
    }
}