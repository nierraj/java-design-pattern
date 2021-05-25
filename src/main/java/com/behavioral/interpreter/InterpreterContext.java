package com.behavioral.interpreter;

public class InterpreterContext {

	public String getBinaryFormat(int i) {
		return Integer.toBinaryString(i);
	}

	public String getHexFormat(int i) {
		return Integer.toHexString(i);
	}

}
