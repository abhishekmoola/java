package com.java.multithreading.synchronization;

public class MainSynchronization {
public static void main(String[] args) {
	
	
	SBIBankSynchronization saddamAccount = new SBIBankSynchronization(7000);
	
	ATM  atmThread = new ATM(saddamAccount);
	GooglePay gpThread = new GooglePay(saddamAccount);
	
	atmThread.setName("ATM");
	gpThread.setName("gp");
	atmThread.start();
	gpThread.start();
	
}
}
