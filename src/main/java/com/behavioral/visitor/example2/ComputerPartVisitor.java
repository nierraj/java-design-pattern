package com.behavioral.visitor.example2;

public interface ComputerPartVisitor {

	void visit(Keyboard keyboard);

	void visit(Mouse mouse);

	void visit(Monitor monitor);

	void visit(Computer computer);

}
