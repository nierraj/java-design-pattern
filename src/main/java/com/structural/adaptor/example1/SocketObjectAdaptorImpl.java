package com.structural.adaptor.example1;

public class SocketObjectAdaptorImpl implements SocketAdaptor {

	private Socket socket = new Socket();

	public Volt get120Volt() {
		return socket.getVolt();
	}

	public Volt get3Volt() {
		Volt volt = socket.getVolt();
		return Convert(volt, 40);
	}

	public Volt get12Volt() {
		Volt volt = socket.getVolt();
		return Convert(volt, 10);
	}

	private Volt Convert(Volt volt, int i) {
		return new Volt(volt.getVolt() / i);
	}

}
