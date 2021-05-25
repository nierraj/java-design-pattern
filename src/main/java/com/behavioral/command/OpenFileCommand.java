package com.behavioral.command;

public class OpenFileCommand implements Command {

	FileSystem fileSystem;

	public OpenFileCommand(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		fileSystem.openFile();
	}

}
