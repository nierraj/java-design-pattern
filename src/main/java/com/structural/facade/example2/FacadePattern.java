package com.structural.facade.example2;

public class FacadePattern {

	public static void main(String[] args) {
		String tableName = "student";
		Facade.generateReport(Facade.Database.MYSQL, Facade.Report.HTML, tableName);
		Facade.generateReport(Facade.Database.ORACLE, Facade.Report.PDF, tableName);

	}

}
