package com.behavioral.interpreter;

public class IntToHexExpression implements Expression {

	int i;

	public IntToHexExpression(int num) {
		i = num;
	}

	@Override
	public String interpret(InterpreterContext context) {
		return context.getHexFormat(i);
	}

}
