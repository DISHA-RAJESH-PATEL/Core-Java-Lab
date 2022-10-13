package com.labtest;

public class Account {

	private int balance = 2000;

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {

		balance = balance - amount;
	}
}
