package com.structural.decorator.example2;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		super("Dark roast");
	}

	@Override
	public double cost() {
		return 300;
	}

}

