package com.behavioral.visitor.example1;

public class VisitorPattern {

	public static void main(String[] args) {

		Item items[] = new Item[] { new Book(20, "1234"),
				new Book(100, "5678"), new Fruit(10, 2, "Banana"),
				new Fruit(5, 5, "Apple") };
		int cost = getCost(items);
		System.out.println("Total cost : " + cost);
	}

	private static int getCost(Item[] items) {

		ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
		int sum = 0;
		for (Item item : items) {
			sum += item.accept(visitor);
		}

		return sum;
	}

}
