package com.behavioral.strategy.example1;

public class Context {

	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public int executeOperation(int a, int b) {
		return strategy.doOperation(a, b);
	}

}
