package com.behavioral.observer;

public class BinaryObserver extends Observer {

	public BinaryObserver(State state) {
		this.state = state;
		this.state.attachObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Binary : " + Integer.toBinaryString(state.getState()));
	}

}
