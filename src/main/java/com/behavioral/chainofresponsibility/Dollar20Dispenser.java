package com.behavioral.chainofresponsibility;

public class Dollar20Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {

		if (cur.getAmount() >= 20) {
			int num = cur.getAmount() / 20;
			int remainder = cur.getAmount() % 20;
			System.out.println("Dispensing " + num + " $20 notes.");
			if (remainder != 0) {
				chain.dispense(new Currency(remainder));
			}
		} else {
			chain.dispense(cur);
		}

	}

}
