package com.epam.javaclasses;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearPublished;
    private int numberOfPages;
    private double price;
    private String cover;

    public Book(int id, String title, String author, String publisher, int yearPublished, int numberOfPages, double price, String cover) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.cover = cover;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(int id, double price) {
        this.id = id;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return title + " by " + author + ". Book ID: " + id + ". Published by "
                + publisher + " in " + yearPublished + ". " + numberOfPages
                + " pages, " + cover + " cover. Price: " + price + " BYN.";
    }
}