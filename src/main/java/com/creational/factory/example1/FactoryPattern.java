package com.creational.factory.example1;

public class FactoryPattern {

	public static void main(String[] args) {

		Computer pc = ComputerFactory.getComputer("pc", "4GB", "500GB",
				"2.4GHZ");

		Computer server = ComputerFactory.getComputer("server", "10GB", "1TB",
				"10GHZ");
		System.out.println("PC : " + pc);
		System.out.println("Server : " + server);
	}
}
