package com.creational.abstractfactory.example1;

public class Server extends Computer {

	private String ram;
	private String cpu;
	private String hdd;

	public Server(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	public String getRAM() {
		return ram;
	}

	public String getHDD() {
		return hdd;
	}

	public String getCPU() {
		return cpu;
	}

}
