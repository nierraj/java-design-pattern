package com.behavioral.visitor.example2;

public class ComputerPartVisitorImpl implements ComputerPartVisitor {

	@Override
	public void visit(Keyboard keyboard) {
		System.out.println("Keyboard");
	}

	@Override
	public void visit(Mouse mouse) {
		System.out.println("Mouse");
	}

	@Override
	public void visit(Monitor monitor) {
		System.out.println("Monitor");
	}

	@Override
	public void visit(Computer computer) {
		System.out.println("Computer");
	}

}
