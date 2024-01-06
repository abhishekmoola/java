package com.java.multithreading.synchronization;

public class GooglePay extends Thread{
	
	private SBIBankSynchronization sbi;

	public GooglePay(SBIBankSynchronization sbi) {
		super();
		this.sbi = sbi;
	}
	
	@Override
	public void run() {
		sbi.deposite(10000);
	}

}
