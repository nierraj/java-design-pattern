package com.structural.adaptor.example1;

public class SocketClassAdaptorImpl extends Socket implements SocketAdaptor {

	public Volt get120Volt() {
		return getVolt();
	}

	public Volt get3Volt() {
		Volt volt = getVolt();
		return ConvertVolt(volt, 40);
	}

	public Volt get12Volt() {
		Volt volt = getVolt();
		return ConvertVolt(volt, 10);
	}

	private Volt ConvertVolt(Volt volt, int i) {
		return new Volt(volt.getVolt() / i);
	}

}
