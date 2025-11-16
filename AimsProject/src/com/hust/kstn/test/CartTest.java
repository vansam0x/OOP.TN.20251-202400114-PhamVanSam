package com.hust.kstn.test;

import java.util.*;

import com.hust.kstn.models.*;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc[] discs = new DigitalVideoDisc[30];
        for (int i = 0; i < 30; ++i) {
            discs[i] = new DigitalVideoDisc("low g", "rap", "tan gai " + i, (36 + i) * 1.0);
        }

        DigitalVideoDisc disc1 = new DigitalVideoDisc("jack", "pop", "nuoi con 5tr", 5.0);
        DigitalVideoDisc disc2 = new DigitalVideoDisc("son tung mtp", "pop", "flop qua thi ghi ten anh vao", 100.0);
        DigitalVideoDisc disc3 = new DigitalVideoDisc("njz", "pop", "ditto", 2.5);

        cart.removeDVD(disc1);
        cart.print();
        cart.addDVD(disc1, disc2);
        cart.print();
        cart.removeDVD(disc3);
        cart.print();
        cart.addDVD(disc3);
        cart.print();
        cart.addDVD(discs);
        cart.print();

    }
}
