package com.behavioral.template.example2;

public class Football extends Game {

	@Override
	public void initialize() {
		System.out.println("Football game initialized.");
	}

	@Override
	public void startPlay() {
		System.out.println("Football started.");
	}

	@Override
	public void endPlay() {
		System.out.println("Football ends.");
	}

}
