package com.hust.kstn.models;

import java.util.*;

public class Book {
    private static int nbBook = 0;
    private int id;
    private String title;
    private String category;
    private double cost;
    private List <BookAuthor> authors = new ArrayList<>();
    private int numOfTokens;

    public Book(String title, String category, double cost, int numOfTokens, BookAuthor ... authors) {
        this.id = ++nbBook;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.authors = new ArrayList<>(Arrays.asList(authors));
        this.numOfTokens = numOfTokens;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    public List<BookAuthor> getAuthors() {
        return authors;
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    @Override
    public String toString() {
        return "Book[" + this.id + "][" 
        + this.title + "][" 
        + this.cost + "][" 
        + this.category + "]["
        + this.numOfTokens + "]"
        + "\nAuthors: " + this.authors;
    }
}
