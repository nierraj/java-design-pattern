package com.creational.factory.example1;

public class PC extends Computer {

	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
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
