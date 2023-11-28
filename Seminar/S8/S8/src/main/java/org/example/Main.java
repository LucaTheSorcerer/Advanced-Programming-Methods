package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of worker threads: ");
        int numThreads = scanner.nextInt();

        Queue<Integer> inputQueue = new LinkedList<>();
        Queue<Integer> outputQueue = new LinkedList<>();

        List<WorkerThreadQueue> threads = ThreadManager.createAndStartWorkedThread(numThreads, inputQueue, outputQueue);

        Thread resultThread = ThreadManager.createAndStartResultThread(outputQueue);

        ThreadManager.enqueueNumbers(inputQueue);

        scanner.close();

        //use the IntentioanRaceCondition class


    }
}