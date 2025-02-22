package com.sprk.cars.implementation;

import com.sprk.cars.ICar;

public class Kia implements ICar {

	public Kia() {
		System.out.println("Kia Car Created");
	}

	@Override
	public void specs() {
		System.out.println("I am a Kia Car");
	}

}
