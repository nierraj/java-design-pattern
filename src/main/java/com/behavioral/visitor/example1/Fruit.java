package com.behavioral.visitor.example1;

public class Fruit implements Item {

	private String name;
	private int pricePerKg;
	private int weight;

	public Fruit(int pricePerKg, int weight, String name) {
		super();
		this.name = name;
		this.pricePerKg = pricePerKg;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public int getPricePerKg() {
		return pricePerKg;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
