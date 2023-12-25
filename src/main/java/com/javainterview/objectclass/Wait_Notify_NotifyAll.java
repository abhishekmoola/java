/*package com.javainterview.objectclass;

import java.util.Iterator;

import org.springframework.scheduling.config.Task;

public class Wait_Notify_NotifyAll {
public static void main(String[] args) throws InterruptedException {
	Task t = new Task();
	t.start();
	synchronized (t) {
		System.out.println("HELLO");
		t.wait(1000);
	}
}
	class Task extends Thread{
	@Override
	public void run() {
		synchronized(this) {
			for(int i=0;i<10;i++){
				System.out.println(i);
				System.out.println("waiting 2s");
				try {
					wait(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("waiting 2s completed");
			this.notifyAll();
			}
		}
	}
	}
	}
		
	
*/