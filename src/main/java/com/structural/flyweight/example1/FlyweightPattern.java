package com.structural.flyweight.example1;

public class FlyweightPattern {

	private static final String colors[] = { "Red", "Green", "Yellow", "Orange", "Blue" };

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++) {
			Circle circle = (Circle) ShapeFactory.getShape(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}

	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
