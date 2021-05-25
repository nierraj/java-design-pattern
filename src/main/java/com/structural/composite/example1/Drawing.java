package com.structural.composite.example1;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {

	private List<Shape> shapes = new ArrayList<Shape>();

	public void draw(String color) {

		for (Shape shape : shapes) {
			shape.draw(color);
		}

	}

	public void add(Shape shape) {
		shapes.add(shape);
	}

	public void remove(Shape shape) {
		shapes.remove(shape);
	}

	public void clear() {
		shapes.clear();
	}

}
