package com.creational.singleton;

public class EagerInitializationSingleton {

	private static final EagerInitializationSingleton instance = new EagerInitializationSingleton();

	private EagerInitializationSingleton() {

	}

	public static EagerInitializationSingleton getInstance() {
		return instance;
	}

}
