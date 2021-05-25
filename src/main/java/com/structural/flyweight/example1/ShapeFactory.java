package com.structural.flyweight.example1;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<String, Shape> factory = new HashMap<>();

	public static Shape getShape(String color) {
		Circle circle = (Circle) factory.get(color);
		if (circle == null) {
			circle = new Circle(color);
			factory.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
