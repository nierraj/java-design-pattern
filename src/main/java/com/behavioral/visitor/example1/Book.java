package com.behavioral.visitor.example1;

public class Book implements Item {

	private int price;
	private String isbn;

	public Book(int price, String isbn) {
		super();
		this.price = price;
		this.isbn = isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbn() {
		return isbn;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}
