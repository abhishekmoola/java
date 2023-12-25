package com.java.accessmodifier;

public class SubClassAccessModifier {
	public static void main(String[] args) {
		AccessModifier access = new AccessModifier(0, "name", 0, "company");
	//public 
	System.out.println(access.age+"AGE");
	
	//protected
	System.out.println(access.name + "name");
	
	//default
	System.out.println(access.salary);
	
	//private we can't access with directly in ouside the class bcz it is decleraed as priavet
	//System.out.println(access.company);
	System.out.println(access.getCompany()+"private");
	
	}
	
}
