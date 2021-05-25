package com.creational.builder.example2;

public class BuilderPattern {

	public static void main(String[] args) {

		MealBuilder builder = new MealBuilder();
		Meal vegMeal = builder.prepareVegMeal();
		vegMeal.showMeal();
		System.out.println("Meal Cost : " + vegMeal.getMealCost());
		Meal nonVegMeal = builder.prepareNonVegMeal();
		nonVegMeal.showMeal();
		System.out.println("Meal Cost : " + nonVegMeal.getMealCost());
	}

}
