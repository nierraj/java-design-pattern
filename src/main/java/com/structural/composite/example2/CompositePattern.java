package com.structural.composite.example2;

public class CompositePattern {

	public static void main(String[] args) {
		Employee CEO = new Employee("John", "CEO", 30000);

		Employee headSales = new Employee("Robert", "Head Sales", 20000);

		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);

		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);

		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);
		CEO.add(headSales);
		CEO.add(headMarketing);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		System.out.println(CEO);

		for (Employee headEmployees : CEO.getSubordinates()) {
			System.out.println(headEmployees);
			for (Employee workers : headEmployees.getSubordinates()) {
				System.out.println(workers);
			}
		}

	}
}
