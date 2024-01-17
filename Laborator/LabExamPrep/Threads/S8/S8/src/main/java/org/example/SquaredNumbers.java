package org.example;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class SquaredNumbers implements Runnable{

    private BlockingQueue<Integer> inputQueue;
    private BlockingQueue<Integer> outputQueue;
    private String name;

    public SquaredNumbers(BlockingQueue<Integer> inputQueue, BlockingQueue<Integer> outputQueue, String name) {
        this.inputQueue = inputQueue;
        this.outputQueue = outputQueue;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            while(true) {
                Integer number = inputQueue.take();
                System.out.println(name + " dequed " + number);
                outputQueue.put(number * number);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
