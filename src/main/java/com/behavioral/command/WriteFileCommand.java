package com.behavioral.command;

public class WriteFileCommand implements Command {

	FileSystem fileSystem;

	public WriteFileCommand(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		fileSystem.writeFile();
	}

}
