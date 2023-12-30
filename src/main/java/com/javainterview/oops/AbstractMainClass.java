package com.javainterview.oops;

public class AbstractMainClass {
	public static void main(String[] args) {
		AbstractClassTest test = new AbstractClassTest();
		test.normalMethod();
		System.out.println(test.test());
	}
	
	public class CheckMulipleInheritanceForAbstractClass extends AbstractClassTest{
		
	}
	
	public class InTest extends AbstractClassTopic{

		@Override
		String test() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
