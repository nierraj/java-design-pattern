package com.behavioral.state;

public class TvStartState implements State {

	@Override
	public void doAction() {
		System.out.println("Tv is turned on.");
	}

}
