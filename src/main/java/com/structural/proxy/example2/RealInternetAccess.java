package com.structural.proxy.example2;

public class RealInternetAccess implements OfficeInternetAccess {

	String employeeName;

	public RealInternetAccess(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {
		System.out.println("Internet access is granted for employee : "
				+ employeeName);
	}

}
