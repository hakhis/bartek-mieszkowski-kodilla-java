package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.time.LocalDate;

public final class Book extends Prototype {
    private String title;
    private String author;
    private LocalDate publicationDate;

    public Book(String title, String author, LocalDate publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public Book deepCopy() throws CloneNotSupportedException {
        Book clonedBook = (Book) super.clone();
        clonedBook.title = getTitle();
        clonedBook.author = getAuthor();
        clonedBook.publicationDate = getPublicationDate();
        return clonedBook;
    }

    @Override
    public String toString() {
        return "        Book: " + title + " author:" + author + " publicationDate: " + publicationDate + "\n";
    }
}
