package com.creational.singleton;

public class BillPughSingleton {

	private BillPughSingleton() {

	}

	private static class SingletonHelper {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		return SingletonHelper.instance;
	}

}
