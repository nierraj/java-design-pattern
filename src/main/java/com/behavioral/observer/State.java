package com.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class State {

	private List<Observer> observers = new ArrayList<>();
	private int state;

	public void attachObserver(Observer observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	public void detachObserver(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyAllOberservers();
	}

	public void notifyAllOberservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

}
