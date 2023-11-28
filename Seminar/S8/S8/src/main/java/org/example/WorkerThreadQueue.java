package org.example;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WorkerThreadQueue extends Thread {

    private final Queue<Integer> inputQueue;
    private final Queue<Integer> outputQueue;

    private final static Logger LOGGER = Logger.getLogger(WorkerThreadQueue.class.getName());

    public WorkerThreadQueue(Queue<Integer> inputQueue, Queue<Integer> outputQueue) {
        this.inputQueue = inputQueue;
        this.outputQueue = outputQueue;
    }

    @Override
    public void run() {
        while(true) {
            int number;
            synchronized (inputQueue) {
                while(inputQueue.isEmpty()) {
                    try {
                        inputQueue.wait();
                    } catch(InterruptedException e) {
                        LOGGER.log(Level.SEVERE, "Exception while waiting for queue: " + e.getMessage(), e);
                    }
                }

                number = inputQueue.poll();
                System.out.println(Thread.currentThread().getName() + " dequed " + number);
            }

            int result = number * number;

            synchronized (outputQueue) {
                outputQueue.add(result);
                outputQueue.notify();
            }
        }
    }
}
