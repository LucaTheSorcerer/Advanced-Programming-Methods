package org.example;

public class IntentionalRaceCondition {

    public static void main(String[] args) throws InterruptedException {
        SharedCounter sharedCounter = new SharedCounter();

        Thread thread1 = new Thread( () -> {
            for(int i = 0; i < 1000; i++) {
                sharedCounter.increment();
            }
        });

        Thread thread2 = new Thread( () -> {
            for(int i = 0; i < 1000; i++) {
                sharedCounter.increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter value (Intentional Race Condition): " + sharedCounter);
    }
}
