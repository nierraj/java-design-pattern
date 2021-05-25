package com.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImp implements ChatMediator {

	private List<User> users;

	public ChatMediatorImp() {
		users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String message, User user) {
		for (User u : users) {
			if (u != user) {
				u.recieve(message);
			}
		}
	}

}
