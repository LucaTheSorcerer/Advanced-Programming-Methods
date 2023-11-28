package org.example;
import java.util.concurrent.Semaphore;


public class SemaphoreCounter {

    private int counter = 0;
    private Semaphore semaphore = new Semaphore(1);

    public void increment() {
        try {
            semaphore.acquire();

            Thread.sleep(10);

            counter++;

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    public int getCounter() {
        return counter;
    }
}
