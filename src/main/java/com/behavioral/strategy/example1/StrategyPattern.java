package com.behavioral.strategy.example1;

public class StrategyPattern {

	public static void main(String[] args) {

		Context add = new Context(new AddOperation());
		System.out.println("Addition : " + add.executeOperation(3, 4));
		Context sub = new Context(new SubtractOperation());
		System.out.println("Subtraction : " + sub.executeOperation(5, 1));
		Context mul = new Context(new MultiplyOperation());
		System.out.println("Multiply : " + mul.executeOperation(4, 9));

	}

}
