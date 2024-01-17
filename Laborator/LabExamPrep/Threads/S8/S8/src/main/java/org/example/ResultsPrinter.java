package org.example;

import java.util.concurrent.BlockingQueue;

public class ResultsPrinter implements Runnable{
    private BlockingQueue<Integer> outputQueue;

    public ResultsPrinter(BlockingQueue<Integer> outputQueue) {
        this.outputQueue = outputQueue;
    }

    @Override
    public void run() {
        try {
            while(true) {
                Integer result = outputQueue.take();
                System.out.println("Result: " + result);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
