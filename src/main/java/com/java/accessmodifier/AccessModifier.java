package com.java.accessmodifier;

public class AccessModifier {
// public we can access any  where in the the project 
public int age;

// protected : we can access witgh in thge packge
//we can access outside the package weth subclass
protected String name;

// default  ; we can access only with in the pckg only.
 double salary;
 
 // private : we can acces only with in tyhe class only.
 // how we can access oyside the priavte variable?
 // we can acces through setters and getters
 
 private String company;
 
 

public AccessModifier(int age, String name, double salary, String company) {
	super();
	this.age = age;
	this.name = name;
	this.salary = salary;
	this.company = company;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}



public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public String getCompany() {
	return company;
}

public void setCompany(String company) {
	this.company = company;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
 
 
 
}

