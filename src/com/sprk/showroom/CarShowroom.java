package com.sprk.showroom;

import com.sprk.cars.ICar;
import com.sprk.cars.implementation.BMW;
import com.sprk.cars.implementation.Tata;

public class CarShowroom {

	// has A-> Aggregation
//	private BMW bmw;
	private ICar iCar;

	public CarShowroom() {
		System.out.println("Showroom created without cars brand");
	}

	public CarShowroom(ICar iCar) {
		System.out.println("Showroom Created with "+iCar.getClass().getSimpleName()+" car brand.");
		this.iCar = iCar;
	}

	public ICar getICar() {
		return iCar;
	}

	public void setICar(ICar iCar) {
		
		System.out.println("Car "+iCar.getClass().getSimpleName()+" brand have been added to showroom");
		this.iCar = iCar;
	}
	
	

}
