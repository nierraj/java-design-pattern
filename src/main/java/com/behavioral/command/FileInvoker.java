package com.behavioral.command;

public class FileInvoker {

	Command command;

	public FileInvoker(Command command) {

		this.command = command;

	}

	public void execute() {
		command.execute();
	}

}
