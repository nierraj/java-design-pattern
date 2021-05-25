package com.structural.facade.example2;

import java.sql.Connection;

public class MySqlHelper {

	public static Connection getMySqlDBConnection() {
		return null;
	}

	public void generateMySqlPDFReport(String tableName, Connection con) {
		System.out.println("MySql PDF Report");
	}

	public void generateMySqlHTMLReport(String tableName, Connection con) {
		System.out.println("MySql HTML Report");
	}
}