package com.structural.decorator.example1;

public class CarDecorator implements Car {

	protected Car car;

	public CarDecorator(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void assemble() {
		car.assemble();
	}

}
