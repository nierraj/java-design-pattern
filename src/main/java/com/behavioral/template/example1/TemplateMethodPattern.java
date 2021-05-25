package com.behavioral.template.example1;

public class TemplateMethodPattern {
	public static void main(String[] args) {

		HouseTemplate woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();
		System.out.println("*****************************");
		HouseTemplate glassHouse = new GlassHouse();
		glassHouse.buildHouse();

	}
}
