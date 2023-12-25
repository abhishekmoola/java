package com.java.accessmodifieroustidepackage;

import com.java.accessmodifier.AccessModifier;

public class OutsidePackage extends AccessModifier {
public OutsidePackage(int age, String name, double salary, String company) {
		super(age, name, salary, company);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
	
////protected scenario outside package with subclass
//	AccessModifier out = new AccessModifier(0, null, 0, null);
//String name = out.name;
	
	// we can acces thgrough subclass
	OutsidePackage ot = new OutsidePackage(0, null, 0, null);
	System.out.println(ot.name);

}
}
