package com.hust.kstn;

import com.hust.kstn.models.*;

public class Aims {

	public static void main(String[] args) {
		Cart cart = new Cart();
		DigitalVideoDisc disc1 = new DigitalVideoDisc("hong nhan", "pop", "jack", 36, 500.0);
		DigitalVideoDisc disc2 = new DigitalVideoDisc("bac phan", "v-pop", "jack-bo-con", 360, 36.0);
		DigitalVideoDisc disc3 = new DigitalVideoDisc("song gio", "pop", "jack-5tr", 3600, 36000.0);
		DigitalVideoDisc disc4 = new DigitalVideoDisc("ngoi sao co don", "popp", "jackk", 360000, 100.0);

		cart.addDVD(disc1);
		cart.addDVD(disc2);
		cart.addDVD(disc3);

		cart.print();
		System.out.println("[Total Cost] : " + cart.calculateTotalCost());

		cart.removeDVD(disc1);
		cart.removeDVD(disc4);
		cart.removeDVD(disc2);
		cart.removeDVD(disc3);
		cart.removeDVD(disc1);


	}

}
