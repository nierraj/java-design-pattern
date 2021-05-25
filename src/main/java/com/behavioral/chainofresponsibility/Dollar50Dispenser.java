package com.behavioral.chainofresponsibility;

public class Dollar50Dispenser implements DispenseChain {

	private DispenseChain chain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {

		if (cur.getAmount() >= 50) {

			int num = cur.getAmount() / 50;
			int remainder = cur.getAmount() % 50;
			System.out.println("Dispening " + num + "$50 notes.");
			if (remainder != 0) {
				chain.dispense(new Currency(remainder));
			}

		} else {
			chain.dispense(cur);
		}

	}

}
