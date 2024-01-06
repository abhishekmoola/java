package com.java.multithreading.synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

    public static void main(String[] args) {
        int numberOfTasks = 10;
        
        // using thread pool
        ExecutorService executor = Executors.newFixedThreadPool(5); // Create a thread pool of size 5

        for (int i = 0; i < numberOfTasks; i++) {
            Runnable task = new MyTask(i);
            executor.execute(task); // Submit tasks to the thread pool for execution
        }

        executor.shutdown(); // Shutdown the executor service after tasks are completed
    }
}

class MyTask implements Runnable {
    private final int taskId;

    MyTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task ID: " + taskId + " is being executed by thread: " + Thread.currentThread().getName());
        // Perform task execution logic here
    }
}

