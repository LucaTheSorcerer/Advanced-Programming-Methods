package org.example;

public class AtomicVariableThreadSafety {

    public static void main(String[] args) {
        AtomicCounter atomicCounter = new AtomicCounter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicCounter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                atomicCounter.increment();
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

        System.out.println("Counter value (Atomic Variable): " + atomicCounter.getCounter());
    }
}
