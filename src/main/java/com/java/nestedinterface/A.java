package com.java.nestedinterface;


//In Java, an interface can be nested within 
//another interface or class. This means an interface 
//can be defined within the scope of another interface or class. 
//These are known as nested interfaces.

//we can declare the int
public class A {
	
	public interface NestedInterfaceEx{
		 boolean isOdd(int a);
		 
	}

}

class B implements A.NestedInterfaceEx{
  
	@Override
	public boolean isOdd(int a) {
		
		return (a%2==0)?true:false;
	}
	
}
