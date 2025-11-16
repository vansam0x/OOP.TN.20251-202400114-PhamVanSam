package com.hust.kstn.models;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private String title; 
    private String category;
    private String director;
    private int length; 
    private double cost;
    private int id;

    public int getId() {
        return id; 
    }

    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public String getDirector() {
        return director;
    }
    public int getLength() {
        return length;
    }
    public double getCost() {
        return cost;
    }
    
    public DigitalVideoDisc() {
        this.id = ++nbDigitalVideoDiscs;
    	this.category = this.title = this.director = null;
    	this.cost = 0.0;
    	this.length = 0;
    }
    public DigitalVideoDisc(String title) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.category = category;
        this.title = title;
        this.cost = cost; 
    }

    public DigitalVideoDisc(String director, String category, String title, double cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.director = director;
        this.category = category;
        this.title = title;
        this.cost = cost; 
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
        this.id = ++nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost; 
    }

    @Override

    public String toString() {
        return "DVD" + "[" + this.id + "]"
        + "[" + this.title + "]"
        + "[" + this.cost + "]"
        + "[" + this.director + "]"
        + "[" + this.length + "]"
        + "[" + this.category + "]";
    }
}
