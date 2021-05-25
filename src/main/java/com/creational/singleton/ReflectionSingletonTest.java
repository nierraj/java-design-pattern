package com.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {

	public static void main(String[] args) {

		ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance2 = null;
		try {
			Class<? extends ThreadSafeSingleton> myClass = instance1.getClass();
			Constructor<?>[] constructors = myClass.getDeclaredConstructors();
			for (Constructor<?> constructor : constructors) {
				//It will destroy Singleton design pattern.
				constructor.setAccessible(true);
				instance2 = (ThreadSafeSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//hashcode() of both the instances are different so here Singleton pattern breaks.
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());

	}

}
