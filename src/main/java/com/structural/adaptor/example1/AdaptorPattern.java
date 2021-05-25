package com.structural.adaptor.example1;

public class AdaptorPattern {

	public static void main(String[] args) {

		testClassAdaptor();
		testObjectAdaptor();

	}

	private static void testObjectAdaptor() {

		SocketAdaptor socketAdaptor = new SocketObjectAdaptorImpl();
		Volt v3 = getVolt(socketAdaptor, 3);
		Volt v12 = getVolt(socketAdaptor, 12);
		Volt v120 = getVolt(socketAdaptor, 120);
		System.out.println("V3 volt using object Adaptor : " + v3.getVolt());
		System.out.println("V12 volt using object Adaptor : " + v12.getVolt());
		System.out
				.println("V120 volt using object Adaptor : " + v120.getVolt());
	}

	private static void testClassAdaptor() {

		SocketAdaptor socketAdaptor = new SocketClassAdaptorImpl();
		Volt v3 = getVolt(socketAdaptor, 3);
		Volt v12 = getVolt(socketAdaptor, 12);
		Volt v120 = getVolt(socketAdaptor, 120);
		System.out.println("V3 volt using class Adaptor : " + v3.getVolt());
		System.out.println("V12 volt using class Adaptor : " + v12.getVolt());
		System.out.println("V120 volt using class Adaptor : " + v120.getVolt());
	}

	private static Volt getVolt(SocketAdaptor socketAdaptor, int i) {

		Volt volt = null;

		switch (i) {
		case 3:
			volt = socketAdaptor.get3Volt();
			break;
		case 12:
			volt = socketAdaptor.get12Volt();
			break;
		case 120:
			volt = socketAdaptor.get120Volt();
			break;
		}

		return volt;
	}
}
