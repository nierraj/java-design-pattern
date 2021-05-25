package com.behavioral.command;

public class CloseFileCommand implements Command {

	FileSystem fileSystem;

	public CloseFileCommand(FileSystem fileSystem) {
		this.fileSystem = fileSystem;
	}

	@Override
	public void execute() {
		fileSystem.closeFile();
	}

}
