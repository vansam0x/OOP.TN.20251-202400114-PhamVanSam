package com.hust.kstn.models;

public class Store {
    private DigitalVideoDisc[] itemsInStore = new DigitalVideoDisc[100];
    private int numberDVD = 0;

    public Store() {

    }
    
    public void addDVD(DigitalVideoDisc disc) {
        if(numberDVD >= 100) {
            System.out.println("The store is almost full");
            return;
        }
        itemsInStore[numberDVD++] = disc;
        System.out.println("The disc has been added sucessfully");
    }

    public void addDVD(DigitalVideoDisc ... discs) {
        for (DigitalVideoDisc disc : discs) {
            addDVD(disc);
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if(numberDVD == 0) {
            System.out.println("The store is empty");
            return;
        }
        for (int i = 0; i < numberDVD; ++i) {
            if(itemsInStore[i].equals(disc)) {
                itemsInStore[i] = itemsInStore[numberDVD - 1];
                numberDVD--;
                itemsInStore[numberDVD] = new DigitalVideoDisc();
                System.out.println("The disc has been removed sucessfully");
                return;
            }
        }
        System.out.println("The disc does not exist");
    }

}
