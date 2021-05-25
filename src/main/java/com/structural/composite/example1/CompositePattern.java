package com.structural.composite.example1;

public class CompositePattern {

	public static void main(String[] args) {

		Shape circle = new Circle();
		Shape rectangle = new Rectangle();
		Shape triangle = new Triangle();
		Drawing draw = new Drawing();
		draw.add(circle);
		draw.add(rectangle);
		draw.add(triangle);
		draw.draw("red");
		draw.clear();
		System.out.println("****************");
		draw.add(triangle);
		draw.add(rectangle);
		draw.draw("green");

	}

}
