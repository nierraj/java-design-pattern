package com.structural.proxy.example1;

public class ProxyPattern {

	public static void main(String[] args) {

		Image image = new ProxyImage("abc.jpg");
		image.display();

		System.out.println("**************");
		image.display();

	}

}
