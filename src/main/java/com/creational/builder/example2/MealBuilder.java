package com.creational.builder.example2;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addMeal(new VegBurger());
		meal.addMeal(new Pepsi());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addMeal(new NonVegBurger());
		meal.addMeal(new Coke());
		return meal;
	}

}
