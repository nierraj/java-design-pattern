package com.structural.facade.example2;

import java.sql.Connection;

public class Facade {

	public enum Database {
		MYSQL, ORACLE
	}

	public enum Report {
		HTML, PDF
	}

	public static void generateReport(Database databaseType, Report reportType, String tableName) {

		Connection con = null;

		switch (databaseType) {

		case MYSQL:

			con = MySqlHelper.getMySqlDBConnection();
			MySqlHelper mySqlHelper = new MySqlHelper();

			switch (reportType) {

			case HTML:
				mySqlHelper.generateMySqlHTMLReport(tableName, con);
				break;
			case PDF:
				mySqlHelper.generateMySqlPDFReport(tableName, con);
				break;
			default:
				System.out.println("Invalid Report type.");
			}

			break;
		case ORACLE:
			con = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();

			switch (reportType) {
			case HTML:
				oracleHelper.generateOracleHTMLReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generateOraclePDFReport(tableName, con);
				break;
			default:
				System.out.println("Invalid Report type.");
			}

			break;
		default:
			System.out.println("Invalid Database type.");
		}

	}

}
