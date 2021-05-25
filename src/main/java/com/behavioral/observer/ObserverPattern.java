package com.behavioral.observer;

public class ObserverPattern {

	public static void main(String[] args) {
		State state = new State();
		Observer ob1 = new BinaryObserver(state);
		Observer ob2 = new OctalObserver(state);
		Observer ob3 = new HexObserver(state);
		System.out.println("First state change.");
		state.setState(10);
		System.out.println("Second state change.");
		state.detachObserver(ob2);
		state.setState(12);
	}

}
