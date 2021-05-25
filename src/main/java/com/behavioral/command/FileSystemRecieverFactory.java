package com.behavioral.command;

public class FileSystemRecieverFactory {

	public static FileSystem getFileSystemReciever() {

		String os = System.getProperty("os.name");
		System.out.println(os);
		if (os.contains("Windows")) {
			return new WindowsFileSystemReceiver();
		} else {
			return new UnixFileSystemReceiver();
		}
	}

}
