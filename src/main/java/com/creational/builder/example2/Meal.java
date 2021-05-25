package com.creational.builder.example2;

import java.util.ArrayList;

public class Meal {

	ArrayList<Item> items = null;

	public Meal() {
		items = new ArrayList<>();
	}

	public void addMeal(Item item) {
		items.add(item);
	}

	public void showMeal() {
		for (Item item : items) {
			System.out.print("Name : " + item.name() + ",");
			System.out.print("Packing : " + item.pack().packing() + ",");
			System.out.println("Price : " + item.price());
		}
	}

	public float getMealCost() {
		float sum = 0.0f;
		for (Item item : items) {
			sum += item.price();
		}
		return sum;
	}

}
