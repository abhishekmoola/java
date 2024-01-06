package com.java.multithreading;

public class SumCalculationWithThreads {
    static int totalSum = 0;

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        final int chunkSize = 50;
        Thread[] threads = new Thread[10]; // Creating 10 threads for parallel computation

        for (int i = 0; i < 10; i++) {
            final int start = i * chunkSize + 2;
            final int end = (i + 1) * chunkSize + 1;
            
            threads[i] = new Thread(() -> {
                int partialSum = 0;
                for (int j = start; j <= end; j++) {
                    partialSum += j;
                }
                synchronized (SumCalculationWithThreads.class) {
                    totalSum += partialSum;
                }
            });
            threads[i].start();
        }

        // Wait for all threads to complete
        for (Thread thread : threads) {
            thread.join();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total Sum: " + totalSum);
        System.out.println("Execution time with multithreading: " + (endTime - startTime) + " milliseconds");
    }
}

