package com.javainterview.oops;

/*byte: 8-bit signed integer data type. Range: -128 to 127.
short: 16-bit signed integer data type. Range: -32,768 to 32,767.
int: 32-bit signed integer data type. Range: -2^31 to 2^31-1.
long: 64-bit signed integer data type. Range: -2^63 to 2^63-1.
float: 32-bit floating-point data type for decimal numbers.
double: 64-bit floating-point data type for more precise decimal numbers.
Boolean Data Type:

boolean: Represents true or false values.
Character Data Type:

char: Represents a sing*/
public class DataTypes {
	//byte id 8 bit
static byte age = 12;
static byte number = -127;
//short 16bit
static short ht=32767;
//int 32bit 
static int account = 123456789;
static double myDouble = 3.7;
boolean myBoolean = true;
char myChar = 'A';
float myFloat = 3.14f;
//long 64 bit
static long moreValues = 12134564564788L;
public static void main(String[] args) {
	System.out.println(age);
	System.out.println(number);
	System.out.println(ht);
	System.out.println(myDouble);
}
}
