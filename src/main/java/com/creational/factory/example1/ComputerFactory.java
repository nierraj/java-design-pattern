package com.creational.factory.example1;

public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd,
			String cpu) {

		if ("pc".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		} else if ("server".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}
		return null;

	}

}
