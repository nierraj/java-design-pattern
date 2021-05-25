package com.behavioral.state;

public class TvContext implements State {

	private State state;

	@Override
	public void doAction() {
		state.doAction();
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
