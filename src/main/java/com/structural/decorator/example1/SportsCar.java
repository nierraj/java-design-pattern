package com.structural.decorator.example1;

public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);

	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Sports car.");
	}

}
