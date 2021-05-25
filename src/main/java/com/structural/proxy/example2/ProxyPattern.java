package com.structural.proxy.example2;

public class ProxyPattern {
	public static void main(String[] args) {

		OfficeInternetAccess access = new ProxyInternetAccess("Unkown");
		access.grantInternetAccess();
		
		OfficeInternetAccess access1 = new RealInternetAccess("Neeraj");
		access1.grantInternetAccess();
	}

}
