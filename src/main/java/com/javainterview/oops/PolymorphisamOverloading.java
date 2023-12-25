package com.javainterview.oops;
// poly means many , phisam many ways to represent
// polymorphisam is process of manuplating the one entity in many ways
//polymorphism can achive by using 2 ways
//1.By using Compile time polymorphisam ( it will check at compile time)
   // we can achieve Compile Time poymorphism by using Method Overloading

   // Method overloading 
  // Method loading is define when we have class with same method name and with diffrent Arguments and return type is called Method Overloading
  // Compiler will check in compile Time which method and type
  // Ex : Multiple Constructors in java

public class PolymorphisamOverloading {
	
	//same method with different args
	int add(int a , int b) {
		return a+b;
	}
	
	int add(int b , int a, int c){
		return a+b+c;
	}
	//by changing return type and args different
	double add(double a , double b) {
		return a+b;
	}
	
	// changing order type
	
	void add(int a , String b) {
		System.out.println("order not changed");
	}
	
	void add(String a , int b) {
		System.out.println("order changed");
	}
	

	public static void main (String[] args) {
		PolymorphisamOverloading obj = new PolymorphisamOverloading();
		obj.add(1, 2);
		System.out.println(obj.add(1, 2));
		obj.add(2, 3);
		System.out.println(obj.add(2, 3));
		obj.add(1, "test");
		//obj.add(1, 2,3,4);// throw an complie time error bcz we don't have method it will check at compile time
	
 }

}
