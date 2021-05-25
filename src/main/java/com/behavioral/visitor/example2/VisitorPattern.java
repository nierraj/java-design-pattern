package com.behavioral.visitor.example2;

public class VisitorPattern {

	public static void main(String[] args) {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartVisitorImpl());

	}

}
