package com.hust.kstn.models;

import java.util.*;

public class Book extends Media {
    private List<BookAuthor> authors = new ArrayList<>();
    private int numOfTokens;

    public Book(String title, String category, double cost, int numOfTokens, BookAuthor... authors) {
        super(title, cost, category);
        this.authors = new ArrayList<>(Arrays.asList(authors));
        this.numOfTokens = numOfTokens;
    }

    public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {
        super(title, cost, category);
        this.authors = authors;
        this.numOfTokens = numOfTokens;
    }

    public List<BookAuthor> getAuthors() {
        return authors;
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    @Override
    public String toString() {
        return super.toString()
                + "[" + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors;
    }
}
