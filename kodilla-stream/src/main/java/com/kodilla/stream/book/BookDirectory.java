package com.kodilla.stream.book;

import java.util.ArrayList;
import java.util.List;

public final class BookDirectory {
    private final List<Book> theBookList = new ArrayList<>();

    public BookDirectory() {
        theBookList.add(new Book("Dylan Murphy", "Wolf of the mountains", "0001", 2003));
        theBookList.add(new Book("Phoebe Pearson", "Slaves of dreams", "0002", 2012));
        theBookList.add(new Book("Morgan Walsh", "Obliteration of heaven", "0003", 2001));
        theBookList.add(new Book("Aimee Murphy", "Rejecting the night", "0004", 2015));
        theBookList.add(new Book("Ryan Talley", "Gangsters and kings", "0005", 2007));
        theBookList.add(new Book("Madelynn Carson", "Unity without duty", "0006", 2007));
        theBookList.add(new Book("Giancarlo Guerrero", "Enemies of eternity", "0007", 2009));
    }

    public List<Book> getList() {
        return new ArrayList<>(theBookList);
    }
}
