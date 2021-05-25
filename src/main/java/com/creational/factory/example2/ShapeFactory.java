package com.creational.factory.example2;

public class ShapeFactory {

	public static Shape getShape(String type) {
		if ("circle".equalsIgnoreCase(type)) {
			return new Circle();
		} else if ("rectangle".equalsIgnoreCase(type)) {
			return new Rectangle();
		} else if ("square".equalsIgnoreCase(type)) {
			return new Square();
		}
		return null;
	}

}
