package com.creational.abstractfactory.example2;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		return null;
	}

	@Override
	public Shape getShape(String shape) {

		if ("circle".equalsIgnoreCase(shape)) {
			return new Circle();
		} else if ("rectangle".equalsIgnoreCase(shape)) {
			return new Rectangle();
		} else if ("square".equalsIgnoreCase(shape)) {
			return new Square();
		}

		return null;
	}

}
