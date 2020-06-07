package com.kodilla.good.patterns.challenges.allegro;

import java.util.Date;

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

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    public int getProductID() {
        return productID;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
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
