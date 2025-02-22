package com.sprk.cars.implementation;

import com.sprk.cars.ICar;

public class Tata implements ICar {

	public Tata() {
		System.out.println("Tata Car Created");
	}
	
	@Override
	public void specs() {
		System.out.println("I am a Tata Car");
	}

}
