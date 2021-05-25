package com.behavioral.interpreter;

public class InterpreterPattern {

	InterpreterContext ic;

	public InterpreterPattern(InterpreterContext ic) {
		this.ic = ic;
	}

	public static void main(String[] args) {

		String str1 = "28 in Binary";
		String str2 = "28 in Hexadecimal";
		InterpreterPattern ec = new InterpreterPattern(new InterpreterContext());
		System.out.println(str1 + "= " + ec.interpret(str1));
		System.out.println(str2 + "= " + ec.interpret(str2));

	}

	private String interpret(String str) {
		Expression exp = null;
		// create rules for expressions
		if (str.contains("Hexadecimal")) {
			exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else if (str.contains("Binary")) {
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else
			return str;

		return exp.interpret(ic);
	}

}
