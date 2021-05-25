package com.behavioral.observer;

public class HexObserver extends Observer {

	public HexObserver(State state) {
		this.state = state;
		this.state.attachObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Hex : " + Integer.toHexString(state.getState()));
	}

}
