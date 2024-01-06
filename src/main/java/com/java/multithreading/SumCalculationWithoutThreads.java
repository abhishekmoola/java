package com.java.multithreading;


public class SumCalculationWithoutThreads {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int sum = 0;
        for (int i = 2; i <= 500; i++) {
            sum += i;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Sum: " + sum);
        System.out.println("Execution time without multithreading: " + (endTime - startTime) + " milliseconds");
    }
}

