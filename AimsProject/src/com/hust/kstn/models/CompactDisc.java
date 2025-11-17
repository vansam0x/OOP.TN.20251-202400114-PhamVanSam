package com.hust.kstn.models;

import java.util.*;

public class CompactDisc extends Disc {
    private List<Track> tracks = new ArrayList<>();
    
    public CompactDisc(String title, String category, double cost, Track ... tracks) {
        super(title, cost, category);
        this.tracks = new ArrayList<>(Arrays.asList(tracks));
    }

    public CompactDisc(String title, String category, double cost, List <Track> tracks) {
        super(title, cost, category);
        this.tracks = tracks;
    }

    public List<Track> getTracks() {
        return tracks;
    }
    @Override
    public String toString() {
        return super.toString() + "\n[" + tracks + "]";
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
