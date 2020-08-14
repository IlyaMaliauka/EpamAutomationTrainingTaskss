package com.epam.javaclasses;

import java.util.List;

public class BookMain {
    public static void main(String[] args) {
        BookBuilder bookCollection = new BookBuilder();
        bookCollection.addBookToList(new Book(1341, "Martin Eden", "Jack London", "Millennium Library", 1973, 430, 20.40, "Hard"));
        bookCollection.addBookToList(new Book(256, "Java: A Beginner's Guide", "Herbert Schildt", "Williams", 2019, 816, 90.10, "Soft"));
        bookCollection.addBookToList(new Book(7457, "A Farewell to Arms", "Ernest Hemingway", "Millennium Library", 1974, 326, 17.09, "Hard"));
        bookCollection.addBookToList(new Book(7356, "Idiot", "Fyodor Dostoevsky", "Lenizdat", 1969, 463, 7.5, "Hard"));
        bookCollection.addBookToList(new Book(24, "80000 Hours", "Benjamin Todd", "Amazon", 2018, 230, 10.20, "Soft"));
        bookCollection.addBookToList(new Book(8, "Crime and Punishment", "Fyodor Dostoevsky", "Lenizdat", 1955, 478, 7.5, "Hard"));

        System.out.println("Books published after 1980: ");
        List<Book> listSortByYear = bookCollection.byYearPublishedOutput(1980);
        for (Book c : listSortByYear) {
            System.out.println(c);
        }
        System.out.println("\nBooks written by Fyodor Dostoevsky: ");
        List<Book> listSortByCertainAuthor = bookCollection.byAuthorOutput("Fyodor Dostoevsky");
        for (Book c : listSortByCertainAuthor) {
            System.out.println(c);
        }
        System.out.println("\nBooks published by Millennium Library: ");
        List<Book> listSortByPublisher = bookCollection.byPublisherOutput("Millennium Library");
        for (Book c : listSortByPublisher) {
            System.out.println(c);
        }
    }
}
