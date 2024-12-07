package org.example.lab3;

import java.util.Date;

public class LabRunner3 {
    public static void runLab() {
        // создание объектов
        Student student = new Student(1, "Иванов", "Иван", "Иванович", new Date(), "Москва", "1234567890", "Факультет", 1, "Группа");
        Book book = new Book(1, "Книга", "Автор", "Издательство", 2022, 100, 100.0, "Переплет");
        Bus bus = new Bus("Водитель", "Номер", "Маршрут", "Марка", 2022, 10000);
        Polynomial polynomial = new Polynomial(2, new double[]{1, 2, 3});
        Interval interval = new Interval(1, 2, true, true);
        Circle circle = new Circle(1, 2, 3);

        // вывод объектов
        System.out.println(student.toString());
        System.out.println(book.toString());
        System.out.println(bus.toString());
        System.out.println(polynomial.toString());
        System.out.println(interval.toString());
        System.out.println(circle.toString());
    }
}
