package com.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = 2511767416471257057L;

	private SerializedSingleton() {

	}

	private static class SingletonHelper {

		private static final SerializedSingleton instance = new SerializedSingleton();

	}
	
	public static SerializedSingleton getInstance(){
		return SingletonHelper.instance;
	}
	
	//Because of this Singleton pattern won't break.
	public Object readResolve(){
		return getInstance();
	}
	
}
