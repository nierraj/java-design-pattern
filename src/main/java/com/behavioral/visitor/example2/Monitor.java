package com.behavioral.visitor.example2;

public class Monitor implements ComputerPart {

	@Override
	public void accept(ComputerPartVisitor visitor) {
		visitor.visit(this);
	}

}
