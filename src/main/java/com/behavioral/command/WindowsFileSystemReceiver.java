package com.behavioral.command;

public class WindowsFileSystemReceiver implements FileSystem {

	@Override
	public void openFile() {
		System.out.println("Opening file in Windows.");
	}

	@Override
	public void writeFile() {
		System.out.println("Writing file in Windows.");
	}

	@Override
	public void closeFile() {
		System.out.println("Closing file in Windows.");
	}

}
