package com.java.multithreading.synchronization;

import com.javainterview.oops.SbiBank;

public class ATM  extends Thread{
	private SBIBankSynchronization sbi;

	public ATM(SBIBankSynchronization sbi) {
		
		this.sbi = sbi;
	}
	
	
	@Override
	public void run() {
		sbi.withdraw(3000);
	}
	

}
