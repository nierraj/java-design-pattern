package com.structural.proxy.example2;

public class ProxyInternetAccess implements OfficeInternetAccess {

	private String employeeName;
	private RealInternetAccess realInternetAccess;

	public ProxyInternetAccess(String employeeName) {
		super();
		this.employeeName = employeeName;
	}

	@Override
	public void grantInternetAccess() {

		if (getRole() > 4) {
			realInternetAccess = new RealInternetAccess(employeeName);
			realInternetAccess.grantInternetAccess();
		} else {
			System.out.println("No internet access granted.");
		}

	}

	private int getRole() {
		return 3;
	}

}
