package com.behavioral.mediator;

public class MediatorPattern {

	public static void main(String[] args) {

		ChatMediator mediator = new ChatMediatorImp();
		User user1 = new User("Neeraj", mediator);
		User user2 = new User("Naman", mediator);
		User user3 = new User("Pranav", mediator);
		User user4 = new User("Paras", mediator);
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		user1.send("Hey, whats up!!");
	}

}
