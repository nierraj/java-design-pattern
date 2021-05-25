package com.structural.decorator.example2;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		super("House blend");
	}

	@Override
	public double cost() {
		return 250;
	}

}
