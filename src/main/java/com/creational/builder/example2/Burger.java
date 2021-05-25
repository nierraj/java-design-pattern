package com.creational.builder.example2;

public abstract class Burger implements Item {

	@Override
	public Packing pack() {
		return new Wrapper();
	}

}
