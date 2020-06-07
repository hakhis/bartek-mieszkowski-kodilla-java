package com.kodilla.good.patterns.challenges.allegro;

public class Book implements Product {
    private String title;
    private String author;
    private int publicationDate;
    private int productID;
    private int quantity;

    public Book(String title, String author, int publicationDate, int productID, int quantity) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
        this.productID = productID;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book title: " + title + ",\n" +
                "Author: " + author + ",\n" +
                "Publication date: " + publicationDate;
    }

    @Override
    public boolean isAvailable() {
        if (quantity > 0) {
            return true;
        } else {
            return false;
        }
    }

}
