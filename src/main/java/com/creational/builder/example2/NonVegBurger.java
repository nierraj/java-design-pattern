package com.creational.builder.example2;

public class NonVegBurger extends Burger {

	@Override
	public String name() {
		return "Non Veg Burger";
	}

	@Override
	public float price() {
		return 250.0f;
	}

}
