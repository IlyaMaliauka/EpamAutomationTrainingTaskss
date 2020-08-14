package com.epam.javaclasses;

import java.util.ArrayList;
import java.util.List;

public class BookBuilder {
    private ArrayList<Book> bookBuilders = new ArrayList<>();
    void addBookToList (Book book) {
        bookBuilders.add(book);
    }

    List<Book> byYearPublishedOutput(int yearAfter) {
        List<Book> list = new ArrayList<>();
        for (Book c : bookBuilders) {
            if (c.getYearPublished() >= yearAfter) {
                list.add(c);
            }
        }
        return list;
    }

    List<Book> byAuthorOutput(String author) {
        List<Book> list = new ArrayList<>();
        for (Book c : bookBuilders) {
            if (c.getAuthor().equals(author)) {
                list.add(c);
            }
        }
        return list;
    }

    List<Book> byPublisherOutput(String publisher) {
        List<Book> list = new ArrayList<>();
        for (Book c : bookBuilders) {
            if (c.getPublisher().equals(publisher)) {
                list.add(c);
            }
        }
        return list;
    }
}