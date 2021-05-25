package com.behavioral.chainofresponsibility;

import java.util.Scanner;

public class ChainofResponsibilityPattern {

	DispenseChain c1;

	public ChainofResponsibilityPattern() {

		c1 = new Dollar50Dispenser();
		DispenseChain c2 = new Dollar20Dispenser();
		DispenseChain c3 = new Dollar10Dispenser();
		c1.setNextChain(c2);
		c2.setNextChain(c3);

	}

	public static void main(String[] args) {

		ChainofResponsibilityPattern pattern = new ChainofResponsibilityPattern();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter amount : ");
		int amount = input.nextInt();
		input.close();
		if (amount % 10 != 0) {
			System.out.println("Amount should be in multiple of 10.");
		} else {
			pattern.c1.dispense(new Currency(amount));
		}

	}

}
