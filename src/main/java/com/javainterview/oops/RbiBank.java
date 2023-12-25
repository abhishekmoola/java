package com.javainterview.oops;

public class RbiBank {

	public String rule = "Give loans up to 2lakhs";
	
	RbiBank(){
		
	}
	
	RbiBank(String rule){
		// this key word can refernce the current class varaibles
		this.rule=rule;
	}
	
	
}
