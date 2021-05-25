package com.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializedSingletonTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SerializedSingleton instance=SerializedSingleton.getInstance();
		ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("abc.txt"));
		out.writeObject(instance);
		out.close();
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("abc.txt"));
		SerializedSingleton instance1=(SerializedSingleton) in.readObject();
		in.close();
		System.out.println(instance.hashCode());
		System.out.println(instance1.hashCode());
		
	}
	
}
