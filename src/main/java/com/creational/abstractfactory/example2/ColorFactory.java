package com.creational.abstractfactory.example2;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if ("red".equalsIgnoreCase(color)) {
			return new Red();
		} else if ("green".equalsIgnoreCase(color)) {
			return new Green();
		} else if ("blue".equalsIgnoreCase(color)) {
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}

}
