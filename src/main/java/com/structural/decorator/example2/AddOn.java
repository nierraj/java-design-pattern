package com.structural.decorator.example2;

public abstract class AddOn extends Beverage {
	
	protected Beverage beverage;

	public AddOn(String description, Beverage bev) {
		super(description);
		this.beverage = bev;
	}

	public abstract String getDescription();
	
}
