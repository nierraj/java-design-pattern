package com.structural.facade.example1;

public class Facade {

	private Shape circle;
	private Shape rectangle;
	private Shape triangle;

	public Facade() {
		super();
		circle = new Circle();
		rectangle = new Rectangle();
		triangle = new Triangle();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRecTangle() {
		rectangle.draw();
	}

	public void drawTriangle() {
		triangle.draw();
	}

}
