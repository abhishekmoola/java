package com.java.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionsExample {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("text.txt");
		FileReader rd = null;
		try {
			rd= new FileReader(file);
		} catch(FileNotFoundException fileNotFoundException) {
			 System.out.println("HELLO");
			//throw new FileNotFoundException();
		} 
		System.out.println("TEST");
		
	}
	

}
