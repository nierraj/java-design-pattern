package com.creational.builder.example1;

public class BuilderPattern {

	public static void main(String[] args) {

		Computer computer = new Computer.ComputerBuilder("500GB", "4GB").setGraphicsCardEnabled(true).build();
		System.out.println(computer);
	}

}
