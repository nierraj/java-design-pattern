package com.behavioral.state;

public class TvStopState implements State {

	@Override
	public void doAction() {
		System.out.println("Tv is turned off.");
	}

}
