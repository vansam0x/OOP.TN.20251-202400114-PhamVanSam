package com.hust.kstn.models;

import java.util.*;

public class CompactDisc {
    private static int nbCompactDisc = 0;
    private int id;
    private String title;
    private String category;
    private double cost;
    private List<Track> tracks = new ArrayList<>();
    
    public CompactDisc(String title, String category, double cost, Track ... tracks) {
        this.id = ++nbCompactDisc;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.tracks = new ArrayList<>(Arrays.asList(tracks));
    }

    public CompactDisc(String title, String category, double cost, List <Track> tracks) {
        this.id = ++nbCompactDisc;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.tracks = tracks;
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
    public List<Track> getTracks() {
        return tracks;
    }
    @Override
    public String toString() {
        return "CompactDisc [" + id + "][" + title + "][" + category + "][" + cost + "]\n"
                + "[" + tracks + "]";
    }    

    public int totalLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }
    
    public void removeTrack(Track track) {
        tracks.remove(track);
    }
}
