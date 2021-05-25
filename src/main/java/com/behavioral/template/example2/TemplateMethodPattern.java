package com.behavioral.template.example2;

public class TemplateMethodPattern {

	public static void main(String[] args) {
		Game cricket = new Cricket();
		cricket.play();
		System.out.println("***********************");
		Game football = new Football();
		football.play();
	}

}
