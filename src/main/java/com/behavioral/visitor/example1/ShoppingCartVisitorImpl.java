package com.behavioral.visitor.example1;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

	@Override
	public int visit(Book book) {

		int cost = 0;

		if (book.getPrice() >= 50) {
			cost = book.getPrice() - 10;
		} else {
			cost = book.getPrice();
		}
		System.out.println("Book's ISBN number : " + book.getIsbn()
				+ " and Cost :" + book.getPrice());
		return cost;
	}

	@Override
	public int visit(Fruit fruit) {

		int cost = fruit.getPricePerKg() * fruit.getWeight();
		System.out.println("Fruit name : " + fruit.getName() + " and cost : "
				+ cost);
		return cost;
	}

}
