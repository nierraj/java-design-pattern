package com.behavioral.mediator;

public interface ChatMediator {

	public void addUser(User user);

	public void sendMessage(String message, User user);

}
