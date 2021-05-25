package com.behavioral.command;

public class CommandPattern {

	public static void main(String[] args) {

		FileSystem fileSystem = FileSystemRecieverFactory.getFileSystemReciever();
		Command openCommand = new OpenFileCommand(fileSystem);
		FileInvoker openCommandInvoker = new FileInvoker(openCommand);
		openCommandInvoker.execute();

		Command closeCommand = new CloseFileCommand(fileSystem);
		FileInvoker closeCommandInvoker = new FileInvoker(closeCommand);
		closeCommandInvoker.execute();

		Command writeCommand = new WriteFileCommand(fileSystem);
		FileInvoker writeCommandInvoker = new FileInvoker(writeCommand);
		writeCommandInvoker.execute();

	}
}
