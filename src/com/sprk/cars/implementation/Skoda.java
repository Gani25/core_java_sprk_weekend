package com.sprk.cars.implementation;

import com.sprk.cars.ICar;

public class Skoda implements ICar {

	public Skoda() {
		System.out.println("Skoda Car Created");
	}

	@Override
	public void specs() {
		System.out.println("I am a Skoda Car");
	}

}
