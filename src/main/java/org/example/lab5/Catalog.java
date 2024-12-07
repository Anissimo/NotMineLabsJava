package org.example.lab5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Book> books;

    public Catalog() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public static class Book {
        private String title;
        private String author;
        private List<Issue> issues;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
            this.issues = new ArrayList<>();
        }

        public void addIssue(Issue issue) {
            issues.add(issue);
        }

        public List<Issue> getIssues() {
            return issues;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }
    }

    public static class Issue {
        private LocalDate date;
        private String reader;

        public Issue(LocalDate date, String reader) {
            this.date = date;
            this.reader = reader;
        }

        public LocalDate getDate() {
            return date;
        }

        public String getReader() {
            return reader;
        }
    }
}