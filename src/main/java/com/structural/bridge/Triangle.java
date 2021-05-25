package com.structural.bridge;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
	}

	@Override
	public void applyColor() {
		color.applyColor();
	}

}
