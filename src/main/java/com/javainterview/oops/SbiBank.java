package com.javainterview.oops;

public class SbiBank extends RbiBank{
	
	public int intrest = 1;
	public int loans = 50000;
	
	public SbiBank() {
		
	}

	public SbiBank(int intrest, int loans, String rule) {
		
		super(rule); // super key word use to refernce the parent class varibles and objects in child class
		System.out.println(super.rule);// we can use super key word to print parent class varables not child class variable
		this.intrest = intrest;
		this.loans = loans;
		System.out.println(intrest+"Intrest"+"-----"+loans+"loans"+"----"+rule+"rule");
	}
	
	public void checkIntrestOfTheBank() {
		
	}

	
	
	

}
