package com.javainterview.oops;

public class MainClass {
	public static void main(String[] args) {
		//SbiBank sbiBank = new SbiBank(1,2,"rule1");
		
		RbiBank rbiBank = new SbiBank(1,2,"rule1");
		System.out.println(rbiBank.rule+"parent class varible");// we can referencethe partaent class obj to child class but w can't acces child class varibles we can acces parent class varibles only 
		
		//SbiBank sbiBank = new RBIBank();// we can't reference child class obj to parentr class obj
		
		
	}

}
