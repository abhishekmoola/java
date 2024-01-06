package com.java.multithreading.synchronization;

public class ThredCommunication {
	boolean isDataAvailable = false;

    synchronized void produceData() {
        while (isDataAvailable) {
            try {
                wait(); // Producer waits if data is available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Producing data...");
        isDataAvailable = true;
        notify(); // Notify consumer that data is available
    }

    synchronized void consumeData() {
        while (!isDataAvailable) {
            try {
                wait(); // Consumer waits if data is not available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consuming data...");
        isDataAvailable = false;
        notify(); // Notify producer that data has been consumed
    }
}



