package com.javainterview.oops;

public class AbstractClassTest extends AbstractClassTopic{
    
	int testInheritance() {
		return 4;
	}
	@Override
	String test() {
		
		return "overide the abstract method";
	}
	
	@Override
	void normalMethod() {
		System.out.println("overide abstract normal method");
	}
	

}

