package com.structural.proxy.example1;

public class ProxyImage implements Image {

	private String fileName;
	private RealImage realImage;

	public ProxyImage(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
