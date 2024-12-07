package org.example.lab5;

import java.time.LocalDate;
import java.time.LocalTime;

public class LabRunner5 {
    public static void runLab() {
        Catalog catalog = new Catalog();
        catalog.addBook(new Catalog.Book("Книга 1", "Автор 1"));
        catalog.addBook(new Catalog.Book("Книга 2", "Автор 2"));

        Catalog.Book book1 = catalog.getBooks().get(0);
        book1.addIssue(new Catalog.Issue(LocalDate.now(), "Читатель 1"));
        book1.addIssue(new Catalog.Issue(LocalDate.now().plusDays(1), "Читатель 2"));

        TransportService transportService = new TransportService();
        transportService.addRoute(new TransportService.Route("Маршрут 1", LocalTime.of(8, 0), 10.0));
        transportService.addRoute(new TransportService.Route("Маршрут 2", LocalTime.of(9, 0), 15.0));

        System.out.println("Книги:");
        for (Catalog.Book book : catalog.getBooks()) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
            for (Catalog.Issue issue : book.getIssues()) {
                System.out.println("Выдана: " + issue.getDate() + " читателю " + issue.getReader());
            }
        }

        System.out.println("Маршруты:");
        for (TransportService.Route route : transportService.getRoutes()) {
            System.out.println("Маршрут " + route.getNumber() + ": выезд в " + route.getDepartureTime() + ", стоимость " + route.getCost());
        }
    }
}
