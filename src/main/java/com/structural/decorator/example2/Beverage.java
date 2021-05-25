package com.structural.decorator.example2;

public abstract class Beverage {

	private String description;

	public Beverage(String description) {
		super();
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public abstract double cost();

}

