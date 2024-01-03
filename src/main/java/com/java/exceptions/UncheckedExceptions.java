package com.java.exceptions;

public class UncheckedExceptions {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		try {
			int c = a/b;
			//throw new Exception("hello");
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getStackTrace());
			//throw new ArithmeticException("exception");
		} catch(Exception e) {
			System.out.println("exception");
		}
		finally {
			//do operations
			System.out.println("handled in final, block");
		}
		
	}
}
