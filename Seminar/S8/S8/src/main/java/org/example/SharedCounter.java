package org.example;

public class SharedCounter {

    private int counter = 0;

    public void increment() {
        int currentValue = counter;

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        counter = currentValue + 1;
    }

    public int getCounter() {
        return counter;
    }
}
