package org.example;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {

    private AtomicInteger counter = new AtomicInteger(0);

    public void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        counter.incrementAndGet();
    }

    public int getCounter() {
        return counter.get();
    }
}
