package com.java.multithreading.synchronization;

public class MainWaitNotifyExample {
    public static void main(String[] args) {
    	ThredCommunication sharedResource = new ThredCommunication();

        // Producer thread
        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.produceData();
            }
        });

        // Consumer thread
        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.consumeData();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}