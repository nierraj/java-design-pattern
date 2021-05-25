package com.behavioral.template.example1;

public class GlassHouse extends HouseTemplate {

	@Override
	public void buildWalls() {
		System.out.println("Glass walls.");
	}

	@Override
	public void buildPillars() {
		System.out.println("Glass pillars.");
	}

}
