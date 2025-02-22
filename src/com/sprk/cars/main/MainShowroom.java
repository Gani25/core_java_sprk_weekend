package com.sprk.cars.main;

import com.sprk.cars.implementation.BMW;
import com.sprk.cars.implementation.Kia;
import com.sprk.cars.implementation.Tata;
import com.sprk.showroom.CarShowroom;

public class MainShowroom {
	
	public static void main(String[] args) {
		
		CarShowroom showroom = new CarShowroom();
		showroom.setICar(new Tata());
		
		showroom.getICar().specs();
		
		CarShowroom showroom2 = new CarShowroom(new Kia());
		
		showroom2.getICar().specs();
	}

}
