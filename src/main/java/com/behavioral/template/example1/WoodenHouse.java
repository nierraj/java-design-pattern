package com.behavioral.template.example1;

public class WoodenHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Wooden walls.");
	}

	@Override
	public void buildPillars() {
		System.out.println("Wooden pillars.");
	}

}
