package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadManager {

    private final static Logger LOGGER = Logger.getLogger(WorkerThreadQueue.class.getName());


    public static List<WorkerThreadQueue>  createAndStartWorkedThread(int numThreads, Queue<Integer> inputQueue, Queue<Integer> outputQueue) {
        List<WorkerThreadQueue> threads = new LinkedList<>();
        for(int i = 0; i < numThreads; i++) {
            WorkerThreadQueue thread = new WorkerThreadQueue(inputQueue, outputQueue);
            thread.start();
            threads.add(thread);
        }

        return threads;
    }

    public static Thread createAndStartResultThread(Queue<Integer> outputQueue) {
        Thread resultThread = new Thread(() -> {
            while(true) {
                synchronized (outputQueue) {
                    while(outputQueue.isEmpty()) {
                        try {
                            outputQueue.wait();
                        } catch (InterruptedException e) {
                            LOGGER.log(Level.SEVERE, "Exception with output queue: " + e.getMessage(), e);

                        }
                    }
                    System.out.println("Result: " + outputQueue.poll());
                }
            }
        });
        resultThread.start();
        return resultThread;
    }

    public static void enqueueNumbers(Queue<Integer> inputQueue) {
        for(int i = 1; i <= 10; i++) {
            synchronized (inputQueue) {
                inputQueue.add(i);
                inputQueue.notify();
            }
        }
    }
}
