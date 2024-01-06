package com.java.multithreading.synchronization;

public class SharedResourceAsSynchroinizationExample {
	private static int counter = 0;
	
	public static void main(String[] args) {
		
		
		Thread thread1 = new Thread( () -> {
				
			for(int i=0;i<1000;i++) {	
				counter++;
			}
				
		});
		
		Thread thread2 = new Thread( () -> {
			
			for(int i=0;i<1000;i++) {	
				counter++;
			}
				
		});
		
		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
			
		} catch(InterruptedException e)
		{				
			e.printStackTrace();
		}
		
		System.out.println("FINAL COUNTER " + counter);
	}
	
//	when i run for 1 : 2000
//		when i run for 2 : 974 inconstitance results
		

}
