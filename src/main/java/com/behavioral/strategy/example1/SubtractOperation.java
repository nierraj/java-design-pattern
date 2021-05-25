package com.behavioral.strategy.example1;

public class SubtractOperation implements Strategy {

	@Override
	public int doOperation(int a, int b) {
		return a - b;
	}

}
