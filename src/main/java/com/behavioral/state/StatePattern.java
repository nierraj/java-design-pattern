package com.behavioral.state;

public class StatePattern {

	public static void main(String[] args) {

		State tvStartState = new TvStartState();
		State tvStopState = new TvStopState();
		TvContext context = new TvContext();
		context.setState(tvStartState);
		context.doAction();

		context.setState(tvStopState);
		context.doAction();

	}

}
