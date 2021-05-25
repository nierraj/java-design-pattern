package com.structural.decorator.example1;

public class DecoratorPattern {

	public static void main(String[] args) {

		Car car = new BasicCar();
		car.assemble();

		Car sportsCar = new SportsCar(new BasicCar());
		sportsCar.assemble();

		Car luxuryCar = new LuxuryCar(new SportsCar(new BasicCar()));
		luxuryCar.assemble();
	}

}
