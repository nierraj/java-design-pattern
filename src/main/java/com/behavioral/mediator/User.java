package com.behavioral.mediator;

public class User {

	protected String name;
	protected ChatMediator mediator;

	public User(String name, ChatMediator mediator) {
		super();
		this.name = name;
		this.mediator = mediator;
	}

	public void send(String message) {
		System.out.println(name + ": Sent message=" + message);
		mediator.sendMessage(message, this);
	}

	public void recieve(String message) {
		System.out.println(name + ": Recieve message=" + message);
	}

}
