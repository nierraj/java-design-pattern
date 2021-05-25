package com.behavioral.template.example2;

public class Cricket extends Game {

	@Override
	public void initialize() {
		System.out.println("Cricket game is initialized.");
	}

	@Override
	public void startPlay() {
		System.out.println("Cricket started, lets enjoy.");
	}

	@Override
	public void endPlay() {
		System.out.println("Cricket ends.");
	}

}
