package com.behavioral.observer;

public class OctalObserver extends Observer {

	public OctalObserver(State state) {
		this.state = state;
		this.state.attachObserver(this);
	}

	@Override
	public void update() {
		System.out.println("Octal : " + Integer.toOctalString(state.getState()));
	}

}
