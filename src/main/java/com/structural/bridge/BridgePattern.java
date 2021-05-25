package com.structural.bridge;

public class BridgePattern {

	public static void main(String[] args) {

		Shape triangle = new Triangle(new RedColor());
		triangle.applyColor();
		Shape rectangle = new Rectangle(new GreenColor());
		rectangle.applyColor();
	}

}
