package org.example;

public class SemaphoreImplementation {


    public static void main(String[] args) {
        SemaphoreCounter semaphoreCounter = new SemaphoreCounter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                semaphoreCounter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                semaphoreCounter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Counter value (Semaphore): " + semaphoreCounter.getCounter());
    }
}
