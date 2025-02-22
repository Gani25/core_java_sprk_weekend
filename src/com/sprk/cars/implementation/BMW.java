package com.sprk.cars.implementation;

import com.sprk.cars.ICar;

public class BMW implements ICar {

	public BMW() {
		System.out.println("BMW Car Created");
	}

	@Override
	public void specs() {
		System.out.println("I am a BMW Car");
	}

}
