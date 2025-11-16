package com.hust.kstn.test;

import com.hust.kstn.models.*;

public class CompactDiscTest {
    public static void main(String[] args) {
        Track track1 = new Track("hay trao cho anh", 100);
        Track track2 = new Track("ong ba gia tao lo het", 299);
        Track track3 = new Track("o i i", 36);
        Track track4 = new Track("rap cham thoi", 199);

        CompactDisc cd = new CompactDisc("lao gi cung ton", "jack", 199, track1, track2);

        System.out.println(cd);

        cd.addTrack(track3);
        cd.addTrack(track4);

        System.out.println("Total Length : " + cd.totalLength());

        System.out.println(cd);

        cd.removeTrack(track1);

        System.out.println(cd);

        System.out.println("Total Length : " + cd.totalLength());
    }
}
