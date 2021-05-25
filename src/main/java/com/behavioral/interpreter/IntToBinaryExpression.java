package com.behavioral.interpreter;

public class IntToBinaryExpression implements Expression {

	int i;

	public IntToBinaryExpression(int num) {
		i = num;
	}

	@Override
	public String interpret(InterpreterContext context) {
		return context.getBinaryFormat(i);
	}

}
