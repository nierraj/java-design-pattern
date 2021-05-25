package com.creational.abstractfactory.example2;

public class AbstractFactoryPattern {

	public static void main(String[] args) {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		System.out.println("********Shapes***********");
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		Shape square = shapeFactory.getShape("square");
		square.draw();
		System.out.println("*********Colors*************");
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color red = colorFactory.getColor("red");
		red.fill();
		Color green = colorFactory.getColor("green");
		green.fill();
		Color blue = colorFactory.getColor("blue");
		blue.fill();
	}

}
