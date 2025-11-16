package com.hust.kstn.models;

public class Cart {
    private static final int MAX_NUMBER_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

	public void addDVD(DigitalVideoDisc disc) {
        if(qtyOrdered >= MAX_NUMBER_ORDERED) {
            System.out.println("The cart is almost full");
            return;
        }
        itemsInCart[qtyOrdered]= disc;
        qtyOrdered++;
        System.out.println("The disc has been added sucessfully");
    }

    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        addDVD(disc1); addDVD(disc2);
    }

    public void addDVD(DigitalVideoDisc ...discs) {
        for (DigitalVideoDisc disc : discs) {
            addDVD(disc);
            if(qtyOrdered >= MAX_NUMBER_ORDERED) {
                return;
            }
        }
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if(qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }
        for (int i = 0; i < qtyOrdered; ++i) {
            if(itemsInCart[i].equals(disc)) {
                itemsInCart[i] = itemsInCart[qtyOrdered - 1];
                qtyOrdered--;
                itemsInCart[qtyOrdered] = new DigitalVideoDisc();
                System.out.println("The disc has been removed sucessfully");
                return;
            }
        }
        System.out.println("The disc does not exist");
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < qtyOrdered; ++i) {
            totalCost += itemsInCart[i].getCost();
        }
        return totalCost;
    }

    
    public void print() {
        if(qtyOrdered == 0) {
            System.out.println("The cart is empty");
            return;
        }
        System.out.println("======================= THE CURRENT CART =======================");
        System.out.println("Total items : " + qtyOrdered);
        for (int i = 0; i < qtyOrdered; ++i) {
            System.out.println("- " + itemsInCart[i].toString());
        }
        System.out.println("Subtotal : " + calculateTotalCost() + "$");
        System.out.println("================================================================");
    }
}
