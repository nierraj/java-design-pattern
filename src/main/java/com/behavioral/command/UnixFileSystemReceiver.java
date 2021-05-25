package com.behavioral.command;

public class UnixFileSystemReceiver implements FileSystem {

	@Override
	public void openFile() {
		System.out.println("Opening file in Unix.");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in Unix.");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in Unix.");
	}

}
