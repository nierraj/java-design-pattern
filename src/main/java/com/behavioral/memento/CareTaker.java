package com.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	List<Memento> mementoList = new ArrayList<>();

	public void add(Memento state) {
		mementoList.add(state);
	}

	public Memento getState(int index) {
		return mementoList.get(index);
	}

}
