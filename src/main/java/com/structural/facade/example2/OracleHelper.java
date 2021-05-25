package com.structural.facade.example2;

import java.sql.Connection;

public class OracleHelper {

	public static Connection getOracleDBConnection() {
		return null;
	}

	public void generateOraclePDFReport(String tableName, Connection con) {
		System.out.println("Oracle PDF Report");
	}

	public void generateOracleHTMLReport(String tableName, Connection con) {
		System.out.println("Oracle HTML Report");
	}

}