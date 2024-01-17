package org.example;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MainWorkerThreads {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of threads:");
        int numWorker = scanner.nextInt();

        BlockingQueue<Integer> inputQueue = new LinkedBlockingQueue<>();
        BlockingQueue<Integer> outputQueue = new LinkedBlockingQueue<>();

        for(int i = 0; i < numWorker; i++) {
            new Thread(new SquaredNumbers(inputQueue, outputQueue, "Thread-" + i)).start();
        }

        new Thread(new ResultsPrinter(outputQueue)).start();

        for(int i = 1; i <= 10; i++) {
            try {
                inputQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
