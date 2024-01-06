package com.java.multithreading.synchronization;

public class SBIBankSynchronization {

	private int balance;

	public SBIBankSynchronization(int balance) {
		this.balance = balance;
	}

	// if the write a satatic method that is called class lock
	// if we write instance method that is called object lock
	// with synchronization
//	public void deposite(int withdraw) {
//		this.balance=balance-withdraw;
//		System.out.println("wiuthdraw" + balance);
//	}
//	
//	public void withdraw(int depositeAmount) {
//		this.balance=balance+depositeAmount;
//		System.out.println("wiuthdraw" + balance);
//	}

	// without synchronization
	synchronized public void deposite(int depositeAmount) {
		this.balance = balance - depositeAmount;
		System.out.println("deposite" + balance);
	}

	synchronized void withdraw(int withdrawAmount) {
		this.balance = balance + withdrawAmount;
		System.out.println("wiuthdraw" + balance);
	}
}
